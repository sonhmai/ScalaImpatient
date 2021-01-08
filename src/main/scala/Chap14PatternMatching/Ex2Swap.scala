package Chap14PatternMatching

object Ex2Swap extends App{
  def swap(x: Int, y: Int) = (x,y) match {
    case (a,b) => (b,a)
    case _ => throw new IllegalArgumentException(s"Invalid args ($x, $y)")
  }

  // shorter way to define functions
  val swap2: (Int, Int) => (Int, Int) = {
    case (x,y) => (y,x)
  }
  println(swap(3, 4))
  println(swap2(3, 4))
}
