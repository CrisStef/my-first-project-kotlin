package classes

fun main() {
    val a1 = Account("123-1", "Cris")
    a1.print()
    Account.sum(12, 23)
    println(Math.substract(50, 18))
}

object Math {
    fun substract(a: Int, b: Int) = a - b
}