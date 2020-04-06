package chapter02

// 数据类型
object DataType {

  def main(args: Array[String]): Unit = {

    // Scala 是完全面向对象的语言, 数字也是对象

    val byte: Byte = 1
    val short: Short = 1
    val char: Char = 'a'
    val int: Int = 1
    val long: Long = 1L
    val float: Float = 1.0F
    val double: Double = 1.0D
    val boolean: Boolean = true
    val string: String = "str"

    println(s"byte = $byte")
    println(s"short = $short")
    println(s"char = $char")
    println(s"int = $int")
    println(s"long = $long")
    println(s"float = $float")
    println(s"double = $double")
    println(s"boolean = $boolean")
    println(s"string = $string")

    println("------")

    println(s"1.hashCode = ${1.hashCode}")
    println(s"string.hashcode = ${string.hashCode}")

    // Scala 对象分为 AnyVal (值类型) 和 AnyRef (引用类型)

    // - Any (所有其他类的超类)
    //   - AnyVal
    //     - StringOps
    //     - Boolean (true / false)
    //     - Double (64 位, IEEE754 标准的双精度浮点数, 科学计数法表示, -1.7976931348623157E308 ~ 1.7976931348623157E308)
    //       - Float (32 位, IEEE754 标准的双精度浮点数, 科学计数法表示, -3.4028235E38 ~ 3.4028235E38)
    //        - Long (64 位有符号补码整数, -2^63 ~ (2^63 - 1), -9223372036854775808 ~ 9223372036854775807)
    //          - Int (32 位有符号补码整数, -2^31 ~ (2^31 - 1), -2147483648 ~ 2147483647)
    //          - Char (16 位无符号 Unicode 字符, U+0000 ~ U+FFFF)
    //            - Short (16 位有符号补码整数, -2^15 ~ (2^15 - 1), -32768 ~ 32767)
    //              - Byte (8 位有符号补码整数, -2^7 ~ (2^7 - 1), -128 ~ 127)
    //     - Unit (表示无值, 只有一个实例值 {})

    //   - AnyRef (所有引用类的基类)
    //     - Scala Collections
    //     - Other Scala classes
    //     - all Java classes
    //       - Null

    //   - Nothing (任何其他类型的子类)
  }

}
