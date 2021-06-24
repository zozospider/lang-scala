package chapter12

object Match5 {
  def main(args: Array[String]): Unit = {
    // 样例类
    // val dollar: Dollar = new Dollar(1.0)
    val dollar: Dollar = Dollar(1.0)
    println(dollar)
    println(dollar.copy())
    println(dollar.copy(d=10.0))

    println("------")

    for (e <- Array(
      Dollar(100.0),
      Currency(100.0, "RMB"),
      NoAmount
    )) {
      val result: String = e match {
        case Dollar(d) => s"$d dollar"
        case Currency(d, s) => s"$d $s"
        case NoAmount => "no"
      }
      println(s"e = $e, result = $result")
    }
  }
}

// sealed 密封类
// abstract sealed class Amount

abstract class Amount

case class Dollar(d: Double) extends Amount

case class Currency(d: Double, s: String) extends Amount

case object NoAmount extends Amount
