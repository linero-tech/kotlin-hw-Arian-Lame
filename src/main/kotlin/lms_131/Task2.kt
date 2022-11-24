package lms_131

fun task2(mapa: Map<Int, Int>): Int {
    var result = 0
    val keys =mapa.keys
    for (key in keys){
        result += key
    }
    return result
}

fun main() {
    println(task2(
    mapa =mutableMapOf (1 to 10, 2 to 20, 3 to 30)))
}