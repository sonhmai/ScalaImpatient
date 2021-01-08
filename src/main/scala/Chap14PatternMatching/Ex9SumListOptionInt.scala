package Chap14PatternMatching

/**
 * None is a subtype of Option, null is not.
 * So we define List with None as List(None), not List(Option(null))
 */
object Ex9SumListOptionInt extends App {
  val f: List[Option[Int]] => Int = l => {
    l.foldLeft(0)((a, b) => a + b.getOrElse(0))
  }

  assert(f(List(Option(3), Option(4))) == 7)
  assert(f(List(Option(3), None)) == 3)
  assert(f(List(None)) == 0)
}
