package 컬렉션을함수형으로.Kotlin

val fruits = listOf<Fruit>()

val fruitsInList = listOf(
    listOf(
        Fruit(1L, "사과", 1000, 1500),
        Fruit(2L, "사과", 1200, 1500),
        Fruit(3L, "사과", 1200, 1500),
        Fruit(4L, "사과", 1500, 1500),
    ),
    listOf(
        Fruit(5L, "바나나", 3000, 3200),
        Fruit(6L, "바나나", 3200, 3200),
        Fruit(7L, "바나나", 2500, 3200),
    ),
    listOf(
        Fruit(8L, "수박", 10000, 10000),
    )
)

fun filter1() {
    fruits.filter { fruit -> fruit.name == "사과" }
}

fun filterIndexed() {
    fruits.filterIndexed{ idx, fruit ->
        println(idx)
        fruit.name == "사과"
    }
}

fun filterWithMap() {
    fruits.filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.currentPrice }
}

fun filterWithMapNotNull() {
    fruits.filter { fruit -> fruit.name == "사과" }
        .mapNotNull { fruit -> fruit.nullOrValue()}
}

fun isAll() {
    fruits.all { fruit -> fruit.name == "사과" }
}

fun isNone() {
    fruits.none{  fruit -> fruit.name == "사과" }
}

fun any() {
    fruits.any { fruit -> fruit.factoryPrice >= 10000 }
}

fun count() {
    fruits.count()
}

fun sortedBy() {
    // 오름차순 정렬
    fruits.sortedBy { fruit -> fruit.currentPrice }
}

fun sortByDescending() {
    // 내림차순 정렬
    fruits.sortedByDescending { fruit -> fruit.currentPrice }
}

fun distinctBy() {
    fruits.distinctBy { fruit -> fruit.name }
        .map { fruit -> fruit.name }
}

fun first2() {
    // 첫번쨰 값을 가져온다 (무조건 null이 아니어야함)
    fruits.first()
}

fun firstOrNull() {
    // 첫번쨰 값 또는 null을 가져온다.
    fruits.firstOrNull()
}

fun last1() {
    // 마지막 값을 가져온다. (무조건 null이 아니어야함)
    fruits.last()
}

fun lastOrNull() {
    // 첫번쨰 값 또는 null을 가져온다.
    fruits.lastOrNull()
}

fun listToMap() {
    val map = fruits.groupBy { fruit -> fruit.name }
}

fun doAssociateBy() {
    fruits.associateBy { fruit -> fruit.id }
}

fun listToMap2() {
    // 과일이름 -> List<출고가> Map
    fruits.groupBy({ fruit -> fruit.name }, {fruit -> fruit.factoryPrice})
}

fun listToMap3() {
    // id -> List<출고가> Map
    fruits.associateBy({ fruit -> fruit.id }, {fruit -> fruit.factoryPrice})
}

fun filterMap() {
    fruits.groupBy { fruit -> fruit.name }
        .filter { (key, value) -> key == "사과" }
}
fun sameFruits() {
    val samePriceFruits = fruitsInList.flatMap { list ->
        list.filter { fruit -> fruit.factoryPrice == fruit.currentPrice }
    }

    val samePriceFruits2 = fruitsInList.flatMap { list -> list.samePriceFilter }
}