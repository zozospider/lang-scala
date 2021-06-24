package chapter04

object Express {

  def main(args: Array[String]): Unit = {
    a()
  }

  def a(): Unit = {
    val result: Unit = if (true) {
      println("abc")
    }
    println(result)

    val rr: String = if (true) {
      "www"
    }else {
      ""
    }
    println(rr)

    val res: Any = if (false) {
      "abc"
    } else if (false) {
      1
    }
    println(res)

    val vv: AnyVal = if (true) {
      println("wow")
    } else {
      1
    }
    println(vv)

    val sss = if (true) "a" else "b"
    println(sss)
  }

}
