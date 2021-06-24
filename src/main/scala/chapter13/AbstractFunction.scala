package chapter13

import scala.annotation.tailrec
import scala.util.control.Breaks
import scala.util.control.Breaks.break

object AbstractFunction {
  def main(args: Array[String]): Unit = {
    a()
    println("------")
    b()
    println("------")
    c()
  }

  def a(): Unit = {
    // 控制抽象

    var n: Int = 10
    Breaks.breakable {
      while (n < 20) {
        n += 1
        if (n == 15) {
          break()
        }
      }
    }
    println(s"n = $n")
  }

  def b(): Unit = {
    // 控制抽象: 不加参数, 就可以传递一段逻辑

    def test(f: => Unit): Unit = {
      f
      println("got it")
    }

    test {
      println("do test")
    }

    println("---")

    def test2(b: => Boolean)(f: => Unit): Unit = {
      f
      println(s"got $b")
    }

    test2(b = true) {
      println("do test2")
    }
  }

  def c(): Unit = {
    // 模拟 while

    var x: Int = 10
    while (x > 0) {
      x -= 1
      print(s"x = $x, ")
    }
    println
    println("---")

    @tailrec
    def myWhile(condition: => Boolean)(f: => Unit): Unit = {
      if (condition) {
        f
        myWhile(condition)(f)
      }
    }

    x = 10
    myWhile(x > 0) {
      x -= 1
      print(s"x = $x, ")
    }
    println
  }

}
