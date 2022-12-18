package 다양한함수.Kotlin

fun main() {
    val result = 3 add2 4
    println(result)
}

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}