package 이모저모.Kotlin.UseDuplicateMethodName

import 이모저모.Kotlin.UseDuplicateMethodName.b.printHelloWorld as printHelloWorldB
import 이모저모.Kotlin.UseDuplicateMethodName.a.printHelloWorld as printHelloWorldA
import 컬렉션을함수형으로.Kotlin.Fruit

typealias FruitFilter = (Fruit) -> Boolean

fun filterFruits(fruits: List<Fruit>, filter: FruitFilter) {

}

fun duplicateMethodName() {
    printHelloWorldA()
    printHelloWorldB()
}