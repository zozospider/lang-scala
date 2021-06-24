package chapter05

object Lazy {

  def main(args: Array[String]): Unit = {
    // val r = a()
    lazy val r = a()
    println("------")
    println("------")
    println("------")
    println("------")
    println(s"r = $r")
  }

  def a(): Int = {
    println("aaa")
    return 1
  }

}
