package chapter12

object Match {
  def main(args: Array[String]): Unit = {
    a()
    println("------")
    b()
  }

  def a(): Unit = {
    val ope: Char = '/'
    val n1: Int = 20
    val n2: Int = 10
    var res: Int = 0
    ope match {
      case '+' => res = n1 + n2
      case '-' => res = n1 - n2
      case '*' => res = n1 * n2
      case '/' =>
        println("get /")
        res = n1 / n2
      case _ => println("ope error")
    }
    println(s"res = $res")
  }

  private val sList1: List[List[Int]] = List(List(1, 2), List(3, 4))
  private val sList2: List[String] = List("Hello Scala", "Hello World")

  def b(): Unit = {

    /*
    def flat(li: List[Int]): List[Int] = {
      li
    }
    val list: List[Int] = sList1.flatMap(flat)
     */

    val list: List[Int] = sList1.flatMap((li: List[Int]) => li)
    println(s"list = $list")

    // val list2: List[String] = sList2.flatMap((s: String) => s.split(" "))
    val list2: List[String] = sList2.flatMap(_.split(" "))
    println(s"list2 = $list2")
  }

}
