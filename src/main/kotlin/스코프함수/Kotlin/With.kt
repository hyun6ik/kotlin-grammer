package 스코프함수.Kotlin

data class PersonDto(
    val name: String,
    val age: Int,
)

// 특정 객체를 다른 객체로 변환해야 하는데
// 모듈 간의 의존성에 의해
// 정적 팩토리 혹은 toClass 함수를 만들기 어려울 때

fun useWith1() {
    return with(person) {
        PersonDto(
            name = name,
            age = age,
        )
    }
}