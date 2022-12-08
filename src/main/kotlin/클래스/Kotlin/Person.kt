package 클래스.Kotlin

class Person(
    val name: String = "윤현식",
    var age: Int = 100,
) {
    init {
        validate(age)
        println("초기화 블록")
    }

    val isAdult: Boolean
        get() = this.age >= 20

    val uppercaseName: String
        get() = this.name.uppercase()

    private fun validate(age: Int) {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }
}