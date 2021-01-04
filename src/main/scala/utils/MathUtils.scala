package utils

object MathUtils {
  def ~=(x: Double, y:Double, precision: Double=0.001): Boolean = {
    if ((x-y).abs < precision) true else false
  }
}
