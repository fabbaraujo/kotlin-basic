fun main(args: Array<String>) {

//  var list = mutableListOf<String>()  // Mutable, No Fixed Size, Can Add or Remove Elements
//  var list = arrayListOf<String>()    // Mutable, No Fixed Size, Can Add or Remove Elements

    var list = ArrayList<String>() // Mutable, No Fixed Size, Can Add or Remove Elements
    list.add("Bob")
    list.add("Steve")
    list.add("Jack")

    list[1] = "John"

    for (element in list) {
        println(element)
    }
}