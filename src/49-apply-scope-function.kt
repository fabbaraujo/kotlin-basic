class Peerson {
    var name: String = ""
    var age: Int = 0
}

fun main(args: Array<String>) {
    /**
     * Scope Function: 'apply'
     * Property 1: Refer to context object by using 'this'
     * Property 2: The return value is the 'context object'
     **/

    val person = Peerson().apply {
        name = "Robert Bob"
        age = 26
    }

    with(person) {
        println(name)
        println(age)
    }

    // Perform some other operations on 'person' object
    person.also {
        it.name = "Jack John"
        println("New name: ${it.name}")
    }
}