package chapter10

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object ArrayTest {
  def main(args: Array[String]): Unit = {
    // a()
    // b()
    c()
    // d()
  }

  // 可变数组和不可变数组的转换
  def d(): Unit = {
    // array -> buffer
    val array: Array[Int] = Array(1, 2, 3, 4, 5)
    val buffer: mutable.Buffer[Int] = array.toBuffer

    // buffer -> array
    val arrayBuffer: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5)
    val array1: Array[Int] = arrayBuffer.toArray
  }

  // 可变数组
  def c(): Unit = {
    val arrayBuffer: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5)
    println(arrayBuffer)
    println(arrayBuffer(0))
    arrayBuffer.foreach(print)
    println("------")
    // 修改
    arrayBuffer(0) = 10
    println(arrayBuffer)
    println("------")
    // 增加
    arrayBuffer.insert(5, 6)
    println(arrayBuffer)
    arrayBuffer += 7
    println(arrayBuffer)
    // 删除
    val e: Int = arrayBuffer.remove(0)
    println(e)
    println(arrayBuffer)
    arrayBuffer.remove(0, 2)
    println(arrayBuffer)
    arrayBuffer -= 7
    println(arrayBuffer)
  }

  // 不可变数组
  def b(): Unit = {
    val array: Array[Int] = Array(1, 2, 3, 4, 5)
    // 修改
    array.update(0, 10)
    println(array.mkString("Array(", ", ", ")"))
    // 增加
    val array2: Array[Int] = array :+ 6
    val array3: Array[Int] = -1 +: array
    println(array2.mkString("Array(", ", ", ")"))
    println(array3.mkString("Array(", ", ", ")"))
  }

  // 不可变数组
  def a(): Unit = {
    val array: Array[Int] = Array(1, 2, 3, 4, 5)
    println(array)
    println(array.mkString(","))
    println(array(0))
    println(array.length)

    for (e <- array) {
      print(e)
    }
    println

    def f(e: Int): Unit = {
      print(e)
    }

    array.foreach(f)
    println

    array.foreach((e: Int) => {
      print(e)
    })
    println

    array.foreach(e => {
      print(e)
    })
    println

    array.foreach({
      print(_)
    })
    println

    array.foreach(print(_))
    println

    array.foreach(print)
    println
  }

}
