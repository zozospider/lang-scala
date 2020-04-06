package chapter02

// 标识符
object Name {

  def main(args: Array[String]): Unit = {

    // 首字符为操作符时, 后续字符也必须是操作符 (编译后会将此类特殊操作符转换成特殊字符, 如 ++ 转换成 $plus$plus)
    val ++ = 1
    val +- = 1.0F
    val +-*/ = "a"
    println(s"++ = ${++}, +- = ${+-}, +-*/ = ${+-*/}")

    println("------")

    val ## = 1
    val #@ = 1.0F
    val %#@ = "a"
    println(s"## = ${##}, #@ = ${#@}, %#@ = ${%#@}")

    println("------")

    // scala 中的下划线 _ 可配合组合其他非特殊字符使用, 但是独立字符不能当成变量名来使用 (有特殊的用途)
    val a_ = 1
    val _a = 1.0F
    val _1 = "a"
    println(s"a_ = $a_, _a = ${_a}, _1 = ${_1}")

    println("------")

    val `private` = 1
    val `def` = 1.0F
    val `val` = "a"
    println(s"`private` = ${`private`}, `def` = ${`def`}, `val` = ${`val`}")
  }

}
