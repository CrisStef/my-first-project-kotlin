package collections

fun main() {
    val map = mapOf(
        1 to "A",
        2 to "B",
        3 to "C"
    )

    println(map)
    println(map[1])

    map.forEach { (k, v) ->
        println("$k ==> $v")
    }
}
