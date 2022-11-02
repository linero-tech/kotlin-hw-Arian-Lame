package lms_130

fun task1(items: List<Int>): Int {

val result = if (items.isNotEmpty()) items.random() else 0

    return result

}
fun main () {
    println(task1(listOf(2,3,5,8)))
}