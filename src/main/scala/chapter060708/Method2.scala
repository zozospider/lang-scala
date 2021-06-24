package chapter060708

object Method2 {

  def main(args: Array[String]): Unit = {
    val user: User09 = new User09("ss")
    println(user)

    println("------")

    val user2: User09 = new User09()
    println(user2)

    println("------")

    val user3: User09 = new User09("ss", "ss2")
    println(user3)

    println("------")

    val user4: User09 = new User09(1)
    println(user4)
  }

}

// 主构造方法
class User09(s: String) {
  println("User09(s: String)")
  println(s"current s: $s")
  // 辅助构造方法
  def this() {
    this("tt")
    println("this()")
  }
  def this(s: String, s2: String) {
    this(s + s2)
    println("this(s: String, s2: String)")
  }
  def this(i: Int) {
    this("ii", "ii")
    println("this(i: Int)")
  }
}

// 私有构造方法 (通过伴生对象构造)
class User099 private(s: String) {

}
