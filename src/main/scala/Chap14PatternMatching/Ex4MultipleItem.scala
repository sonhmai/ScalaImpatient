package Chap14PatternMatching

object Ex4MultipleItem extends App {
  abstract class Item
  case class Article(description: String, price: Double) extends Item
  case class Bundle(description: String, discount: Double, items: Item*) extends Item
  // TODO

}
