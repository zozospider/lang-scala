package chapter10

import scala.collection.mutable

object SeqTest {
  def main(args: Array[String]): Unit = {
    a()
    // b()
    // c()
  }

  // 序列 Seq: Queue
  // 可变
  def c(): Unit = {
    val queue: mutable.Queue[Int] = mutable.Queue(1, 2, 3, 4, 5)
    println(s"queue = $queue")
    queue.enqueue(6)
    println(s"queue = $queue")
    val e: Int = queue.dequeue()
    println(s"e = $e")
    println(s"queue = $queue")
  }

  // 序列 Seq: List
  // 可变
  def b(): Unit = {
    // 查询
    val listBuffer: mutable.ListBuffer[Int] = mutable.ListBuffer(1, 2, 3, 4, 5)
    println(s"listBuffer = $listBuffer")
    println(listBuffer.length)
    println(listBuffer.head)
    println(listBuffer.last)
    println(listBuffer.init)
    println(listBuffer.tail)
    println(listBuffer(1))
    listBuffer.foreach(print)
    println
    for (e <- listBuffer) {
      print(e)
    }
    // ...
  }

  // 序列 Seq: List
  // 不可变
  def a(): Unit = {
    // 查询
    val list: List[Int] = List(1, 2, 3, 4, 5)
    println(s"list = $list")
    println(list.length)
    println(list.head)
    println(list.last)
    println(list.init)
    println(list.tail)
    println(list(1))
    // 前 3 个
    println(list.take(3))
    list.foreach(print)
    println
    for (e <- list) {
      print(e)
    }

    println

    println("------")

    val list1: List[Int] = list :+ 6
    println(s"list1 = $list1")
    val list2: List[Int] = -1 +: list
    println(s"list2 = $list2")

    val list3: List[Int] = list1 ++ list2
    println(s"list3 = $list3")

    val list4: List[Int] = -3 :: -2 :: -1 :: list
    println(s"list4 = $list4")

    val list5: List[Any] = -1 :: list1 :: list
    println(s"list5 = $list5")

    val list6: List[Int] = -1 :: list1 ::: list
    println(s"list6 = $list6")

    println("------")

    // 空 List
    println(List())
    println(Nil)
    val newList: List[Int] = 1 :: 2 :: 3 :: Nil
    println(newList)

    println("------")

    // 修改
    val list7: List[Int] = list.updated(0, 10)
    println(s"list7 = $list7")

    // 删除
    val list8: List[Int] = list drop 2
    println(s"list8 = $list8")
  }

}
