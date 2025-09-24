package collectionlambda

fun main() {
    Person
        .data()
        .associate { it.name to it.age }
        .forEach { (n, a) ->
            println("$n - $a")
        }

    Person
        .data()
        .filter { it.age >= 18 }
        .forEachIndexed {i, p -> println("${i + 1}. $p") }

    Person
        .data()
        .map { it.name }
        .forEach { println(it) }

    val maxName = Person
        .data()
        .map { it.name }
        .maxBy { it.length }
    println(maxName)
}