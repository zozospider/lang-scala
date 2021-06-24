package chapter04

object Process {

  def main(args: Array[String]): Unit = {
    // a()
  }

  def a(): Unit = {
    val flag = true
    if (flag) {
      println("a")
    }

    if (!flag) {
      println("1")
    } else {
      println("2")
    }

    val a: String = "a"
    println(a == "a")
    println(a.equals("a"))

    if (a.equals("a")) {
      println("aa")
    } else if (a.equals("b")) {
      println("bb")
    } else {
      println("cc")
    }
  }

}
