package firststeps

import java.util.Scanner

fun main() {
    loop@ for (i in 'A' .. 'E') {
        for (j in 1 .. 5) {
            print("$i$j ")
            when {
                j == 3 -> break@loop
            }
        }
        println()
    }

    for (i in 0 .. 10) {
        println(i)
    }

    println()

    for (i in 10 downTo 0 step 2) {
        println(i)
    }

    println()
    var i = 1
    val n = 5
    while (i <= 10) {
        println("$n x $i = ${n * i++}")
    }
}


/**
 * Estrutura de seleção
 *
fun main () {
    val x = 2

    when (x) {
        in 0 .. 10 -> println("0 a 10")
        in 11 .. 30 -> println("11 a 30")
        else -> println("Outro intervalo")
    }

    when (x) {
        0, 2, 4, 6 -> println("PAR")
        else -> println("Desconhecido")
    }

    val n = 10
    val r = if (n % 2 == 0) {
        "PAR"
    } else {
        "IMPAR"
    }

    println(r)
}
*/

/**
 * Entrada e saída de dados
 *
fun main() {
    val scanner = Scanner(System.`in`)
    print("Digite seu nome: ")
    val n1 = scanner.next()
    print("Digite seu peso: ")
    val n2 = scanner.nextFloat()
    print("Digite sua idade: ")
    val n3 = scanner.nextInt()

    val dados = """
        Seu nome é: $n1
        Sua idade é: $n3
        Seu peso é: $n2
        """.trimIndent()

    println(dados)


    print("Digite o seu nome: ")
    val name = readln()

    println("Seu nome invertido é: ${name.reversed()}")

    val scanner = Scanner(System.`in`)
    print("N1: ")
    val n1 = scanner.nextInt()
    print("N2: ")
    val n2 = scanner.nextInt()

    println("Soma é: ${n1 + n2}")
}
 */

/**
 * Variáveis e tipos de dados
 *
 * fun main() {
    var counter = 10

    val x1 = -20
    val x2 = x1.toUInt()
    println(x2)

    val c1 = '1'
    println(c1.inc())

    val s1 = "abc"
    val s2 = "def"

    val s1s2 = "$s1$s2"
    println(s1s2)
    val s1s2e = "Soma: '$s1$s2'. O tamanho é: ${(s1 + s2).length}"
    println(s1s2e)

    //usa barra invertida para desconfudir o compilador para caracteres reservados o $ e ""
    val s3 = "O rato roeu\na \$roupa do\nrei de \"Roma\""
    println(s3)
    println()
    val s4 = """
        O rato roeu
        A roupa do
          Rei de "Roma"
        """.trimIndent()

    println(s4)
    println()

    val s5 = """
        | O rato roeu
        |    A roupa do
        |  Rei de "Roma"
        """.trimMargin()

    println(s5)
}*/