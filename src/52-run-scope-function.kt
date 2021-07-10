class Persoon {
    var name: String = "Robert Bob"
    var age: Int = 23
}

fun main(args: Array<String>) {

    /**
     * Scope Function: 'run'
     * Property 1: Refer to context object by using 'this'
     * Property 2: The return value is the 'lambda result'
     **/

    // 'run' is combination of 'with' and 'let'
    // If you want to operate on a Nullable object and avoid NullPointerException then use 'run'

    val person: Persoon? = Persoon()

    val bio = person?.run {
        println(name)
        println(age)
        age + 5
        "Hello World" // will be returned and stored in 'bio' variable
    }

    println(bio)
}