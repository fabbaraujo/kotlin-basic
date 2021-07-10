fun main(args: Array<String>) {
    MyClass.count
    MyClass.typeOfCustomers()
}

class MyClass {
    companion object { // like a Factory static in java
        var count: Int = -1 // like a static variable

        @JvmStatic
        fun typeOfCustomers(): String { // like a static method
            return "Indian"
        }
    }
}