fun main() {
    var personObj = Person()
    personObj.name = "Bob"

    print("The name of the person is ${personObj.name}")
}

class Person {
    var name: String = ""
}