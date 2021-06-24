package chapter09

object Transform {
  def main(args: Array[String]): Unit = {
    // 自动转换
    // byte -> int -> long
    // child -> parent / trait

    // 隐式转换: 自定义转换规则
    implicit def transform(d: Double): Int = {
      d.toInt + 1
    }
    implicit def transform2(d: Double): String = {
      "str: " + d.toString
    }
    val i: Int = 5.0
    val s: String = 5.0
    println(i)
    println(s)
  }
}
