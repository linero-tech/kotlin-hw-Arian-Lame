package lms_129

fun task9(temperature: String): String {
// separate number from unit
    val magnitude = temperature.substring(0, temperature.length-1).toDouble()
// check if number is C or F
    val isCelsius = temperature.contains("C", ignoreCase = true)
// IF C
    val result = if (isCelsius){
        // use formula to convert to F
        val conversion = (9.0 * magnitude / 5.0) + 32.0
        "${conversion.toInt()}F"
    } else {
        // use formula to convert to C
        val conversion = (5.0 * (magnitude - 32.0)) / 9.0
        "${conversion.toInt()}C"
    }

    return result
}

fun main(){
    println(task9("50F"))
}
