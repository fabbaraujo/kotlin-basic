fun main(args: Array<String>) {
    var dog = TheDog("Black", "Pug")
}

open class TheAnimal {
    var color: String = ""

    constructor(color: String) {
        this.color = color
        println("From Animal: $color")
    }
}

class TheDog : TheAnimal {
    var bread: String = ""

    constructor(color: String, breed: String): super(color) {
        this.bread = breed

        println("From Dog: $color and $breed")
    }
}