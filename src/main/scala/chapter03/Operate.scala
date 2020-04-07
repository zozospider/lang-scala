package chapter03

object Operate {

  def main(args: Array[String]): Unit = {

    // 为了避免产生歧义 (如 i = i++), Scala 中没有 ++ 运算符
    var i = 0

    i = i + 1
    println(s"i = $i")

    i += 1
    println(s"i = $i")

    println("------")

    if (i == 2) {
      println("i == 2")
    } else {
      println("!(i == 2)")
    }
    val boolean: Boolean  = i == 2
    if (boolean) {
      println("true")
    } else {
      println("false")
    }
  }

}
