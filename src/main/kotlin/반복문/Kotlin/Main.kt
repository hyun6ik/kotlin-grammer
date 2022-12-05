package 반복문.Kotlin

fun forEach() {
    val numbers = mutableListOf(1L, 2L, 3L)

    for (number in numbers) {
        println(number)
    }
}

fun originalForEach() {
    for (i in 1..3) {
        println(i)
    }
}

fun downFor() {
    for (i in 3 downTo 1) {
        println(i)
    }
}

fun stepForEach() {
    for (i in 1..5 step 2) {
        println(i)
    }
}


