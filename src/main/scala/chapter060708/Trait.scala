package chapter060708

object Trait {
  def main(args: Array[String]): Unit = {
    val user: User13 = new User13()
    println(user)
  }
}

// 特质
trait Trait13 {
}
// 特质
trait Trait133 {
}
// 父类
class Person13 {
}
// 继承父类, 特质
// class User13 extends Trait13 {
// class User13 extends Trait13 with Trait133 {
class User13 extends Person13 with Trait13 with Trait133 {

}
