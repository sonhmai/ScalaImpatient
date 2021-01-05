package Chap6Objects

/*
Define a Point class with companion object to construct Point(3,4)
without using new.
 */

object A extends App {
  val p = Point(3, 4)
  println(p, p.stringify())
}

class Point(x: Int, y: Int) {
  private val privateX = x
  private val privateY = y

  def stringify(): String = s"Point(x=$privateX,y=$privateY)"
}

object Point {
  def apply(x: Int, y: Int) = new Point(x, y)
}
