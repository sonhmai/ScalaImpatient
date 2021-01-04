package Classes

// 1. improve Counter class so it does not return negative at Int.MaxValue
// One way is just to use Long instead of Int
class Counter1 {
    private var value = 0L
    def increment() { value += 1 }
    def current: Long = value
}

// 1. improve Counter class so it does not return negative at Int.MaxValue
// One way is just to use Long instead of Int
class Counter2 {
    private var value = 0L
    def increment() { value += 1 }
    def current: Long = value
}

// 2. class BankAccount with methods deposit and withdraw, read-only property balance
// TODO - write tests for this
class BankAccount {
    private var privateBalance: Double = 0.0
    def deposit(amount: Double) { privateBalance += amount }
    def withdraw(amount: Double) {
        if (privateBalance >= amount) {
            privateBalance -= amount
            true // successful
        }
        else false // withdrawal failed
    }
    def balance: Double = privateBalance  // read-only property
}
