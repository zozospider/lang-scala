package chapter060708

object Trait1 {
  def main(args: Array[String]): Unit = {
    val user14: User14 = new User14()
    user14.name = "nnn"
    println(user14.name)
    user14.test()
    user14.abf()
  }
}

trait Trait14 {
  println("Trait14")

  var name: String = "nn"

  def test(): Unit = {
    println("test")
  }

  // 抽象方法
  def abf()
}

class Person14 {

}

class User14 extends Person14 with Trait14 {
  override def abf(): Unit = {
    println("User14 abf")
  }
}
