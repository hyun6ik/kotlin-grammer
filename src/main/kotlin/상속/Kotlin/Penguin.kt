package 상속.Kotlin


class Penguin(
    species: String,
) : Animal(species, 2), Swimable, Flyable {

    private val wingCount: Int = 2
    override fun move() {
        println("펭귄이 움직입니다.")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount
    override val swimAbility: Int
        get() = 3

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override fun swim() {
        println("어푸 어푸 어푸")
    }

    override fun fly() {
        println("날개짓해서 날기")
    }

}