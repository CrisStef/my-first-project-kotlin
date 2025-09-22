package polimorphism

fun main() {
    val tree = Tree("Brown", 1.56)
    val tree2 = tree.clone()

    println(tree)
    println(tree2)
}

interface Clonable {
    fun clone(): Any
}

data class Tree(
    val color: String,
    val height: Double
) : Clonable {
    override fun clone() : Any {
        return Tree(color, height)
    }
}