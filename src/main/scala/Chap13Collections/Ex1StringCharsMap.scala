package Chap13Collections

/**
 * How to ensure set is sorted?
 */
object Ex1StringCharsMap extends App {
  def indexes(s: String): collection.mutable.Map[Char, collection.mutable.Set[Int]] = {
    // I though about handling cases where s is not a String, but you know what?
    // Scala is not dynamic-typed as in Python. What a relief!
    var map = collection.mutable.Map[Char, collection.mutable.Set[Int]]()
    // can use zipWithIndex ~ enumerate in python
    for (i <- s.indices) {
      if (map.contains(s(i))) {
        map(s(i)).add(i)
      }
      else {
        map += (s(i) -> collection.mutable.SortedSet(i))
      }
    }
    map
  }

  val m = indexes("Mississippi")
  m.foreach{case (k,v) => println(s"$k -> $v")}
}
