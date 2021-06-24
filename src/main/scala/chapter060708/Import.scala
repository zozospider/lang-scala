package chapter060708

// 所有类
import java.util._
// 多个类
import java.util.{ArrayList, HashMap}
// 包
import java.util
// 别名
import java.util.{ArrayList => JavaArrayList}

object Import {

  def main(args: Array[String]): Unit = {

    import java.util.Date
    val date: Date = new Date()

    val date2: Date = new util.Date()

    val list = new JavaArrayList()
  }

}
