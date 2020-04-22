package chapter05

object Function2 {

  def main(args: Array[String]): Unit = {

    def f1a(): Unit = {
      println("f1a")
    }
    def f1(): () => Unit = {
      f1a
    }
    val function1: () => Unit = f1()
    val unit1: Unit = f1()()
    println(function1)
    println(unit1)

    println("---")

    def f2(): () => Unit = {
      def f2a(): Unit = {
        println("f2a")
      }
      f2a
    }
    val function2: () => Unit = f2()
    val unit2: Unit = f2()()
    println(function2)
    println(unit2)

    println("------")

    def f3a(i: Int): Unit = {
      println(i)
    }
    def f3(): Int => Unit = {
      f3a
    }
    val function3: Int => Unit = f3()
    val unit3: Unit = f3()(3)
    println(function3)
    println(unit3)

    println("---")

    def f4(): Int => Unit = {
      def f4a(i: Int): Unit = {
        println(i)
      }
      f4a
    }
    val function4: Int => Unit = f4()
    val unit4: Unit = f4()(4)
    println(function4)
    println(unit4)

    println("------")

    def f5a(i: Int, s: String): String = {
      i + s
    }
    def f5(): (Int, String) => String = {
      f5a
    }
    val function5: (Int, String) => String = f5()
    val string5: String = f5()(5, "a")
    println(function5)
    println(string5)

    println("------")


  }

}
