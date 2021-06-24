package chapter10

import scala.collection.mutable

object Method2 {
  def main(args: Array[String]): Unit = {
    reduce()
    fold()
    fold2()
    scan()
  }

  private val list: List[Int] = List(10, 2, 3, 4)

  def reduce(): Unit = {
    // reduce: 规约 / 化简

    // (((10 + 2) + 3) + 4) = 19
    val sum: Int = list.reduce((i1: Int, i2: Int) => i1 + i2)
    val sum2: Int = list.reduce(_ + _)
    val sum3: Int = list.reduceLeft(_ + _)
    println(s"sum = $sum")
    println(s"sum2 = $sum2")
    println(s"sum3 = $sum3")

    // (10 + (2 + (3 + 4))) = 19
    val sum4: Int = list.reduceRight(_ + _)
    println(s"sum4 = $sum4")

    // (((10 - 2) - 3) - 4) = 1
    val result: Int = list.reduce(_ - _)
    val result2: Int = list.reduceLeft(_ - _)
    println(s"result = $result")
    println(s"result2 = $result2")

    // (10 - (2 - (3 - 4))) = 7
    val result3: Int = list.reduceRight(_ - _)
    println(s"result3 = $result3")

    println("------")
  }

  def fold(): Unit = {
    // fold: 折叠

    // ((((100 + 10) + 2) + 3) + 4) = 119
    val result: Int = list.fold(100)((i1: Int, i2: Int) => i1 + i2)
    val result2: Int = list.fold(100)(_ + _)
    val result3: Int = list.foldLeft(100)(_ + _)
    println(s"result = $result")
    println(s"result2 = $result2")
    println(s"result3 = $result3")

    // ((((100 - 10) - 2) - 3) - 4) = 81
    val result4: Int = list.fold(100)(_ - _)
    val result5: Int = list.foldLeft(100)(_ - _)
    println(s"result4 = $result4")
    println(s"result5 = $result5")

    // (10 - (2 - (3 - (4 - 100)))) = 107
    val result6: Int = list.foldRight(100)(_ - _)
    println(s"result6 = $result6")

    println("------")
  }

  private val map1: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 1, "c" -> 0)
  private val map2: mutable.Map[String, Int] = mutable.Map("a" -> 1, "c" -> 10, "d" -> 20)

  def fold2(): Unit = {
    // 将 map1 和 map2 相同的 Key 累加: "a" -> 2, "b" -> 1, "c" -> 10, "d" -> 20

    // Map(b -> 1, d -> 20, a -> 2, c -> 10)
    val map3: mutable.Map[String, Int] = map1.foldLeft(map2)((map: mutable.Map[String, Int], tuple: (String, Int)) => {
      map(tuple._1) = map.getOrElse(tuple._1, 0) + tuple._2
      map
    })
    println(s"map3 = $map3")

    println("------")
  }

  def scan(): Unit = {
    // scan: 扫描, 每一步的结果

    val result: List[Int] = list.scanLeft(100)(_ + _)
    println(s"result = $result")

    val result2: List[Int] = list.scanLeft(100)(_ - _)
    println(s"result2 = $result2")

    val result3: List[Int] = list.scanRight(100)(_ - _)
    println(s"result3 = $result3")
  }

}
