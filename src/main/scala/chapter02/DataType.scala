package chapter02

object DataType {

  def main(args: Array[String]): Unit = {

    // Scala 是完全面向对象的语言, 数字也是对象

    val byte: Byte = 1
    val short: Short = 1
    val char: Char = 'a'
    val int: Int = 1
    val long: Long = 1L
    val float: Float = 1.0f
    val double: Double = 1.0d
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

    // - Any
    //   - AnyVal
    //     - StringOps
    //     - Boolean
    //     - Double (64 位, 数学计数法表示)
    //       - Float (32 位, 数学计数法表示)
    //        - Long (64 位)
    //          - Int (32 位)
    //          - Char (32 位, 无负数)
    //            - Short (16 位)
    //              - Byte (8 位)
    //     - Unit

    //   - AnyRef
    //     - Scala Collections
    //     - Other Scala classes
    //     - all Java classes
    //       - Null

    //   - Nothing
  }

}
