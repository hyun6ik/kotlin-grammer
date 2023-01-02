package 스코프함수.Kotlin

data class Person(
    val name: String,
    val age: Int,
)

val person = Person("현식",100)

fun printPerson(person: Person?) {
    person?.let {
        println(it.name)
        println(it.age)
    }
    if (person != null) {
        println(person.name)
        println(person.age)
    }
}

val value1 = person.let {
    it.age
}

val value2 = person.run {
    this.age
}

val value3 = person.also {
    it.age
}

val value4 = person.apply{
    this.age
}

val value5 = with(person) {
    println(name)
    println(age)
}