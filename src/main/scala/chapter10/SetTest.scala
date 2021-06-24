package chapter10

import scala.collection.mutable
import scala.collection.parallel.immutable

object SetTest {
  def main(args: Array[String]): Unit = {
    // a()
    b()
  }

  // Set
  // 不可变
  def b(): Unit = {
    val set: mutable.Set[Int] = mutable.Set(1, 1, 2, 3, 4, 5, 1)
    println(s"set = $set")
    set.foreach(print)
    println
    // 增加
    val set1: mutable.Set[Int] = set + 6
    println(s"set1 = $set1")
    // 删除
    val set2: mutable.Set[Int] = set - 1
    println(s"set2 = $set2")
  }

  // Set
  // 不可变
  def a(): Unit = {
    val set: Set[Int] = Set(1, 1, 2, 3, 4, 5, 1)
    println(set)
  }

}
