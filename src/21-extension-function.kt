fun main(args: Array<String>) {
    var student = Studentt()

    println("Pass status: ${student.hasPassed(57)}")
    println("Scholarship status: ${student.isScholar(57)}")
}

fun Studentt.isScholar(marks: Int): Boolean {
    return marks > 95
}

class Studentt {
    fun hasPassed(marks: Int): Boolean {
        return marks > 40
    }
}