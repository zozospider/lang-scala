package chapter12

object Match1 {
  def main(args: Array[String]): Unit = {
    a()
    println("------")
    b()
    println("------")
    c()
  }

  def a(): Unit = {
    for (c <- "+-3!") {
      var sign: Int = 0
      var digit: Int = 0
      c match {
        case '+' => sign = 1
        case '-' => sign = -1
        case _ if c.toString equals "3" => digit = 3
        case _ => sign = 2
      }
      println(s"$c $sign $digit")
    }
  }

  def b(): Unit = {
    val c: Char = 'V'
    c match {
      case '+' => println("ok~")
      case myChar => println("ok~~" + myChar)
      case _ => println("ok~~~")
    }
  }

  def c(): Unit = {

    val a: Int = 1

    val obj: Any = {
      if (a == 1) 1
      else if (a == 2) "bb"
      else if (a == 3) BigInt(3)
      else if (a == 4) Map("aa" -> 1)
      else if (a == 5) Map(1 -> "aa")
      else if (a == 6) Array(1, 2, 3)
      else if (a == 7) Array("aa", 1)
      else if (a == 8) Array("aa")
    }
    println(obj)

    val result: Any = obj match {
      case i: Int => i
      case _: Map[String, Int] => "Map[String, Int]"
      case _: Map[Int, String] => "Map[Int, String]"
      case _: Array[String] => "Array[String]"
      case _: Array[Int] => "Array[Int]"
      case _: BigInt => Int.MaxValue
      case _ => "啥也不是"
    }
    println(result)
  }

}
