package Object키워드.Kotlin

class Person private constructor(
    name: String,
    age: Int,
) {

    companion object Factory : Log{
        override fun log() {
            println("나는 Person 클래스의 동행 객체 입니다.")
        }

        private const val MIN_AGE: Int = 1

        @JvmStatic
        fun newBaby(
            name: String,
        ): Person {
            return Person(name, MIN_AGE)
        }
    }
}