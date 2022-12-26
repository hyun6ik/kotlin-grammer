package 컬렉션을함수형으로.Kotlin

val List<Fruit>.samePriceFilter: List<Fruit>
    get() = this.filter(Fruit::isSamePrice)
