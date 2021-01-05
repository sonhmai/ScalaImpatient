package chap12HigherOrderFuncs

object Ex5MaxFuncValue extends App {
  def largestOutput(fun: (Int) => Int, inputs: Seq[Int]): Int = {
    inputs.map(fun).max
  }

  assert(largestOutput(x => 10 * x - x * x, 1 to 10) == 25)
}

/**
 * Return the input at which the output is largest
 */
object Ex6MaxFuncValue extends App {
  def largestInput(fun: (Int) => Int, inputs: Seq[Int]): Int = {
    // maybe use indices?
    5
  }

  assert(largestInput(x => 10 * x - x * x, 1 to 10) == 5)
}
