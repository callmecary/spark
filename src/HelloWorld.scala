object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello World!")
    //Function Literals
    val code = encode(10, (x: Int) => x + 100)


    println(code)
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