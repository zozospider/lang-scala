package chapter12

object Match4 {
  def main(args: Array[String]): Unit = {
    a()
    println("------")
    b()
    println("------")
    c()
  }

  def a(): Unit = {
    val tuple: (Int, Int, Int, Int, Int) = (1, 2, 3, 4, 5)
    println(s"${tuple._1} ${tuple._2} ${tuple._3}")

    // 特殊的模式匹配
    val (a, b, c, d, e) = (1, 2, 3, 4, 5)
    println(s"$a $b $c")
  }

  def b(): Unit = {
    val list: List[(String, Int)] = List(("a", 1), ("b", 2), ("c", 3))
    for (e <- list) {
      print(s"${e._1} -> ${e._2}, ")
    }
    println
    println("---")
    for ((k, v) <- list) {
      print(s"$k -> $v, ")
    }
    println
    println("---")

    val map: Map[String, Int] = Map("a" -> 1, "b" -> 2, "c" -> 3)
    for (e <- map) {
      print(s"${e._1} -> ${e._2}, ")
    }
    println
    println("---")
    for ((k, v) <- map) {
      print(s"$k -> $v, ")
    }
    println
  }

  def c(): Unit = {
    val (q, r) = BigInt(10) /% 3
    println(s"$q $r")
  }

}
