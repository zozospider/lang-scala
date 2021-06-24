package chapter060708

object Trait2 {
  def main(args: Array[String]): Unit = {
    new User15()
    println("------")
    new User155()
  }
}

trait Trait15 {
  println("Trait15")
}
class Person15 {
  println("Person15")
}
class User15 extends Person15 with Trait15 {
  println("User15")
}

trait Trait155 {
  println("Trait155")
}
class Person155 extends Trait155 {
  println("Person155")
}
class User155 extends Person155 with Trait155 {
  println("User155")
}
