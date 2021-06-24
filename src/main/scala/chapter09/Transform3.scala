package chapter09

object Transform3 {
  def main(args: Array[String]): Unit = {

    import chapter09.pkg.Person4

    val user4 = new User4
    user4.insert()
    user4.delete()
  }
}

class User4 {
  def insert(): Unit = {
  }
}

package object pkg {

  // 隐式类不能在顶级, 且构造方法中必须有一个参数
  implicit class Person4(user4: User4) {
    def delete(): Unit = {
    }
  }

}
