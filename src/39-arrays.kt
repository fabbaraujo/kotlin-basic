fun main(args: Array<String>) {
    var myArray = Array<Int>(5) { 0 } // mutable. fixed size
    myArray[0] = 32
    myArray[3] = 54
    myArray[1] = 11

    for (element in myArray) {
        println(element)
    }

    println()

    for (index in 0..myArray.size - 1) { // can be replaced for myArray.indices
        println(myArray[index])
    }
}