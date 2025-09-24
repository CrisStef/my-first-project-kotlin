package collections

fun main() {
    val array = Array(5) { "" }
    array[0] = "A"
    println(array.contentToString())

    val array2 = arrayOf("A","B","C")
    println(array2.contentToString())

    val array3 = intArrayOf(1, 2, 3)
    println(array3.contentToString())
}