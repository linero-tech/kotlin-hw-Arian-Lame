package lms_130

fun task2(items: List<Int>): Int {
    var result = 0
    for (index in items.indices ) {
        val number = items[index]
        if (index % 2 == 0){
            result += number

        }
    }

    return result
}
fun main (){
    println(task2(items = listOf(1,2,3,4)))
}