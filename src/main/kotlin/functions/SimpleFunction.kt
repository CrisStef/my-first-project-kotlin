package functions

fun main() {
    println(calculate(10, 25))
    println(pow(exp = 2, base = 3.0))
    sayHello(message = "Belezinha ?")
    println(multiply(5, 8))
}

private fun multiply(a: Int, b: Int) = a * b

private fun sayHello(name: String = "Desconhecido", message: String) {
    println("Hello, $name! $message")
}

private fun calculate(a: Int, b:Int) : Int {
    return a + b;
}

private fun pow(base: Double, exp: Int): Double {
    var r = base

    for (n in 2 .. exp) {
        r += base
    }

    return r
}