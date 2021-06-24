package chapter05

object Exception {

  def main(args: Array[String]): Unit = {
    a()
  }

  def a(): Unit = {
    try {
      val a = 1 / 0
      println(a)
    } catch {
      case ex: ArithmeticException => println(s"ArithmeticException: $ex")
      case ex: Exception => println(s"Exception: $ex")
    } finally {
      println("finally")
    }
  }

}
