package 상속.Kotlin

class Derived(
    override val number: Int,
) : Base(number) {

    init {
        println("Derived Class")
    }
}