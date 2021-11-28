package Chap21Implicits

import org.scalatest.matchers.should
import org.scalatest.wordspec.AnyWordSpec

class ExercisesTest extends AnyWordSpec with should.Matchers {

  "exercise 2 run add percentage to int" in {
    import Solution.IntAddingPercentage
    120 +% 10 shouldBe 132
  }

  "exercise 3 should compute factorial of an integer" in {
    import Solution.IntFactorial
    5.! shouldBe 120
    1.! shouldBe 1
    2.! shouldBe 2
    3.! shouldBe 6
    0.! shouldBe 1
  }

  "ex5 should compute comparison for Fraction" in {
    import Solution.{smaller, Fraction}
    smaller(Fraction(1, 7), Fraction(2, 9)) shouldBe Fraction(1, 7)
  }

  "ex10 should compute average for generic sequence" in {
    import Solution.average
    import Chap21Implicits.Solution.NumberLikeInt
    average(Seq[Int](1, 2, 3, 4, 5))(NumberLikeInt) shouldBe 3
    average(Seq.empty[Int]) shouldBe 0
    average(Seq.empty) shouldBe 0
  }
}

object Solution {

  // exercise 2 - should define an implicit class to extends the Int class by adding behavior +%
  implicit class IntAddingPercentage(int: Int) {
    def +%(percentage: Int): Int = int + int * percentage / 100
  }

  // ex3
  implicit class IntFactorial(int: Int) {
    def !(): Int = {
      if ((int == 0) || (int == 1)) {
        1
      } else int * (int - 1).!
    }
  }

  // ex5
  case class Fraction(nom: Int, denom: Int)
  implicit class RichFraction(fraction: Fraction) extends Ordered[Fraction] {
    override def compare(that: Fraction): Int = {
      val result: Float = fraction.nom.toFloat / fraction.denom - that.nom.toFloat / that.denom
      result match {
        case 0          => 0
        case r if r < 0 => -1
        case r if r > 0 => 1
      }
    }
  }
  def smaller[T](a: T, b: T)(implicit order: T => Ordered[T]): T = if (a < b) a else b

  // ex10
  trait NumberLike[T] {
    def plus(x: T, y: T): T
    def divideBy(x: T, n: Int): T
    def empty: T
  }

  implicit object NumberLikeInt extends NumberLike[Int] {
    override def plus(x: Int, y: Int): Int     = x + y
    override def divideBy(x: Int, n: Int): Int = x / n
    override def empty: Int                    = 0
  }


  def average[T](seq: Seq[T])(implicit evidence: NumberLike[T]): T = {
    if (seq.isEmpty) {
      throw UnsupportedOperationException
    }
    else {
    evidence.divideBy(seq.reduce((x, y) => evidence.plus(x, y)), seq.size)
    }
  }
}
