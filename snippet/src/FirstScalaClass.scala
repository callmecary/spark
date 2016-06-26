/**
  * Created by Cary Ma on 6/18/16.
  */
class FirstScalaClass {
  def SayHelloWorld(args: Array[String]): Unit = {
    println("Hello World!")
  }

  val mustang = new Car("Ford", "Mustang", "Red")
  val corvette = new Car("GM", "Corvette", "Black")
  //case class without new
  val request = Message("harry", "sam", "fight")

  //Pattern matching
  def f(x: Int, y: Int, operator: String): Double = {
    operator match {
      case "+" => x + y
      case "-" => x - y
      case "*" => x * y
      case "/" => x / y.toDouble
    }
  }

  val sum = f(10, 20, "+")
  val product = f(10, 20, "*")

  def colorToNumber(color: String): Int = {
    val num = color match {
      case "Red" => 1
      case "Blue" => 2
      case "Green" => 3
      case "Yellow" => 4
      case _ => 0
    }
    num
  }

  val square = new Square(10)
  val area = square.area
  //tuples
  val twoElements = ("10", true)
  val threeElements = ("10", "harry", true)

  val first = threeElements._1
  val second = threeElements._2
  val third = threeElements._3
  //array mutable,You can efficiently access any element in an array in constant time
  val arr = Array(10, 20, 30, 40)
  arr(0) = 50
  val first1 = arr(0)
  //list unlike an array, it is an immutable data structure; it cannot be modified after it has been created.
  // it is not an efficient data structure for accessing elements by their indices.
  // Access time is proportional to the position of an element in a list.
  val xs = List(10, 20, 30, 40)
  val ys = (1 to 100).toList
  val zs = arr.toList

  //vector:It provides constant-time indexed access and constant-time linear access.
  // It allows both fast random access and fast functional updates.
  val v1 = Vector(0, 10, 20, 30, 40)
  val v2 = v1 :+ 50
  val v3 = v2 :+ 60
  val v4 = v3(4)
  val v5 = v3(5)
  //set
  val fruits = Set("apple", "orange", "pear", "banana")
  //map
  val capitals = Map("USA" -> "Washington D.C.", "UK" -> "London", "India" -> "New Delhi")
  val indiaCapital = capitals("India")
  //Higher-Order Methods on Collection Classes
  val xs1 = List(1, 2, 3, 4)
  val ys1 = xs1.map((x: Int) => x * 10.0)
  val ys2 = xs1.map { (x: Int) => x * 10.0 }
  val ys3 = xs1 map { x => x * 10.0 }
  val ys4 = xs map {
    _ * 10.0
  }
  //flatmap
  val line = "Scala is fun"
  val SingleSpace = " "
  val words = line.split(SingleSpace)
  val arrayOfChars = words flatMap {
    _.toList
  }
  //filter
  val xs2 = (1 to 100).toList
  val even = xs2 filter {
    _ % 2 == 0
  }
  //foreach
  val words1 = "Scala is fun".split(" ")
  words.foreach(println)
  //reduce
  val xs3 = List(2, 4, 6, 8, 10)
  val sum2 = xs3 reduce { (x, y) => x + y }
  val product2 = xs3 reduce { (x, y) => x * y }
  val max = xs3 reduce { (x, y) => if (x > y) x else y }
  val min = xs3 reduce { (x, y) => if (x < y) x else y }

  val words3 = "Scala is fun" split (" ")
  val longestWord = words reduce { (w1, w2) => if (w1.length > w2.length) w1 else w2
  }

  class Car(mk: String, ml: String, cr: String) {
    val make = mk
    val model = ml
    var color = cr

    def repaint(newColor: String) = {
      color = newColor
    }
  }

}
//case class
case class Message(from: String, to: String, content: String) {}
//trait like interface
trait Shape {
  def area(): Int
}
class Square(length: Int) extends Shape {
  def area = length * length
}
class Rectangle(length: Int, width: Int) extends Shape {
  def area = length * width
}

