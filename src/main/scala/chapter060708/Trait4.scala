package chapter060708

object Trait4 {
  def main(args: Array[String]): Unit = {
    // val mysql: MySQL17 = new MySQL17()

    // 动态混入
    val mysql: Operate17 = new MySQL17() with Operate17
    mysql.insert()
  }
}

trait Operate17 {
  println("Operate17...")

  def insert(): Unit = {
    println("Operate17 insert")
  }
}

class MySQL17 {

}
