package 스코프함수.Kotlin

// 하나 이상의 함수를 Call Chain 결과로 호출할 때

val strings = listOf("APPLE","CAR")
fun useLet() {
    strings
        .map { it.length }
        .filter { it > 3 }
        .let(::println)

}
// non-null 값에 대해서만 code block을 실행시킬 때

val str: String = "apple"
val length = str?.let {
    println(it.uppercase())
    it.length
}

// 일회성으로 제한된 영역에 지역 변수를 만들 때
val numbers = listOf("one", "two", "three", "four")
val modifiedFirstItem = numbers
        .first()
        .let {
            if (it.length >= 5) {
                it
            } else {
                "!$it!"
            }
        }.uppercase()

