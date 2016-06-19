/**
  * Created by Cary Ma on 6/18/16.
  */
class FirstScalaClass {
  def SayHelloWorld: Unit ={
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
  val sum = f(10,20, "+")
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

}

class Car(mk: String, ml: String, cr: String) {
  val make = mk
  val model = ml
  var color = cr
  def repaint(newColor: String) = {
    color = newColor
  }
}
//case class
case class Message(from: String, to: String, content: String)

