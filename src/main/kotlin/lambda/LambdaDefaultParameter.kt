package lambda

fun main() {
    val f1: (Int) -> Int = {
        it * 2
    }
    println(f1(6))

    val t = "afdaGDFSGDdgadsgDFGA"

    val (f, s) = t.partition { it.isUpperCase() }
    println("First: $f")
    println("Second: $s")

    repeat(5) {
        println("i = $it")
    }
}