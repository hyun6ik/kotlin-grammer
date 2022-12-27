package 이모저모.Kotlin.JumpAndLabel

val numbers = listOf(1, 2, 3)

fun main() {
    loop()
}

fun main1() {
    numbers.map { number -> number + 1 }
        .forEach { number -> println(number) }
}

fun useRunIsBreak() {
    run {
        numbers.forEach { number ->
            if (number == 2) {
                return@run
            }
            println(number)
        }
    }
}

fun useForEachWithContinue() {
    numbers.forEach { number ->
        if (number == 2) {
            return@forEach
        }
        println(number)
    }
}

fun loop() {
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@loop
            }
            print("$i $j")
        }
    }
}
