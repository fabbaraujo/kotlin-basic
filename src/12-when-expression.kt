fun main(args: Array<String>) {
    val x = 100

    val str: String = when (x) {
        1 -> "x is 1"
        2 -> "x is 2"
        else -> {
            "x is value unknown"
            "x is alien"
        }
    }

    print(str)
}