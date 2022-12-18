package 다양한함수.Kotlin

fun main() {
    val srt = Srt()
    println(srt.isExpensive())
}

open class Train(
    val name: String = "새마을 기차",
    val price: Int = 5_000,
) {
}

fun Train.isExpensive(): Boolean {
    println("Train의 확장함수")
    return this.price >= 10000
}

class Srt : Train(
    name = "SRT",
    price = 40_000
)

fun Srt.isExpensive(): Boolean {
    println("Srt의 확장함수")
    return this.price >= 10000
}