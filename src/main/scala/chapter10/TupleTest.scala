package chapter10

object TupleTest {

  def main(args: Array[String]): Unit = {
    a()
  }

  // Tuple
  def a(): Unit = {
    // 最多 22 个元素
    val tuple: (String, Int, String, Int, Boolean) = ("a", 1, "b", 2, true)
    println(tuple)
    println(tuple._1)
    println(tuple._2)
    for (e <- tuple.productIterator) {
      print(e)
    }
    println
    println("------")

    // 2 个元素的元组称为: 对偶, 类似 Map 中的键值对
    val tuple1: (String, Int) = ("a", 1)
    val tuple2: (String, Int) = ("b", 2)
    val map: Map[String, Int] = Map("a" -> 1, "b" -> 2)
    val map1: Map[String, Int] = Map(("a", 1), ("b", 2))
    val map2: Map[String, Int] = Map(tuple1, tuple2)
    println(s"map = $map")
    println(s"map1 = $map1")
    println(s"map2 = $map2")
    for (e <- map2) {
      print(s"$e, ")
    }
    println
    map2.foreach((tp: (String, Int)) => print(s"$tp, "))
    println
    map2.foreach((tp: (String, Int)) => print(s"${tp._1} -> ${tp._2}, "))
  }

}
