package chapter01

object HelloWorld {

  def main(args: Array[String]): Unit = {
    print("Hello World")
  }

}

// Scala 中没有 public 关键字, 默认权限是公共的
// Scala 中没有 void 关键字, 使用特殊对象 Unit 来模拟
// Scala 中使用 def 关键字声明方法
// Scala 中使用 object 声明的是伴生对象, 可通过类名访问, 来模拟 Java 中的静态方法

// 伴生类编译后会生成两个字节码文件: HelloWorld.class 和 HelloWorld.class, 其中 HelloWorld.class 中的 main 方法会调用 HelloWorld.class 对象中的方法

// package chapter01
// import scala.reflect.ScalaSignature
// public final class
// ...

//