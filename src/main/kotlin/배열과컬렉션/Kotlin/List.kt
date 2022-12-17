package 배열과컬렉션.Kotlin

fun main() {
    doList2()
}
fun doList1() {
    val list1 = listOf(100, 200)

    val emptyList = emptyList<Int>()
    useNumbers(emptyList())
}

fun doList2() {
    val list = mutableListOf(100, 200)
    list.add(300)

    for (i in list) {
        println(i)
    }

    for (i in list.indices) {
        println("$i, ${list[i]}")
    }

    for ((i, value) in list.withIndex()) {
        println("$i, $value")
    }
}


private fun useNumbers(numbers: List<Int>) {

}