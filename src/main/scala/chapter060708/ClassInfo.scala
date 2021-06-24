package chapter060708

object ClassInfo {
  def main(args: Array[String]): Unit = {

    val userClass: Class[User19] = classOf[User19]
    println(userClass)

    // 别名
    type XXX = User19
    val xxx: XXX = new XXX()
    println(xxx)

    val user: User19 = new User19()
    println(user.isInstanceOf[XXX])

    val user1: Object = new User19()
    // 判断类型
    val bool: Boolean = user1.isInstanceOf[User19]
    if (bool) {
      // 转换类型
      val user2: User19 = bool.asInstanceOf[User19]
    }
  }
}

class User19 {

}
