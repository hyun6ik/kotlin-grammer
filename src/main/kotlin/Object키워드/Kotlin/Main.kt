package Object키워드.Kotlin

fun main() {
    Person.Factory.newBaby("ABC")
    Person.newBaby("AAA")

    println(Singleton.a)

    moveSomething(object : Movable {
        override fun move() {
            println("moveit in moveit")
        }

        override fun fly() {
            println("fly fly in the sky")
        }

    })

}


private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}