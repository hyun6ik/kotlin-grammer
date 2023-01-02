package 스코프함수.Kotlin

// 객체를 수정하는 로직이 call chain 중간에 필요할 때
fun main() {
    mutableListOf("one","two","three")
        .also { println("four 추가 이전 지금 값: $it") }
        .add("four")
}