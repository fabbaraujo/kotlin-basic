fun main(args: Array<String>) {
    var person = Indian()

    person.name = "Bob"
    person.eat()
    person.goToSchool()
}

abstract class MyPerson {
    abstract var name: String

    abstract fun eat() // abstract properties are "open" by default

    open fun getHeight() {} // a "open" function ready to be overridden

    fun goToSchool() {} //normal function
}

class Indian : MyPerson() {
    override var name: String = "Indian Name"

    override fun eat() {
    // own code
    }
}