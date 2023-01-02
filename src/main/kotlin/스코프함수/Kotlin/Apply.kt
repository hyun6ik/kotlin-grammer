package 스코프함수.Kotlin

data class HobbyPerson(
    val name: String,
    val age: Int,
    var hobby: String? = null,
)

// 객체를 수정하는 로직이 Call chain 중간에 필요할 때
fun createHobbyPerson(
    name: String,
    age: Int,
    hobby: String,
): HobbyPerson {
    return HobbyPerson(
        name = name,
        age = age,
    ).apply {
        this.hobby = hobby
    }
}