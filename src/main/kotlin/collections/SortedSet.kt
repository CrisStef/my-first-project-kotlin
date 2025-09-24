package collections

fun main() {
    val s = sortedSetOf(Comparator.naturalOrder(), 1, 2, 5, 9, 8, 4, 7, 3)

    val dogs = sortedSetOf(
        Comparator.comparing { d: Dog -> d.name }.reversed(),
        Dog("D4"),
        Dog("D3"),
        Dog("D2"),
        Dog("D1")
    )

    println(dogs)
}