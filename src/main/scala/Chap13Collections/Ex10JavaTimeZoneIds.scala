package Chap13Collections

/**
 * java.util.TimeZone.getAvailableIDs
 * Which continent has most time zones?
 */
object Ex10JavaTimeZoneIds extends App {
  val timezones: Array[String] = java.util.TimeZone.getAvailableIDs
  val continents = timezones
    .filter(s => s.contains("/"))
    .map(s => s.split("/")(0))
  val counts = continents
    .groupBy(s => s)
    .map { case (k, v) => (k, v.length) }

  val maxCount = counts.maxBy(_._2)

  
  println(continents.head.mkString("\n"))
  println(counts)
  println(maxCount)
}
