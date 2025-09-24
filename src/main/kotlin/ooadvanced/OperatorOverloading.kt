package ooadvanced

fun main() {
    val p1 = Point(10, 5)
    val p2 = Point(5, 3)
    val p3 = p1 + p2

    println(p1)
    println(p2)
    println(p3)
}
data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x = x + other.x, y = y + other.y)
    }
}