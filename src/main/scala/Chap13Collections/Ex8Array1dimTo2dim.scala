package Chap13Collections

object Ex8Array1dimTo2dim extends App {
  def increaseDim1to2(arr: Array[Double], cols: Int) = {
    arr.grouped(cols).toArray
  }

}
