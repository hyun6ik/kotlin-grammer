package 다양한함수.Kotlin

import 다양한함수.Java.JavaPerson

fun main() {
    val str = "ABC"
    println(str.lastChar())

    val person = JavaPerson("A", 100)
    println(person.nextYearAge())
}