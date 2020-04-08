package chapter04

object Expression {

  def main(args: Array[String]): Unit = {

    val int: Int = if (true) {
      1
    } else {
      2
    }
    println(int.getClass.getName)
    println(int)

    println("------")

    val float: Float = if (true) {
      1
    } else {
      1.0F
    }
    println(float.getClass.getName)
    println(float)

    println("------")

    // TODO
    val flag = false
    val unit = if (flag) {
      1
    }
    println(unit.getClass.getName)

    println("------")

    // TODO
    val unit2 = if (false) {
      "1"
    }
    println(unit2.getClass.getName)
  }

}
