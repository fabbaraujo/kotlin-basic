fun main(args: Array<String>) {
    var person = Perrson()

    with(person) {
        name = "Bob"
        age = 23
    }

    person.apply {
        name = "Bob"
        age = 23
    }.startRun()

    println(person.name)
    println(person.age)
}

class Perrson {
    var name: String = ""
    var age: Int = -1

    fun startRun() {
        println("Now I am ready to run")
    }
}