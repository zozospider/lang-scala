package chapter10

import scala.io.{BufferedSource, Source}

object WordCountFile {
  def main(args: Array[String]): Unit = {

    val source: BufferedSource = Source.fromFile("other/text.txt")
    val list: List[String] = source.getLines().toList
    println(list)

    //    List(Hello World Scala, Hello Scala, Hadoop Hello)
    // -> List((Hello,3), (Scala,2), (World,1))
    println(
      list.flatMap((s: String) => s.split(" "))
        .groupBy((s: String) => s)
        // .map((tuple: (String, List[String])) => (tuple._1, tuple._2.size))
        .mapValues((list: List[String]) => list.size)
        .toList.sortWith((tuple1: (String, Int), tuple2: (String, Int)) => tuple1._2 > tuple2._2)
        .take(3)
    )
  }
}
