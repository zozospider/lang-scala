package chapter05

object Recursion {

  def main(args: Array[String]): Unit = {
    println(a(5))
  }

  // 5 * 4 * 3 * 2 * 1
  def a(i: Int): Int = {
    if (i == 1) {
      1
    } else {
      i * a(i - 1)
    }
  }

}
