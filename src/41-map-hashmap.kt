fun main(args: Array<String>) {

//  Map Tutorial: Key-Value pair
//  var myMap = HashMap<Int, String>()      // Mutable, READ and WRITE both, No Fixed Size
//  var myMap = mutableMapOf<Int, String>() // Mutable, READ and WRITE both, No Fixed Size

    var myMap = hashMapOf<Int, String>()

    myMap.put(4, "Bob")
    myMap.put(43, "Steve")
    myMap.put(7, "Jack")

    myMap.put(43, "John")

    for (key in myMap.keys) {
        println("Element at $key = ${myMap[key]}") // myMap.get(key)
    }
}