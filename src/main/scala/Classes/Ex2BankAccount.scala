package Classes

class Ex2BankAccount {
  private var privateBalance: Double = 0.0

  def deposit(amount: Double) {
    privateBalance += amount
  }

  def withdraw(amount: Double): Boolean = {
    if (privateBalance >= amount) {
      privateBalance -= amount
      true // successful
    }
    else false // withdrawal failed
  }

  def balance: Double = privateBalance // read-only property
}
