package chapter060708

object Method {

  def main(args: Array[String]): Unit = {
    val user: User07 = new User07()
    user.login()
    println(user.logout())

    val str: String = user.+("xxx")
    val str2: String = user + "xxx"
    println(str)
    println(str2)


  }

}

class User07 {

  def login(): Unit = {
    println("login")
  }

  // def logout = true
  def logout(): Boolean = {
    true
  }

}
