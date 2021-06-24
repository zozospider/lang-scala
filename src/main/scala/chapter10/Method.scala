package chapter10

object Method {
  def main(args: Array[String]): Unit = {
    a()
    filter()
    groupBy()
    sort()
    map()
    flatMap()
    zip()
  }

  private val iList: List[Int] = List(10, 2, 3, 2, 5, 5)
  private val iList2: List[Int] = List(10, 2, 3, 20, 50, 50)
  private val sList: List[String] = List("cc", "ab", "aa", "cc", "ab")
  private val ssList: List[String] = List("cc ab", "ab aa", "cc", "bb cc", "aa")

  // 集合常用方法
  def a(): Unit = {
    println(s"list = $iList")
    println(s"sList = $sList")

    // sum: 求和
    println(s"list.sum = ${iList.sum}")
    // max: 最大值
    println(s"list.max = ${iList.max}")
    // min: 最小值
    println(s"list.min = ${iList.min}")
    // product: 乘积, 1*2*3*4*5
    println(s"list.product = ${iList.product}")
    // reverse: 反转
    println(s"list.reverse = ${iList.reverse}")

    println("---")

    // iterator: 迭代
    for (e <- iList.iterator) {
      print(e)
    }
    println

    println("------")
  }

  def filter(): Unit = {
    // filter: 过滤
    // 全部保留
    val list: List[Int] = iList.filter((_: Int) => true)
    println(s"list = $list")

    // 保留偶数
    val list2: List[Int] = iList.filter((i: Int) => i % 2 == 0)
    println(s"list2 = $list2")

    println("------")
  }

  def groupBy(): Unit = {
    // groupBy: 分组
    // 相同数据分组
    val map: Map[Int, List[Int]] = iList.groupBy((i: Int) => i)
    println(s"map = $map")
    map.foreach((tp: (Int, List[Int])) => print(s"${tp._1} -> ${tp._2}, "))
    println

    // 奇数偶数分组
    val map2: Map[Int, List[Int]] = iList.groupBy(_ % 2)
    println(s"map2 = $map2")

    // 首字母分组
    val sMap: Map[Char, List[String]] = sList.groupBy((s: String) => s.charAt(0))
    println(s"sMap = $sMap")

    println("------")
  }

  def sort(): Unit = {
    // sortBy: 排序
    // 数据排序
    val list: List[Int] = iList.sortBy((i: Int) => i)
    println(s"list = $list")

    // 首字母排序
    val list2: List[String] = sList.sortBy((s: String) => s.charAt(0))
    println(s"list2 = $list2")

    // sortWith: 排序
    // 数据排序 (降序)
    val list3: List[Int] = iList.sortWith((i1: Int, i2: Int) => i1 > i2)
    println(s"list3 = $list3")

    // 首字母排序 (降序)
    val list4: List[String] = sList.sortWith((s1: String, s2: String) => s1.charAt(0) > s2.charAt(0))
    println(s"list4 = $list4")

    println("------")
  }

  def map(): Unit = {
    // map: 映射转换

    // 类 WordCount 案例 A

    // List[Int] -> List[(Int, Int)]
    //    List(10, 2, 3, 2, 5, 5)
    // -> List((10,1), (2,1), (3,1), (2,1), (5,1), (5,1))
    val listA1: List[(Int, Int)] = iList.map((i: Int) => (i, 1))
    println(s"listA1 = $listA1")

    // List[(Int, Int)] -> Map[Int, List[(Int, Int)]]
    //    List((10,1), (2,1), (3,1), (2,1), (5,1), (5,1))
    // -> Map(10 -> List((10,1)), 2 -> List((2,1), (2,1)), 3 -> List((3,1)), 5 -> List((5,1), (5,1)))
    val mapA1: Map[Int, List[(Int, Int)]] = listA1.groupBy((tp: (Int, Int)) => tp._1)
    println(s"mapA1 = $mapA1")

    // Map[Int, List[(Int, Int)]] -> Map[Int, Int]
    //    Map(10 -> List((10,1)), 2 -> List((2,1), (2,1)), 3 -> List((3,1)), 5 -> List((5,1), (5,1)))
    // -> Map(10 -> 1, 2 -> 2, 3 -> 1, 5 -> 2)
    val mapA2: Map[Int, Int] = mapA1.map((tp: (Int, List[(Int, Int)])) => (tp._1, tp._2.size))
    println(s"mapA2 = $mapA2")

    // Map[Int, Int] -> List[(Int, Int)]
    //    Map(10 -> 1, 2 -> 2, 3 -> 1, 5 -> 2)
    // -> List((10,1), (3,1), (2,2), (5,2))
    val listA2: List[(Int, Int)] = mapA2.toList.sortWith((tp1: (Int, Int), tp2: (Int, Int)) => tp1._2 < tp2._2)
    println(s"listA2 = $listA2")

    println(
      iList.map((i: Int) => (i, 1))
        .groupBy((tp: (Int, Int)) => tp._1)
        .map((tp: (Int, List[(Int, Int)])) => (tp._1, tp._2.size))
        .toList.sortWith((tp1: (Int, Int), tp2: (Int, Int)) => tp1._2 < tp2._2)
    )

    println("---")

    // 类 WordCount 案例 B

    // List[String] -> List[(String, Int)]
    //    List(cc, ab, aa, cc, ab)
    // -> List((cc,1), (ab,1), (aa,1), (cc,1), (ab,1))
    val listB1: List[(String, Int)] = sList.map((s: String) => (s, 1))
    println(s"listB1 = $listB1")

    // List[(String, Int)] -> Map[String, List[(String, Int)]]
    //    List((cc,1), (ab,1), (aa,1), (cc,1), (ab,1))
    // -> Map(cc -> List((cc,1), (cc,1)), ab -> List((ab,1), (ab,1)), aa -> List((aa,1)))
    val mapB1: Map[String, List[(String, Int)]] = listB1.groupBy((tp: (String, Int)) => tp._1)
    println(s"mapB1 = $mapB1")

    // Map[String, List[(String, Int)]] -> Map[String, Int]
    //    Map(cc -> List((cc,1), (cc,1)), ab -> List((ab,1), (ab,1)), aa -> List((aa,1)))
    // -> Map(cc -> 2, ab -> 2, aa -> 1)
    val mapB2: Map[String, Int] = mapB1.map((tp: (String, List[(String, Int)])) => (tp._1, tp._2.size))
    println(s"mapB2 = $mapB2")

    // Map[String, Int] -> List[(String, Int)]
    //    Map(cc -> 2, ab -> 2, aa -> 1)
    // -> List((aa,1), (cc,2), (ab,2))
    val listB2: List[(String, Int)] = mapB2.toList.sortWith((tp1: (String, Int), tp2: (String, Int)) => tp1._2 < tp2._2)
    println(s"listB2 = $listB2")

    println(
      sList.map((s: String) => (s, 1))
        .groupBy((tp: (String, Int)) => tp._1)
        .map((tp: (String, List[(String, Int)])) => (tp._1, tp._2.size))
        .toList.sortWith((tp1: (String, Int), tp2: (String, Int)) => tp1._2 < tp2._2)
    )

    println("---")

    // 类 WordCount 案例 C

    // List[String] -> Map[String, List[String]]
    //    List(cc, ab, aa, cc, ab)
    // -> Map(cc -> List(cc, cc), ab -> List(ab, ab), aa -> List(aa))
    val mapC1: Map[String, List[String]] = sList.groupBy((s: String) => s)
    println(s"mapC1 = $mapC1")

    // Map[String, List[String]] -> Map[String, Int]
    //    List(ab, ab), aa -> List(aa))
    // -> Map(cc -> 2, ab -> 2, aa -> 1)
    val mapC2: Map[String, Int] = mapC1.map((tp: (String, List[String])) => (tp._1, tp._2.size))
    println(s"mapC2 = $mapC2")

    // Map[String, Int] -> List[(String, Int)]
    //    Map(cc -> 2, ab -> 2, aa -> 1)
    // -> List((aa,1), (cc,2), (ab,2))
    val listC1: List[(String, Int)] = mapC2.toList.sortWith((tp1: (String, Int), tp2: (String, Int)) => tp1._2 < tp2._2)
    println(s"listC1 = $listC1")

    println(
      sList.groupBy((s: String) => s)
        .map((tp: (String, List[String])) => (tp._1, tp._2.size))
        .toList.sortWith((tp1: (String, Int), tp2: (String, Int)) => tp1._2 < tp2._2)
    )

    println("------")
  }

  def flatMap(): Unit = {
    // flatMap: 扁平化

    //    List("a b", "a c", "c")
    // -> List(a, b, a, c, c)
    val list: List[String] = List("a b", "a c", "c").flatMap((ss: String) => ss.split(" "))
    println(s"list = $list")

    //    List(1, List(2, 3), List(4, 5), 6, List(7))
    // -> List(1, 2, 3, 4, 5, 6, 7)
    val list2: List[Any] = List(1, List(2, 3), List(4, 5), 6, List(7)).flatMap((any: Any) => {
      any match {
        case ints: List[Int] =>
          ints
        case _ =>
          List(any)
      }
      /*
      if (any.isInstanceOf[List[Int]]) {
        any.asInstanceOf[List[Int]]
      } else {
        List(any)
      }
       */
    })
    println(s"list2 = $list2")

    // 类 WordCount 案例

    // List[String] -> List[String]
    //    List(cc ab, ab aa, cc, bb cc, aa)
    // -> List(cc, ab, ab, aa, cc, bb, cc, aa)
    println(s"ssList = $ssList")
    val listA1: List[String] = ssList.flatMap((ss: String) => ss.split(" "))
    println(s"listA1 = $listA1")

    // List[String] -> Map[String, List[String]]
    //    List(cc, ab, ab, aa, cc, bb, cc, aa)
    // -> Map(cc -> List(cc, cc, cc), ab -> List(ab, ab), aa -> List(aa, aa), bb -> List(bb))
    val mapA1: Map[String, List[String]] = listA1.groupBy((s: String) => s)
    println(s"mapA1 = $mapA1")

    // Map[String, List[String]] -> Map[String, Int]
    //    Map(cc -> List(cc, cc, cc), ab -> List(ab, ab), aa -> List(aa, aa), bb -> List(bb))
    // -> Map(cc -> 3, ab -> 2, aa -> 2, bb -> 1)
    val mapA2: Map[String, Int] = mapA1.map((tp: (String, List[String])) => (tp._1, tp._2.size))
    println(s"mapA2 = $mapA2")

    // Map[String, Int] -> List[(String, Int)]
    //    Map(cc -> 3, ab -> 2, aa -> 2, bb -> 1)
    // -> List((bb,1), (ab,2), (aa,2), (cc,3))
    val listA2: List[(String, Int)] = mapA2.toList.sortWith((tp1: (String, Int), tp2: (String, Int)) => tp1._2 < tp2._2)
    println(s"listA2 = $listA2")

    println(
      ssList.flatMap((ss: String) => ss.split(" "))
        .groupBy((s: String) => s)
        .map((tp: (String, List[String])) => (tp._1, tp._2.size))
        .toList.sortWith((tp1: (String, Int), tp2: (String, Int)) => tp1._2 < tp2._2)
    )

    println("------")
  }

  def zip(): Unit = {
    // zip: 拉链, 将两个数据连在一起

    //    List(10, 2, 3, 2, 5, 5), List(10, 2, 3, 20, 50, 50)
    // -> List((10,10), (2,2), (3,3), (2,20), (5,50), (5,50))
    val list: List[(Int, Int)] = iList.zip(iList2)
    println(s"list = $list")

    // union: 并集
    //    List(10, 2, 3, 2, 5, 5), List(10, 2, 3, 20, 50, 50)
    // -> List(10, 2, 3, 2, 5, 5, 10, 2, 3, 20, 50, 50)
    val list2: List[Int] = iList.union(iList2)
    println(s"list2 = $list2")

    // intersect: 交集
    //    List(10, 2, 3, 2, 5, 5), List(10, 2, 3, 20, 50, 50)
    // -> List(10, 2, 3)
    val list3: List[Int] = iList.intersect(iList2)
    println(s"list3 = $list3")

    // 差集
    //    List(10, 2, 3, 2, 5, 5), List(10, 2, 3, 20, 50, 50)
    // -> List(2, 5, 5)
    val list4: List[Int] = iList.diff(iList2)
    println(s"list4 = $list4")
    //    List(10, 2, 3, 2, 5, 5), List(10, 2, 3, 20, 50, 50)
    // -> List(20, 50, 50)
    val list5: List[Int] = iList2.diff(iList)
    println(s"list5 = $list5")

    println("------")
  }

}
