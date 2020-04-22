package chapter04

object If {

  def main(args: Array[String]): Unit = {
    exp(true)
  }

  def exp(flag: Boolean): Unit = {

    // 声明变量 value 类型时使用条件分支中多个返回类型的共同最小父类 (参考类型树)
    // 使用变量时, value.getClass.getName 为满足条件的分支中的返回类型

    println("---Int, Int---")
    val value1: Int = if (flag) {
      1
    } else {
      2
    }
    // int
    println(value1.getClass.getName)
    println(value1)

    println("---Unit, Unit---")
    val value2: Unit = if (flag) {
    }
    // void
    println(value2.getClass.getName)
    println(value2)

    println("---Int, Unit---")
    val value3: AnyVal = if (flag) {
      1
    }
    // java.lang.Integer
    println(value3.getClass.getName)
    println(value3)

    println("---Int, Float---")
    val value4: AnyVal = if (flag) {
      1
    } else {
      1.0F
    }
    // java.lang.Integer
    println(value4.getClass.getName)
    println(value4)

    println("---String, String---")
    val value5: String = if (flag) {
      "a"
    } else {
      "b"
    }
    // java.lang.String
    println(value5.getClass.getName)
    println(value5)

    println("---String, Unit---")
    val value6: Any = if (flag) {
      "a"
    }
    // java.lang.String
    println(value6.getClass.getName)
    println(value6)

    println("---String, Int---")
    val value7: Any = if (flag) {
      "a"
    } else {
      1
    }
    // java.lang.String
    println(value7.getClass.getName)
    println(value7)

    // 你可以组合几个表达式, 并且用 {} 包围起来. 我们称之为代码块 (block). 代码块中最后一个表达式的结果, 也正是整个块的结果
    println("---Int---")
    val value8: Int = {
      val int = 1 + 1
      int + 1
    }
    println(value8.getClass.getName)
    println(value8)
  }

}
