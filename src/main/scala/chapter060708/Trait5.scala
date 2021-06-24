package chapter060708

object Trait5 {
  def main(args: Array[String]): Unit = {
    val mysql18: MySQL18 = new MySQL18()
    mysql18.getMessage

    val mysql188: MySQL188 = new MySQL188()
    mysql188.getMessage
  }
}

trait Operate18 extends Exception {
  println("Operate18...")

  def insert(): Unit = {
    println("Operate18 insert")
    this.getMessage
  }
}

class MySQL18 extends Operate18 {

}

trait Operate188 {
  // 特质的使用范围
  this:Exception =>

  println("Operate188...")

  def insert(): Unit = {
    println("Operate188 insert")
    this.getMessage
  }
}

class MySQL188 extends Exception with Operate188 {

}
