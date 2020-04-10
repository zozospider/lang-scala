package chapter04

import scala.util.control.Breaks
import scala.util.control.Breaks._

object For {

  def main(args: Array[String]): Unit = {

    for (i <- 0 until 5) {
      print(i)
    }
    println()
    for (i <- Range(0, 5)) {
      print(i)
    }
    println()

    println("---")

    for (i <- 0 to 4) {
      print(i)
    }
    println()
    for (i <- Range.inclusive(0, 4)) {
      print(i)
    }
    println()

    println("------")

    for (i <- 0 until 5 if i != 2) {
      print(i)
    }
    println()

    for (i <- 0 until 5 if i < 2 || i > 2) {
      print(i)
    }
    println()

    println("------")

    for (i <- 0 until(5, 2)) {
      print(i)
    }
    println()
    for (i <- Range(0, 5, 2)) {
      print(i)
    }
    println()

    println("---")

    for (i <- 0 to(4, 2)) {
      print(i)
    }
    println()
    for (i <- Range.inclusive(0, 4, 2)) {
      print(i)
    }
    println()

    println("------")

    for (i <- 0 until 3; j = 10 * i) {
      print(s"$i $j")
      if (i != 2) print(" | ")
    }
    println()

    for {i <- 0 until 3
         j = 10 * i} {
      print(s"$i $j")
      if (i != 2) print(" | ")
    }
    println()

    println("------")

    for (i <- 0 until 3) {
      for (j <- 0 until 2) {
        print(s"$i $j")
        if (j != 1) print(", ")
        else if (i != 2) print(" | ")
      }
    }
    println()

    for (i <- 0 until 3; j <- 0 until 2) {
      print(s"$i $j")
      if (j != 1) print(", ")
      else if (i != 2) print(" | ")
    }
    println()

    println("------")

    /*
       *
      ***
     *****
    *******
     */
    for (i <- 1 to 4) {
      for (_ <- 1 to (4 - i)) {
        print(" ")
      }
      for (_ <- 0 until (2 * i - 1)) {
        print("*")
      }
      println()
    }

    println("------")

    // for 循环默认返回值为 Unit
    val unit: Unit = for (i <- 0 until 5) {
      2 * i
    }
    println(unit.getClass.getName)
    println(unit)

    // yield 返回集合
    val vector = for (i <- 0 until 5) yield 2 * i
    println(vector.getClass.getName)
    println(vector)

    println("------")

    Breaks.breakable {
      for (i <- 1 to 5) {
        if (i == 3) {
          Breaks.break()
        }
        print(s"$i")
      }
    }
    println()

    breakable {
      for (i <- 1 to 5) {
        if (i == 3) {
          break()
        }
        print(s"$i")
      }
    }
    println()

    breakable {
      for (i <- 1 to 5) {
        if (i == 3) {
          break
        }
        print(s"$i")
      }
    }
    println()

    println("------")
  }

}
