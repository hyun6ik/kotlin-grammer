package 다양한함수.Kotlin

fun createPerson(firstName: String, lastName: String): Person {
    fun validateName(name: String, fieldName: String) {
        if (name.isEmpty()) {
            throw IllegalArgumentException("${fieldName}은 비어있을 수 없습니다! 현재 값 : $name")
        }
    }
    validateName(firstName, "firstName")
    validateName(lastName, "lastName")
    return Person(firstName, lastName, 1)

}