package 다양한클래스.Kotlin

sealed class HyundaiCar(
    val name: String,
    val price: Long,
)

class Avante : HyundaiCar(
    name = "아반뗴",
    price =  1_000L
)

class Sonata : HyundaiCar(
    name = "소나타",
    price =  2_000L
)

class Grandeur : HyundaiCar(
    name = "그렌저",
    price = 3_000L
)
