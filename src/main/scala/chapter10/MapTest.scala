package chapter10

import scala.collection.mutable

object MapTest {
  def main(args: Array[String]): Unit = {
    // a()
    b()
  }

  // Map
  // 可变
  def b(): Unit = {
    val map: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    val sameMap: mutable.Map[String, Int] = mutable.Map(("a", 1), ("b", 2), ("c", 3))
    println(s"map = $map")
    println(s"sameMap = $sameMap")
    println(map("a"))
    println(map.get("a"))
    println(map.getOrElse("a", -1))
    // println(map("x"))
    println(map.get("x"))
    println(map.getOrElse("x", -1))
    // 修改
    map.update("a", 10)
    println(s"map = $map")
    // 增加 / 修改
    val map1: mutable.Map[String, Int] = map + ("d" -> 4)
    println(s"map1 = $map1")
    // 删除
    val map2: mutable.Map[String, Int] = map - "a"
    println(s"map2 = $map2")
  }

  // Map
  // 不可变
  def a(): Unit = {
    val map: Map[String, Int] = Map("a" -> 1, "b" -> 2, "c" -> 3)
    println(s"map = $map")
    // 前 2 个
    val map2: Map[String, Int] = map.take(2)
    println(s"map2 = $map2")
    // 增加
    val map3: Map[String, Int] = map + ("d" -> 4)
    println(s"map3 = $map3")
    // 删除
    val map4: Map[String, Int] = map - "a"
    println(s"map4 = $map4")
  }

}
