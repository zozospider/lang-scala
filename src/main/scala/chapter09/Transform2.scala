package chapter09

object Transform2 {
  def main(args: Array[String]): Unit = {

    // 隐式值
    implicit val ss: String = "ss"
    implicit val ii: Int = 10

    // 隐式参数
    def test(implicit s: String = "s"): Unit = {
      println(s"This is $s")
    }

    def test2(implicit s: String): Unit = {
      println(s"This is $s")
    }

    // 不传递隐式值
    test()
    // 传递隐式值
    test

    test2
  }
}
