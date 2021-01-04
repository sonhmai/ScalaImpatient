// test for bank account exercise 2

import Classes.Ex2BankAccount
import org.scalatest.flatspec.AnyFlatSpec
import utils.MathUtils

class Ex2BankAccountSpec extends AnyFlatSpec {
  "Bank Account" should "increase balance when deposited" in {
    val acc = new Ex2BankAccount
    acc.deposit(10.5)
    assert(acc.balance == 10.5)
  }

  it should "decrease balance when withdrew" in {
    val acc = new Ex2BankAccount
    acc.deposit(10.3)
    acc.withdraw(9.9)
    assert(MathUtils.~=(acc.balance, 0.4))
  }
}
