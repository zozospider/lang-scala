package chapter05

object Function3 {

  def main(args: Array[String]): Unit = {
    // a()
    b()
  }

  def b(): Unit = {

    def f1(f: () => Int): Int = {
      f() + 10
    }

    def f(): Int = {
      10
    }

    println(f1(f _))

    println("------")

    def h1(h: Int => Int): Int = {
      h(5) + 10
    }

    def h(i: Int): Int = {
      i
    }

    println(h1(h))

    println("------")

    def m1(m: () => Unit): Unit = {
      m()
    }

    m1(() => {
      println("m")
    })

    println("------")

    def t1(t: Int => Int): Int = {
      t(3)
    }

    val r = t1((i: Int) => {
      i * 2
    })
    println(r)
    val r2 = t1(i => {
      i * 2
    })
    println(r2)
    val r3 = t1(i => i * 2)
    println(r3)
    val r4 = t1(_ * 2)
    println(r4)

    println("------")

    def t2(t: String => Unit): Unit = {
      t("tt")
    }

    t2((s: String) => {
      println(s)
    })
    t2(s => {
      println(s)
    })
    t2(s => println(s))
    t2(println(_))
    t2(println)

    println("------")

    def t3(t: (Int, Int) => Int): Int = {
      t(2, 3)
    }

    val a = t3((i: Int, j: Int) => {
      i * j
    })
    println(a)
    val a1 = t3((i, j) => {
      i * j
    })
    println(a1)
    val a2 = t3((i, j) => i * j)
    println(a2)
    val a3 = t3(_ * _)
    println(a3)
  }

  def a(): Unit = {

    def f(): String = {
      println("f")
      "f"
    }

    def f1(): () => String = {
      println("f1")
      f _
    }

    f1()
    println("---")
    f1()()
    println("---")
    println(f1()())

    println("------")

    def h1(): () => String = {
      def h(): String = {
        println("h")
        "h"
      }

      println("h1")
      h _
    }

    println(h1()())

    println("------")

    // 闭包
    def m1(i: Int): Int => Int = {
      def m(j: Int): Int = {
        i * j
      }

      m
    }

    println(m1(2)(3))

    println("------")

    // 柯里化 (闭包)
    def w1(i: Int)(j: Int): Int = {
      i * j
    }

    println(w1(2)(3))
  }

}
