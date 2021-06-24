package chapter09

object Transform1 {
  def main(args: Array[String]): Unit = {

    // 隐式转换
    implicit def transform(mysql: MySQL): Operate = {
      new Operate
    }
    val mysql: MySQL = new MySQL
    mysql.select()
    mysql.delete()
  }
}

class Operate {
  def delete(): Unit = {
    println("Operate delete")
  }
}

class MySQL {
  def select(): Unit = {
    println("MySQL select")
  }
}
