package exceptions


fun main() {
    val v = "abc"
    val i = try {
        v.toInt()
    } catch (e: NumberFormatException) {
        0
    }

    println("I: $v")
    println()

    val x: Int? = null
    val d = x?.toDouble() ?: throw IllegalArgumentException()

    println(d)

    println()
    a()
}

fun a() {
    try {
        b()
    } catch (b: B) {
        throw A(b)
    }
}

fun b() {
    throw B()
}

class A(cause: Throwable) : RuntimeException(cause)
class B : RuntimeException()