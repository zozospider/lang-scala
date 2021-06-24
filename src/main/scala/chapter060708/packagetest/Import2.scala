package chapter060708.packagetest

class HashMap {
    }
    object Import2 {
      def main(args: Array[String]): Unit = {
        val map = new HashMap()
        println(map)
        val map2 = new java.util.HashMap()
        println(map2)

        // Java 中的包
        val map3 = new _root_.java.util.HashMap()
        println(map3)
      }
    }