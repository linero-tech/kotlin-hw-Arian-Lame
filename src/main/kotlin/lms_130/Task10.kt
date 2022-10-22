package lms_130

fun task10(items: List<Int>): List<Int> {
    val result = mutableListOf<Int>()

    for (number in items) {
        if (number % 2 == 0) {
            result.add(number * 2)
        } else {
            result.add(number * 3)
        }
    }

    return result
}

fun main() {
    println(task10(listOf(1,2,3,4,5)))
}
