package 함수.Kotlin

fun main() {
    repeat("Hello World")
    repeat("useNewLine is False", useNewLine =  false)

    printNameAndGender(
        name = "현식",
        gender = "남성"
    )

    printAll("A", "B", "C")
    val array = arrayOf("A", "B", "C")
    printAll(*array)
}
fun max(a: Int, b: Int) = if (a > b) a else b

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
            continue
        }
        print(str)
    }
}

fun printNameAndGender(
    name: String,
    gender: String,
) {
    println("${name}의 성별은 ${gender}입니다.")
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}