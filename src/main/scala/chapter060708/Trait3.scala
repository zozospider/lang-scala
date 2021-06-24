package chapter060708

object Trait3 {
  def main(args: Array[String]): Unit = {
    val mysql: MySQL = new MySQL()
    mysql.insert()
  }
}

trait Operate {
  println("Operate...")

  def insert(): Unit = {
    println("Operate insert")
  }
}

trait DB extends Operate {
  println("DB...")

  override def insert(): Unit = {
    println("DB insert")
    // super: 上一级
    super.insert()
    // super[Operate].insert()
  }
}

trait File extends Operate {
  println("File...")

  override def insert(): Unit = {
    println("File insert")
    // super: 上一级
    super.insert()
    // super[Operate].insert()
  }
}

// 初始化顺序从左到右
// 方法执行顺序从右到左
class MySQL extends DB with File {
  println("MySQL...")
}
