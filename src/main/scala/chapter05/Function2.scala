package chapter05

object Function2 {

  def main(args: Array[String]): Unit = {

    def function0a: () => Unit = () => {}
    def function0b: Int => Int = (i: Int) => i
    def function0c: (Int, Int) => Int = (i: Int, j: Int) => i + j
    println(function0a)
    println(function0b)
    println(function0c)

    println("------")

    def f1aa(): Unit = {
      println("f1aa")
    }
    def f1a(): () => Unit = {
      f1aa
    }
    val function1a: () => Unit = f1a()
    val unit1a: Unit = f1a()()
    println(function1a)
    println(unit1a)

    println("---")

    def f1b(): () => Unit = {
      def f1bb(): Unit = {
        println("f1bb")
      }
      f1bb
    }
    val function1b: () => Unit = f1b()
    val unit1b: Unit = f1b()()
    println(function1b)
    println(unit1b)

    println("------")

    def f2aa(i: Int): Unit = {
      println(i)
    }
    def f2a(): Int => Unit = {
      f2aa
    }
    val function2a: Int => Unit = f2a()
    val unit2a: Unit = f2a()(2)
    println(function2a)
    println(unit2a)

    println("---")

    def f2b(): Int => Unit = {
      def f2bb(i: Int): Unit = {
        println(i)
      }
      f2bb
    }
    val function2b: Int => Unit = f2b()
    val unit2b: Unit = f2b()(2)
    println(function2b)
    println(unit2b)

    println("------")

    def f3aa(i: Int, s: String): String = {
      i + s
    }
    def f3a(): (Int, String) => String = {
      f3aa
    }
    val function3a: (Int, String) => String = f3a()
    val string3a: String = f3a()(3, "aa")
    println(function3a)
    println(string3a)

    println("---")

    def f3b(): (Int, String) => String = {
      def f3bb(i: Int, s: String): String = {
        i + s
      }
      f3bb
    }
    val function3b: (Int, String) => String = f3b()
    val string3b: String = f3b()(3, "bb")
    println(function3b)
    println(string3b)

    println("------")

    def f4aa(i: Int, s: String): String = {
      i + s
    }
    def f4a(i: Int, s: String): (Int, String) => String = {
      f4aa
    }
    val function4a: (Int, String) => String = f4a(-1, "nothing")
    val string4a: String = f4a(-1, "nothing")(4, "aa")
    println(function4a)
    println(string4a)

    println("---")

    def f4b(i: Int, s: String): (Int, String) => String = {
      def f4bb(j: Int, ss: String): String = {
        i + s + " & " + j + ss
      }
      f4bb
    }
    val function4b: (Int, String) => String = f4a(4, "b")
    val string4b: String = f4b(4, "b")(4, "bb")
    println(function4b)
    println(string4b)

    println("---")

    def f4c(i: Int, s: String): (Int, String) => String = {
      (j: Int, ss: String) => i + s + " & " + j + ss
    }
    val function4c: (Int, String) => String = f4c(4, "c")
    val string4c: String = f4c(4, "c")(4, "cc")
    println(function4c)
    println(string4c)

    println("---")

    // 柯里化
    def f4d(i: Int, s: String)(j: Int, ss: String): String = {
      i + s + " & " + j + ss
    }
    val string4d: String = f4d(4, "d")(4, "dd")
    println(string4d)

    println("------")

    def f5aa(): Unit = {
      println("f5aa")
    }
    def f5a(f: () => Unit): Int = {
      f()
      5
    }
    val int5a: Int = f5a(f5aa)
    println(int5a)

    println("------")

    def f6aa(i: Int): Unit = {
      println(i)
    }
    def f6a(f: Int => Unit): Int = {
      f(66)
      6
    }
    val int6a: Int = f6a(f6aa)
    println(int6a)

    println("---")

    def f6b(f: Int => Unit): Int = {
      f(66)
      6
    }
    val int6b: Int = f6b((i: Int) => {
      println(i)
    })
    println(int6b)

    println("------")

    def f7aa(i: Int, s: String): String = {
      i + s
    }
    def f7a(i: Int, s: String, f: (Int, String) => String): String = {
      val string7aa: String = f(77, "aa")
      i + s + " & " + string7aa
    }
    val string7a: String = f7a(7, "a", f7aa)
    println(string7a)

    println("---")

    def f7b(i: Int, s: String, f: (Int, String) => String): String = {
      val string7bb: String = f(77, "bb")
      i + s + " & " + string7bb
    }
    val string7b: String = f7b(7, "b", (i: Int, s: String) => {
      i + s
    })
    println(string7b)

    println("------")

    def f8aa(i: Int, s: String): String = {
      i + s
    }
    def f8aaa(i1: Int, i2: Int): String = {
      i1.toString + i2.toString
    }
    def f8a(i: Int, s: String, f: (Int, String) => String): (Int, Int) => String = {
      val string8aa: String = f(88, "aa")
      println(i + s + " & " + string8aa)
      f8aaa
    }
    val function8a: (Int, Int) => String = f8a(8, "a", f8aa)
    val string8a: String = f8a(8, "a", f8aa)(888, 888)
    println(function8a)
    println(string8a)

    println("---")

    def f8b(i: Int, s: String, f: (Int, String) => String): (Int, Int) => String = {
      val string8bb: String = f(88, "bb")
      println(i + s + " & " + string8bb)
      def f8bbb(i1: Int, i2: Int): String = {
        i1.toString + i2.toString
      }
      f8bbb
    }
    val function8b: (Int, Int) => String = f8b(8, "b", (i: Int, s: String) => {
      i + s
    })
    val string8b: String = f8b(8, "b", (i: Int, s: String) => {
      i + s
    })(888, 888)
    println(function8b)
    println(string8b)

    println("---")

    def f8c(i: Int, s: String, f:(Int, String) => String)(j1: Int, j2: Int): String = {
      val string8cc: String = f(88, "cc")
      println(i + s + " & " + string8cc)
      j1.toString + j2.toString
    }
    val string8c: String = f8c(8, "c", (i: Int, s: String) => {
      i + s
    })(888, 888)
    println(string8c)

    println("------")

    def f9(i: Int, f: String => Unit): Unit = {
      println(i)
      f("s")
    }
    f9(-999, (i: String) => {
      println(i)
    })
    f9(-999, i => {
      println(i)
    })
    f9(-999, i => println(i))
    f9(-999, println(_))
    f9(-999, println)

    println("------")

    def f10(i: Int, f: (String, String) => Unit): Unit = {
      println(i)
      f("s", "s")
    }
    f10(-1000, (s1: String, s2: String) => {
      println(s1 + " & " + s2)
    })
    f10(-1000, (s1, s2) => {
      println(s1 + " & " + s2)
    })
    f10(-1000, (s1, s2) => println(s1 + " & " + s2))
    // TODO ?
    // f10(-1000, println(_ + " & " + _))

    println("------")
  }

}
