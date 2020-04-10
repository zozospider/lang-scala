package chapter04

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

    for (i <- 0 until 3) {
      for (j <- 0 until 2) {
        print(s"$i $j")
        if (j != 1) print(", ")
      }
      println()
    }

    println("------")

    for (i <- 0 until 3; j = 2 * i) {
      println(s"$i $j")
    }

    println("---")

    for {i <- 0 until 3
         j = 2 * i} {
      println(s"$i $j")
    }

    println("------")

    /*
       *
      ***
     *****
    *******
     */
    for (i <- 1 to 4) {
      for (j <- 1 to (4 - i)) {
        print(" ")
      }
      for (k <- 0 until (2 * i - 1)) {
        print("*")
      }
      println()
    }
  }

}
