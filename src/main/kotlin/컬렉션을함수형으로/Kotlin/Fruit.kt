package 컬렉션을함수형으로.Kotlin

data class Fruit(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long,
) {
    fun nullOrValue() {
        return nullOrValue()
    }

    val isSamePrice: Boolean
        get() = factoryPrice == currentPrice
}
