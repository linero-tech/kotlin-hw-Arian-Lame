package lms_127
/*
formula: base1 + base2 * height / 2
 */
fun task6(base1: Double, base2: Double, height: Double): Double {
val result = base1 + base2 * height / 2
    println(result)
    return result
}
fun main(){
    task6(base1 = 10.0,base2 = 20.0, height = 1.0)
}