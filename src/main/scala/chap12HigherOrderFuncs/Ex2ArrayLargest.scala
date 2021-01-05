package chap12HigherOrderFuncs


object Ex2ArrayLargest extends App {
  /*
  Largest element of an array using reduce left
   */
  val a = Array(1, 2, 5, 9, 3, 4)
  println(s"Largest of array a is ${a.reduceLeft(_ max _)}")

  // anonymous func
  println(s"Largest of array a is ${a.reduceLeft((x, y) => if (x>y) x else y)}")

  // define function separately
  def largest(x: Int, y: Int) : Int = if (x>y) x else y
  println(s"Largest of array a is ${a.reduceLeft(largest)}")
}