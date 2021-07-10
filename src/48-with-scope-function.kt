class Personn {
    var name: String = "Robert Bob"
    var age: Int = 23
}

fun main(args: Array<String>) {
    /**
     * Scope Function: 'with'
     * Property 1: Refer to context object by using 'this'
     * Property 2: The return value is the 'lambda result'
     **/

    val person = Personn()

    val bio: String = with(person) {
        println(name)
        println(age)
        age + 5
        "Hello World" // will be returned and stored in 'bio' String variable
    }

    println(bio)
}