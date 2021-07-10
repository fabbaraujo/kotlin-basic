fun main(args: Array<String>) {
    CustomersData.count = 98
    CustomersData.typeOfCustomers()

    println(CustomersData.typeOfCustomers())

    CustomersData.count = 109
    println(CustomersData.count)

    CustomersData.myMethod("Hello")
}

open class MySuperClass {
    open fun myMethod(str: String) {
        println("MySuperClass")
    }
}

object CustomersData : MySuperClass() { //like a singleton
    var count: Int = -1 // like a static variable

    fun typeOfCustomers(): String { // like a static method
        return "Indian"
    }

    override fun myMethod(str: String) {
        super.myMethod(str)
        println("object Customer Data: $str")
    }
}