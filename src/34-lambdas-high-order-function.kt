fun main(args: Array<String>) {
    val program = Program()

    program.addTwoNumbers(2, 7) //simple way ... just for understanding

    program.addTwoNumbers(2, 7, object : MyInterface { // using interface / oop way
        override fun execute(sum: Int) {
            println(sum)
        }
    })

    val test: String = "Hello"

    val myLambda: (Int) -> Unit = { s: Int -> println(s) } // lambda expression [function]
    program.addTwoNumbers(2, 7, myLambda)
}

class Program {
    fun addTwoNumbers(a: Int, b: Int, action: (Int) -> Unit) { // high level function with lambda as parameter
        val sum = a + b
        action(sum)
    }

    fun addTwoNumbers(a: Int, b: Int, action: MyInterface) { // using interface / oop way
        val sum = a + b
        action.execute(sum)
    }

    fun addTwoNumbers(a: Int, b: Int) { //simple way ... just for understanding
        val sum = a + b
        println(sum)
    }
}

interface MyInterface {
    fun execute(sum: Int)
}