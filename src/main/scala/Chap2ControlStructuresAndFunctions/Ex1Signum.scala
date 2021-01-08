package Chap2ControlStructuresAndFunctions

object Ex1Signum extends App {
  private def signum(x: Long): Int = if (x>0) 1 else if (x<0) -1 else 0

  assert(signum(3) == 1)
  assert(signum(1) == 1)
  assert(signum(3429304781L) == 1)
  assert(signum(-99999) == -1)
  assert(signum(-1) == -1)
  assert(signum(0) == 0)
}
