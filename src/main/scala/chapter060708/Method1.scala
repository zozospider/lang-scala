package chapter060708

object Method1 {

  def main(args: Array[String]): Unit = {
    val student = Student
    val student2 = Student("ss")
    println(student)
    println(student2)

    val range = Range(1, 5)
    println(range)
  }
}
