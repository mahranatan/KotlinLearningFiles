fun main() {
    val x = true
    val y = false

    println(y || x)
    println(x || x)
    println(y || y) //only false + false = false in || (or)
    println(x || y)

    println()

    println(y && x)
    println(x && x) //only true + true + true in && (and)
    println(y && y)
    println(x && y)
}