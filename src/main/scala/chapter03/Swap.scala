package chapter03

object Swap {

  def main(args: Array[String]): Unit = {

    // 两个值交换

    var a = 1
    var b = 2
    // 第 1 种方式
    val temp = a
    a = b
    b = temp
    println(s"a = $a, b = $b")

    a = 1
    b = 2
    // 第 2 种方式
    a = a + b
    b = a - b
    a = a - b
    println(s"a = $a, b = $b")

    a = 1
    b = 2
    // 第 3 种方式: 异或运算, 同为 0, 不同为 1
    a = a ^ b
    b = a ^ b
    a = a ^ b
    println(s"a = $a, b = $b")
  }

}
