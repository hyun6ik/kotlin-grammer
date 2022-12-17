package 배열과컬렉션.Kotlin

fun main() {
    doMap2()
}


fun doMap1() {
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "월요일"
    oldMap[2] = "화요일"

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }
}

fun doMap2() {
    val map = mapOf(
        1 to "월요일",
        2 to "화요일",
        3 to "수요일",
    )

    for ((key, value) in map.entries) {
        println("$key")
        println("$value")
    }
}