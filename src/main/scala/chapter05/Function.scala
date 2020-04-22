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

    // 匿名函数
    () -> {
      println("xxx")
    }

    () => {
      println("yyy")
    }
  }

}
