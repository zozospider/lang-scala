package chapter060708

object Class {
  def main(args: Array[String]): Unit = {
    val user: User10 = new User10()
    println(user.name)
    println(user.name2)
    println(user.sex)
    println(user.sex2)
    user.test()
    user.abf()

    println("------")

    val person: Person = new User10()
    println(person.name)
    println(person.name2)
    println(person.sex)
    println(person.sex2)
    person.test()
    person.abf()
  }
}

// 父类
abstract class Person {

  var name: String = _

  val name2: String = ""

  // 抽象属性 (class 文件中转变为抽象方法)
  var sex: String

  val sex2: String

  def test(): Unit = {
    println("parent test")
  }

  // 抽象方法
  def abf()
}

// 子类
class User10 extends Person {

  // override var name: String = "child name"

  override val name2: String = "child name2"

  override var sex: String = "child sex"

  override val sex2: String = "child sex2"

  override def test(): Unit = {
    println("child test")
  }

  override def abf(): Unit = {
    println("child abf")
  }

}
