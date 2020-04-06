package chapter02

object Var {

  def main(args: Array[String]): Unit = {

    // 变量必须要初始化

    // 使用 var 声明的变量的值是可以修改的
    var s1: String = "Amy"
    var i1: Int = 1
    var c1: Char = 'a'
    var b1: Boolean = true

    s1 = "Bob"
    i1 = 2
    c1 = 'b'
    b1 = false

    // 使用 val 声明的变量的值是不可以修改的 (对象的引用不可变, 变量引用的对象属性可以变)
    val s2: String = "Amy"
    val i2: Int = 1
    val c2: Char = 'a'
    val b2: Boolean = true

    // 下面语句会报错
    // s2 = "Bob"
    // i2 = 2
    // c2 = 'b'
    // b2 = false
  }

}
