package lambda

fun main() {
    val r1 = sum(5, 6)
    println(r1)

    val f1 = fun(a: Int, b: Int) = a + b

    val r2 = f1.invoke(10, 5)
    println(r2)

    val r3 = f1(10, 5)
    println(r3)

    val f2 = { a:Int, b:Int -> a + b }
    val r4 = f2(10, 8)
    println(r4)

    val f3: (Int, Int) -> Int = { a:Int, b:Int -> a + b } //Definir o tipo de variavel
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b