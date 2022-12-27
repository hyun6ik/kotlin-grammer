package 이모저모.Kotlin.구조분해

data class Person(
    val name: String,
    val age: Int,
)

class Person2(
    val name: String,
    val age: Int,
) {
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}


fun main() {
    val person = Person("윤현식", 100)
//    val (name, age) = person
    val name = person.component1()
    val age = person.component2()

    val person2 = Person2("윤현식", 100)

    val (name2, age2) = person2
    println("나이 : $age 이름 : $name")
}
