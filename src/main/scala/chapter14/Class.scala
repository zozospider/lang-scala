package chapter14

object Class {
  def main(args: Array[String]): Unit = {

    val person: Person = new Person
    val user: User = new User
    val child: Child = new Child

    test[Person](person)
    test(person)
    test[User](user)
    test(user)
    test[Child](child)
    test(child)

    println("---")

    // test2[Person](person)
    // test2(person)
    test2[User](user)
    test2(user)
    test2[Child](child)
    test2(child)

    println("---")

    test3[Person](person)
    test3(person)
    test3[User](user)
    test3(user)
    // test3[Child](child)
    test3(child)
  }

  def test[T](t: T): Unit = {
    println(t)
  }

  def test2[T <: User](t: T): Unit = {
    println(t)
  }

  def test3[T >: User](t: T): Unit = {
    println(t)
  }

}

class Person {

}

class User extends Person {

}

class Child extends User {

}
