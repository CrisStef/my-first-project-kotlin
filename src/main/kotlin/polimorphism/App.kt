package polimorphism

fun main() {
    val c = Coffee()
    c.prepare()
    c.serve()

    val d: Drink = Juice()
    val e: Juice = d as Juice

}

abstract class Drink {
    open fun prepare() {
        println("Prepare DRINK")
    }

    abstract fun serve()
}

class Coffee : Drink() {
    override fun prepare() {
        println("Prepare Coffee")
    }

    override fun serve() {
        println("Servindo café na xícara")
    }
}

class Juice : Drink() {
    override fun serve() {
        println("Servindo suco no copo")
    }

    fun addIce() {
        println("Suco com gelo..")
    }
}