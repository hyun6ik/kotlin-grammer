package 배열과컬렉션.Kotlin

fun main() {
//    doArray1()
    doArray2()
}

fun doArray1() {
    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println("$i ${array[i]}")
    }
}

fun doArray2() {
    val array = arrayOf(100, 200, 300)
    array.plus(400)

    for ((idx, value) in array.withIndex()) {
        println("$idx, $value")
    }
}