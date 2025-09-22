package classes

class Account(
    val accountNumber: String = "",
    val accountOwner: String = ""
) {

    private var balance: Double = 0.0

    constructor() : this(accountOwner = "", accountNumber = "")

    fun deposit(amount: Double) {
        balance += amount
    }

    fun print() {
        println("Number: $accountNumber; Owner: $accountOwner; Balance: $balance")
    }

    companion object {
        fun sum(a: Int, b: Int) = a + b
    }
}