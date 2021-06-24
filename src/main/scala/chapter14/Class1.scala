package chapter14

object Class1 {
  def main(args: Array[String]): Unit = {

    val other: Other[User1] = new Other[User1]
    println(other)

    println("---")

    // 协变, 逆变

    // 协变
    val other1: Other1[Person1] = new Other1[Person1]
    val other2: Other1[User1] = new Other1[User1]
    val other3: Other1[Child1] = new Other1[Child1]
    println(other1)
    println(other2)
    println(other3)

    println("---")

    /*val list: List[Int] = List(1, 2, 3)
    val result: Int = list.reduceLeft((i1: Int, _: Int) => {
      i1
    })
    val result2: User = list.reduceLeft[User]((u: User, _: Int) => {
      u
    })
    println(result2)*/

    // 逆变
    /*val other4: Other1[Person1] = new Other2[Person1]
    val other5: Other1[User1] = new Other2[User1]
    val other6: Other1[Child1] = new Other2[Child1]
    println(other4)
    println(other5)
    println(other6)*/
  }

}

class Person1 {

}

class User1 extends Person1 {

}

class Child1 extends User1 {

}

class Other[User1] {

}

class Other1[+User1] {

}

class Other2[-User1] {

}
