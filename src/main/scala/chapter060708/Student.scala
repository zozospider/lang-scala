package chapter060708

// 伴生类
class Student {
  private val name = "nn"
}

// 伴生对象
object Student {

  def apply(): Student = new Student()

  def apply(s: String): Student = new Student()

  def test(): Unit = {
    // new Student().name
  }

}
