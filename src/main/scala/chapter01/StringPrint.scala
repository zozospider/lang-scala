package chapter01

// 打印字符串
object StringPrint {

  def main(args: Array[String]): Unit = {

    val name = "Amy"
    val age = 1
    val salary = 2.0f

    // 普通输出
    println("name = " + name + ", age = " + age + ", salary = " + salary)
    print("name = " + name + ", age = " + age + ", salary = " + salary + "\n")

    println("------")

    // 占位符
    printf("name = %s, age = %d, salary = %f \n", name, age, salary)

    println("------")

    // 插值
    println(s"name = $name, age = $age, salary = $salary")
    println(s"name.length = ${name.length}, age.getClass = ${age.getClass}, salary = $salary")

    println("------")

    // 格式化
    println(f"name = $name, age = $age%.2f, salary = $salary")

    println("------")

    // 原样输出
    println(raw"name = $name, age = $age, salary = $salary \n")
  }

}
