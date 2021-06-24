package chapter060708

object Class2 {
  def main(args: Array[String]): Unit = {
    val user12: User12 = new User12("u12")
    println(user12.ss)

    val user122: User122 = new User122("u122")
    println(user122.s)
    println(user122.ss)
  }
}

class User12(s: String) {

  // 获取 s 1
  var ss: String = s

  // 获取 s 2
  def test(): Unit = {
    println(s)
  }

}

// class User122(var s: String) {
class User122(val s: String) {

  // 获取 s 1
  var ss: String = s

  // 获取 s 2
  def test(): Unit = {
    println(s)
  }

}