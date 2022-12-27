package 이모저모.Kotlin.TakeIfTakeUnless

fun getNumberOrNull(number: Int): Int? {
    return if (number <= 0) {
        null
    } else {
        number
    }
}

fun getNumberOrNull2(number: Int): Int? {
    // 주어진 조건을 만족하면 그 값이, 그렇지 않으면 null이 반환된다.
    return number.takeIf { it > 0 }
}

fun getNumberOrNull3(number: Int): Int? {
    // 주어진 조건을 만족하지 않으면 그 값이 그렇지 않으면 null이 반환된다.
    return number.takeUnless { it <= 0 }
}