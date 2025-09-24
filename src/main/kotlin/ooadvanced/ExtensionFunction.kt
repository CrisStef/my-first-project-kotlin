package ooadvanced

fun main() {
    val sum = listOf(1, 2, 3, 4, 5, 6, 7).sumEvenNumbers()
    println(sum)

    val s = "hello"
    println(s.hide())
}

fun List<Int>.sumEvenNumbers(): Int {
    return this.filter { it % 2 == 0 }.sum()
}

fun String.hide(): String {
    return "".padEnd(length, '*')
}