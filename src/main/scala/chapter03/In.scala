package chapter03

import scala.io.StdIn

object In {

  def main(args: Array[String]): Unit = {

    println("wait for input line:")
    val line: String = StdIn.readLine()
    println(s"line = $line")

    println("------")

    println("wait for input int:")
    val int: Int = StdIn.readInt()
    println(s"int = $int")
  }

}
