package Chap14PatternMatching

object Ex3SwapArray extends App {
  val swap: Array[Int] => Array[Int] = {
    case Array(x, y, rest@_*) => Array(y, x) ++ rest
  }

  println(swap(Array(1,2,3,4)).mkString(" "))
  println(swap(Array(1,2)).mkString((" ")))
}
