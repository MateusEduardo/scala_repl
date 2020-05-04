abstract class Shape(val x: Int, val y: Int) {
  val area: Double
  def description: String
}

class Rectangle(x: Int, y: Int, val width: Int, val height: Int)
  extends Shape(x, y) {

  val area: Double = width * height

  def description: String =
    "Rectangle " + width + " * " + height
}