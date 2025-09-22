package nullable


fun main () {
    val s1: String? = "abc"

    val s2 = s1?.uppercase()
    println(s2)

    var n: Int? = 10
    n = null
}
