package chapter05

object Function {

  def main(args: Array[String]): Unit = {

    // Scala 可自动推断返回类型, 但是建议在大多数情况下显示声明返回类型

    // 无参数, 无返回值
    def func1(): Unit = {
      println("func1")
    }
    func1()

    def func1b(): Unit = println("func1b")
    func1b()

    println("------")

    // 无参数, 有返回值
    def func2(): Int = {
      1
    }
    println(func2())

    def func2b() = 1
    println(func2b())

    def func2c = 1
    println(func2c)

    println("------")

    // 有参数, 无返回值
    def test3(arg1: Int): Unit = {
      println(s"func3: arg1 = $arg1")
    }
    test3(1)

    def test3b(arg1: Int): Unit = println(s"func3b: arg1 = $arg1")
    test3b(1)

    println("------")

    // 有参数, 有返回值
    def test4(arg1: Int, arg2: Int): Int = {
      arg1 + arg2
    }
    println(test4(1, 2))

    def test4b(arg1: Int, arg2: Int): Int = arg1 + arg2
    println(test4b(1, 2))

    println("------")

    // 默认值 (Scala 中没有重载)
    def test5(arg1: Int, arg2: Int = 20): Unit = {
      println(arg1.toString + " & " + arg2.toString)
    }
    test5(1, 2)
    test5(arg2 = 2, arg1 = 1)
    test5(arg1 = 1)
    test5(1)

    def test5b(arg1: Int = 10, arg2: Int): Unit = {
      println(arg1.toString + " & " + arg2.toString)
    }
    test5b(1, 2)
    test5b(arg2 = 2, arg1 = 1)
    test5b(arg2 = 2)

    println("------")

    // 可变参数
    def test6(s: String*): Unit = {
      println(s)
    }
    test6("a", "b", "c")

    println("------")

    // 匿名函数
    () -> {
      println("xxx")
    }
  }

}
