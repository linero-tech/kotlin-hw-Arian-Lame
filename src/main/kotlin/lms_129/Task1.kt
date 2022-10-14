package lms_129

fun task1(a: Int, b: Int): Int {
    var result = 15

    if (a < b) {for (number in a..b) {
        result += number
    }
    }

    return result

}
fun main () {
    println( task1( a = 3, b = 3))


}
