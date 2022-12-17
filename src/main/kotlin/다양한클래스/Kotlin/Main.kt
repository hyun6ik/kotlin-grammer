package 다양한클래스.Kotlin

fun main() {
    val dto1 = PersonDto("윤현식", 100)
    val dto2 = PersonDto("윤현식", 100)

    println(dto1 == dto2)
    println(dto1 === dto2)

    println(dto1)
}


fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

fun handleCar(car: HyundaiCar) {
    when (car) {
        is Avante -> TODO()
        is Grandeur -> TODO()
        is Sonata -> TODO()
    }
}