object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello World!")
    //Function Literals
    val code = encode(10, (x: Int) => x + 100)


    println(code)
    //option types, some and none
    def colorCode(color1: String): Option[Int] = {
      color1 match {
        case "red" => Some(1)
        case "blue" => Some(2)
        case "green" => Some(3)
        case _ => None
      }
    }
    val code1 = colorCode("orange")
    code1 match {
      case Some(c) => println("code for orange is: " + c)
      case None => println("code not defined for orange")
    }
  }
  //Higher-Order Methods
  def encode(n: Int, f: (Int) => Long): Long = {
    val x = n * 10
    f(x)
  }
  //Closures
  def encodeWithSeed(num: Int, seed: Int): Long = {
    def encode(x: Int, func: (Int) => Int): Long = {
      val y = x + 1000
      func(y)
    }
    val result = encode(num, (n: Int) => n * seed)
    result
  }
}

//Object is keyword for singleton class4
object DatabaseConnection {
  def open(name: String): Int = {
     1
  }
  def close (): Unit = {}
}