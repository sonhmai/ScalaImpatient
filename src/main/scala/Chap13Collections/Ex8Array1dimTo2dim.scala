package Chap13Collections

object Ex8Array1dimTo2dim extends App {
  def increaseDim1to2(arr: Array[Double], cols: Int) = {
    arr.grouped(cols).toArray
  }

  val a: Array[Double] = Array(1, 2, 3, 4, 5, 6)
  val res = increaseDim1to2(a, 3)
  println(res.deep.mkString(" "))
  val expected: Array[Array[Double]] = Array(Array(1.0, 2.0, 3.0), Array(4.0, 5.0, 6.0))
  assert(res.deep == expected.deep)

}
