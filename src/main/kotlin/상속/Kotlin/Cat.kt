package 상속.Kotlin

class Cat(
    species: String,
) : Animal(species, 4) {
    override fun move() {
       println("사뿐사뿐")
    }
}