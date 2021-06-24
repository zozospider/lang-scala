package chapter10

import java.util

object ScalaToJava {
  def main(args: Array[String]): Unit = {

  }

  def scalaToJava(): Unit = {
    import scala.collection.mutable
    val array: mutable.ArrayBuffer[Int] = mutable.ArrayBuffer(1, 2, 3)

    /*
    import java.util
    import scala.collection.JavaConverters.bufferAsJavaList
    val javaArray: ProcessBuilder = new ProcessBuilder(array)
    val list: util.List[String] = javaArray.command()
    println(list)
    */

    // ... What?
  }

  def javaToScala(): Unit = {
    import scala.collection.JavaConverters.asScalaBuffer
    import scala.collection.mutable

    // ... What?
  }

}
