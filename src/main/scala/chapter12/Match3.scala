package chapter12

object Match3 {
  def main(args: Array[String]): Unit = {
    a()
  }

  def a(): Unit = {
    // 对象匹配
    object Square {

      // 构建对象时调用 apply
      def apply(d: Double): Double = d * d

      // case 后调用 unapply, 如果返回 Some 则匹配成功, 如果返回 None 则匹配失败
      def unapply(d: Double): Option[Double] = Some(math.sqrt(d))
      // def unapply(d: Double): Option[Double] = None
    }

    val num: Double = 36.0
    num match {
      case Square(d) => println(d)
      case _ => println("other")
    }
  }

}
