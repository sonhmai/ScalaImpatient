package Chap10Traits

import java.awt.Rectangle
import java.awt.geom.Ellipse2D

object Main extends App {
  val egg = new Ellipse2D.Double(5, 10, 20, 30) with Ex1RectangleLike
  egg.translate(10, -10)
  egg.grow(10, 20)
}

trait Ex1RectangleLike {
  /**
   * Translate this the indicated distance.
   * @param dx distance to move along X axis
   * @param dy distance to move along Y axis
   */
  def translate(dx: Int, dy: Int) = ???


  /**
   * Resizes horizontally and vertically.
   *
   * Shape is added h units on both left and right side,
   * and added v units on both top and bottom.
   * Shape expands if h/v > 0, shrinks if h and/or v < 0.
   *
   * @param h horizontal expansion
   * @param v vertical expasion
   */
  def grow(h: Int, v: Int) = ???
}
