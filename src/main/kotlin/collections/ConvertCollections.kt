package collections

fun main() {
    val l1 = listOf("A", "B", "C")
    val l2: MutableList<String> = l1.toMutableList()

    val s1: Set<String> = l1.toSet()
}