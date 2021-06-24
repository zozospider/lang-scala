package chapter060708

object Access {

  def main(args: Array[String]): Unit = {

  }

}

package p1 {
  package p2 {
    class UserP2 {
      var name: String = "aa"
      private var password: String = "bb"
      private[p1] var address: String = "cc"
      protected var email: String = "dd"
    }
  }
  package p3 {
    import chapter060708.p1.p2.UserP2
    object EmpP3 {
      def main(args: Array[String]): Unit = {
        val user = new UserP2()
        println("what")
        println(user.name)
        println(user.address)
      }
    }
  }
}