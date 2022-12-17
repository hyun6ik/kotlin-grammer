package 배열과컬렉션.Kotlin

fun main() {
    doSet1()
}

fun doSet1() {
    val set = setOf(100, 200, 100)

    for (i in set) {
        println("$i")
    }

    for ((i, value) in set.withIndex()) {
        println("$i, $value")
    }
}