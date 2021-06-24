package chapter060708

import scala.beans.BeanProperty

object Field {
  def main(args: Array[String]): Unit = {
    val user = new User06()

    println(user.name)
    user.name = "nn"
    user.name_=("nn")
    println(user.name)

    // user.email = ""
    // user.age

    user.setAddress("address")
    println(user.getAddress)
  }
}

class User06 {
  var name: String = _
  val email: String = "e"
  private var age: Int = _

  @BeanProperty var address: String = _
}
