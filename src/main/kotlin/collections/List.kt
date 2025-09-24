package collections

fun main() {
    val l1 = listOf(1, 2, 3)
    val l2: List<Int> = emptyList()
    val l3 = mutableListOf(1, 2, 3, 4)
    l3.add(6)

    l1.forEach { print(it) }
    println()
    l3.forEach { print(it) }
}