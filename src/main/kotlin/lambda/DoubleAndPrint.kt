package lambda

fun main() {
    val f: (Int) -> Int = { n: Int ->
        val d = n * 2
        println("New value $d")
        d
    }

    f(4)

    val f2: (Int) -> String = { n:Int ->
        when {
            n % 2 == 0 -> "PAR"
            else -> "IMPAR"
        }
    }

    println(f2(5))

    val f3 = {n: Int -> n % 2 == 0 }
    println(f3(4))

    val f4: (Int) -> Boolean = {n -> n % 2 == 0 }
}