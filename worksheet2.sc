class Shape(val x: Int, val y: Int) {
  def description: String = s"Shape at (" + x + "," + y + ")"
}

class Rectangle(x: Int, y: Int, val width: Int, val height: Int)
  extends Shape(x, y) {
  override def description: String = {
    super.description + s" - Rectangle " + width + " * " + height
  }

  def descThis: String = this.description
  def descSuper: String = super.description
}

val rect = new Rectangle(x = 0, y = 3, width = 3, height = 2)
rect.description
rect.descThis
rect.descSuper