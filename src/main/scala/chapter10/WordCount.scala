package chapter10

object WordCount {
  def main(args: Array[String]): Unit = {
    wordCount()
  }

  private val list: Seq[(String, Int)] = List(("Hello World Scala", 3), ("Hello Scala", 2), ("Hadoop Hello", 1))

  def wordCount(): Unit = {
    // Seq[(String, Int)] -> Seq[(String, Int)]
    //    List(("Hello World Scala", 3), ("Hello Scala", 2), ("Hadoop Hello", 1))
    // -> List((Hello,3), (World,3), (Scala,3), (Hello,2), (Scala,2), (Hadoop,1), (Hello,1))
    val seq: Seq[(String, Int)] = list.flatMap((tuple: (String, Int)) => {
      val s: String = tuple._1
      val words: Array[String] = s.split(" ")
      val array: Array[(String, Int)] = words.map((word: String) => (word, tuple._2))
      array
    })
    println(s"seq = $seq")

    // Seq[(String, Int)] -> Map[String, Seq[(String, Int)]]
    //    List((Hello,3), (World,3), (Scala,3), (Hello,2), (Scala,2), (Hadoop,1), (Hello,1))
    // -> Map(Hello -> List((Hello,3), (Hello,2), (Hello,1)), World -> List((World,3)), Scala -> List((Scala,3), (Scala,2)), Hadoop -> List((Hadoop,1)))
    val map: Map[String, Seq[(String, Int)]] = seq.groupBy((tuple: (String, Int)) => tuple._1)
    println(s"map = $map")

    //    Map(Hello -> List((Hello,3), (Hello,2), (Hello,1)), World -> List((World,3)), Scala -> List((Scala,3), (Scala,2)), Hadoop -> List((Hadoop,1)))
    // -> Map(Hello -> 6, World -> 3, Scala -> 5, Hadoop -> 1)
    val map2: Map[String, Int] = map.map((tuple: (String, Seq[(String, Int)])) => {
      val sq: Seq[Int] = tuple._2.map((tp: (String, Int)) => tp._2)
      val tp: (String, Int) = (tuple._1, sq.sum)
      tp
    })
    println(s"map2 = $map2")
    // mapValues 可以只针对 Values 进行操作, Key 保持不变
    // map.mapValues((seq: Seq[(String, Int)]) => seq.map((tuple: (String, Int)) => tuple._2).sum)
    /*
    val map2: Map[String, Int] = map.mapValues((seq: Seq[(String, Int)]) => {
      val sq: Seq[Int] = seq.map((tuple: (String, Int)) => tuple._2)
      sq.sum
    })
    println(s"map2 = $map2")
     */

    // Map[String, Int] -> List[(String, Int)]
    //    Map(Hello -> 6, World -> 3, Scala -> 5, Hadoop -> 1)
    // -> List((Hello,6), (Scala,5), (World,3), (Hadoop,1))
    val list2: List[(String, Int)] = map2.toList.sortWith((tuple1: (String, Int), tuple2: (String, Int)) => tuple1._2 > tuple2._2)
    println(s"list2 = $list2")

    // List((Hello,6), (Scala,5), (World,3))
    val list3: List[(String, Int)] = list2.take(3)
    println(s"list3 = $list3")

    println(
      list.flatMap((tuple: (String, Int)) => {
        val s: String = tuple._1
        val words: Array[String] = s.split(" ")
        val array: Array[(String, Int)] = words.map((word: String) => (word, tuple._2))
        array
      }).groupBy((tuple: (String, Int)) => tuple._1)
        .map((tuple: (String, Seq[(String, Int)])) => {
          val sq: Seq[Int] = tuple._2.map((tp: (String, Int)) => tp._2)
          val tp: (String, Int) = (tuple._1, sq.sum)
          tp
        }).toList.sortWith((tuple1: (String, Int), tuple2: (String, Int)) => tuple1._2 > tuple2._2)
        .take(3)
    )
  }

}
