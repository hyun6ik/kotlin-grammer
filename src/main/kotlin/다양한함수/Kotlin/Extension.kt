package 다양한함수.Kotlin

import 다양한함수.Java.JavaPerson

fun String.lastChar(): Char {
    return this[this.length - 1]
}

fun JavaPerson.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1

}