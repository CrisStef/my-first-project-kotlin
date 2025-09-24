package collections

fun main() {
    val s1 = setOf(1, 2, 3)
    val s2 = mutableSetOf("A", "B", "C", "D")

    s1.forEach {
        print(it)
    }
    println()
    s2.forEach {
        print(it)
    }
}