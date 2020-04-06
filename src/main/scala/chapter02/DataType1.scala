package chapter02

// 数据类型: 类型转换
object DataType1 {

  def main(args: Array[String]): Unit = {

    // 值类型转换:
    // 1. 有多种类型的数据混合运算时, 系统首先自动将所有数据转换成容量最大的那种数据类型, 然后再进行计算
    // 2. 当我们把精度 (容量) 大的数据类型赋值给精度 (容量) 小的数据类型时, 就会报错, 反之就会进行自动类型转换
    // 3. (byte / short) 和 Char 之间不会相互自动转换
    // 4. byte, short, char 三者可以计算 (如求和), 计算时首先转换成 int 类型
    // 5. 自动提升原则: 表达式结果的类型自动提升为操作数中最大的类型
    val int1: Int = 10
    val double1a: Double = int1
    val double1b = int1.toDouble
    println(s"double1a = $double1a, double1b = $double1b")

    println("------")

    val number2a: Int = 10 * 1.5.toInt + 2 * 1.5.toInt
    val number2b: Int = (10 * 1.5 + 2 * 1.5).toInt
    println(s"number2a = $number2a, number2b = $number2b")

    println("------")

    val string3a = 10 + ""
    val string3b = 10.toString
    val int3 = "10".toInt
    val float3 = "10.5".toFloat
    println(s"string3a = $string3a, string3b = $string3b, int3 = $int3, float3 = $float3")

    println("------")

    // 加法运算会将结果转成 Int 类型, int2, int3 都为 Int 类型
    val byte4: Byte = 10
    val short4: Short = 10
    val int4a = byte4 + short4
    val int4b = 'a' + 1
    println(s"int4a = $int4a, int4b = $int4b, int4a.getClass.getName = ${int4a.getClass.getName}, int4b.getClass.getName = ${int4b.getClass.getName}")
  }

}
