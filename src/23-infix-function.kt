fun main(args: Array<String>) {
    val x: Int = 6
    val y: Int = 10

    val greaterVal = x findGreaterValue y // x.findGreaterValue(y)

    println(greaterVal)
}

infix fun Int.findGreaterValue(other: Int): Int { // infix and extension fun
    if (this > other)
        return this
    else
        return other
}

/*
    1. All infix functions are extension functions
        But all extension functions are not infix
    2. Infix functions just have one parameter
 */