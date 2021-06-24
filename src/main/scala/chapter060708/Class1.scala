package chapter060708

object Class1 {
  def main(args: Array[String]): Unit = {
    val user11: User11 = new User11("u11")
    println("------")
    val user111b: User111 = new User111()
    println("---")
    val user111a: User111 = new User111("u111")
  }
}

class Person11(s: String) {
  println(s"Person11, s: $s")
}

class User11 extends Person11("pp") {
  println("User11")
  def this(s: String) {
    this()
    println("User11 this(s: String)")
  }
}

class User111(s: String) extends Person11(s) {
  println(s"User111, s: $s")
  def this() {
    this("wow")
    println("User111 this()")
  }
}
