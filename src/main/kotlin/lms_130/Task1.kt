package lms_130

fun task1(items: List<Int>): Int {

    return if (items.isNotEmpty()) items.random() else 0


}
fun main () {
    println(task1(listOf()))
}