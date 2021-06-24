package chapter10

object MethodTest {

  def main(args: Array[String]): Unit = {
    val result: List[String] = diff()
    println(s"result = $result")

    val result2: List[String] = diff2()
    println(s"result2 = $result2")
  }

  private val list1: List[String] = List("aa", "ww", "dd", "mm")
  private val list2: List[String] = List("aa", "xx", "cc", "dd", "yy")

  def diff(): List[String] = {
    var diff: List[String] = List()
    val result: List[String] = list1.foldLeft(list2)((list: List[String], s: String) => {
      if (!list.contains(s)) {
        diff = diff :+ s
        val newList: List[String] = list.updated(list1 indexOf s, s)
        newList
      } else {
        list
      }
    })
    println(s"diff = $diff")
    result
  }

  def diff2(): List[String] = {
    var diff: List[String] = List()
    val result: List[String] = list1.foldLeft(list2)((list: List[String], s: String) => {
      if (!(s equals list(list1 indexOf s))) {
        diff = diff :+ s
        val newList: List[String] = list.updated(list1 indexOf s, s)
        newList
      } else {
        list
      }
    })
    println(s"diff = $diff")
    result
  }

}
