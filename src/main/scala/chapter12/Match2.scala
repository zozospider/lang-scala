package chapter12

object Match2 {
  def main(args: Array[String]): Unit = {
    a()
    println("------")
    b()
    println("------")
    c()
  }

  def a(): Unit = {
    for (e <- Array(
      Array(0),
      Array(1, 0),
      Array(0, 1, 0),
      Array(1, 1, 0),
      Array(1, 1, 0, 1)
    )) {
      val result: String = e match {
        case Array(0) => "Array(0)"
        case Array(x, y) => s"Array($x, $y)"
        case Array(0, _*) => "Array(0, _*)"
        case _ => "other"
      }
      println(s"result = $result")
    }
  }

  def b(): Unit = {
    for (e <- Array(
      List(0),
      List(1, 0),
      List(0, 0, 0),
      List(1, 0, 0)
    )) {
      val result: String = e match {
        case 0 :: Nil => "0"
        case x :: y :: Nil => s"$x $y"
        case 0 :: _ => "0 ..."
        case _ => "other"
      }
      println(s"result = $result")
    }
  }

  def c(): Unit = {
    // 元组匹配
    for (e <- Array(
      (0, 1),
      (1, 0),
      (2, 1),
      (1, 0, 2)
    )) {
      val result: String = e match {
        case (0, _) => "0 ..."
        case (y, 0) => s"$y 0"
        case (a, b) => s"$a $b"
        case _ => "other"
      }
      println(s"result = $result")
    }
  }
}
