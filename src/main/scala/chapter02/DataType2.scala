package chapter02

// 数据类型: Unit, Null, Nothing
object DataType2 {

  def main(args: Array[String]): Unit = {

    // Unit 表示无值, 和其他语言中void等同, 用作不返回任何结果的方法的结果类型. Unit 只有一个实例值, 写成 ()
    val unit5a = Unit
    val unit5b: Unit = Unit
    println(s"unit5a = $unit5a, unit5b = $unit5b")

    println("------")

    // Null 类型只有一个实例值 null
    // null 可以赋值给任意引用类型 (AnyRef), 但是不能赋值给值类型 (AnyVal: Byte, Short, Char, Int, Long, Float, Double, Boolean)
    val nul6 = null
    val null6: Null = null
    val string6: String = null
    print(s"nul6 = $nul6, null6 = $null6, string6 = $string6")
  }

  // Nothing 它是任何其他类型的子类型, 当一个函数, 我们确定它没有正常的返回值, 可以用 Nothing 来指定返回类型
  // 这样做有一个好处, 就是我们可以把返回的值 (异常) 赋给其他的函数或变量 (兼容性)
  def f(): Nothing = {
    throw new Exception
  }

}
