package chapter060708

object Obj {

  def main(args: Array[String]): Unit = {

    val user: User = new User()
    println(user)

    user.name = "nn"
    println(user.name)

    val emp: Emp = new Emp()
    println(emp)
  }

}

class User {

  var name: String = _
  var age: Int = _

  def login(): Boolean = {
    true
  }
}
