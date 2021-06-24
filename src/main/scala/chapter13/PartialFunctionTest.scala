package chapter13

object PartialFunctionTest {
  def main(args: Array[String]): Unit = {
    a()
    println("------")
    b()
    println("------")
    c()
    println("------")
    d()
  }

  //    List(1, 2, 3, "abc")
  // -> List(2, 3, 4)
  private val list: List[Any] = List(1, 2, 3, "abc")

  def a(): Unit = {
    // 普通方式

    val result: List[Any] = list.map((v: Any) => {
      /*
      if (v.isInstanceOf[Int]) {
        v.asInstanceOf[Int] + 1
      }
       */
      v match {
        case v: Int => v + 1
        case _ => ()
      }
    })
    println(s"result = $result")

    val result2: List[Any] = result.filter((v: Any) => v match {
      case _: Int => true
      case _ => false
    })
    println(s"result2 = $result2")
  }

  def b(): Unit = {
    // 普通方式

    val list2: List[Any] = list.filter((v: Any) => v match {
      case _: Int => true
      case _ => false
    })
    println(s"list2 = $list2")

    val list3: List[Int] = list2.map((v: Any) => {
      v.asInstanceOf[Int]
    })
    println(s"list3 = $list3")

    val list4: List[Int] = list3.map(_ + 1)
    println(s"list4 = $list4")
  }

  def c(): Unit = {
    // 偏函数方式

    // 方式一

    // 声明偏函数
    val pf: PartialFunction[Any, Int] = new PartialFunction[Any, Int] {

      override def isDefinedAt(v: Any): Boolean = {
        if (v.isInstanceOf[Int]) {
          true
        } else {
          false
        }
      }

      override def apply(v: Any): Int = v.asInstanceOf[Int] + 1
    }
    // collect 支持偏函数
    // map 不支持偏函数
    val result: List[Int] = list.collect(pf)
    println(s"result = $result")

    println("---")

    // 方式二

    // 声明偏函数
    def pf2: PartialFunction[Any, Int] = {
      case i: Int => i + 1
    }

    val result2: List[Int] = list.collect(pf)
    println(s"result2 = $result2")

    println("---")

    // 方式三
    val result3: List[Int] = list.collect {
      case i: Int => i + 1
    }
    println(s"result3 = $result3")
  }

  def d(): Unit = {
    val list2: List[String] = list.map {
      // case v: Any => v + "aa"
      v: Any => v + "aa"
    }
    println(s"list2 = $list2")

    val list3: List[Any] = list.sortWith {
      case (v1: Any, v2: Any) => v1.toString > v2.toString
    }
    println(s"list3 = $list3")
  }

}
