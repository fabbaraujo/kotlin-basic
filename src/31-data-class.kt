fun main(args: Array<String>) {
    var user1 = User("Bob", 10)
    var user2 = User("Bob", 10)

    println(user1.toString())

    if (user1 == user2)
        println("Equal")
    else
        println("Not Equal")

    var newUser = user1.copy(id = 25)
    println(newUser)
}

data class User(var name: String, var id: Int)