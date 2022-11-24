package lms_131

fun task14(sentence: String): Char {
    val textAsWord = sentence.lowercase().replace(Regex("[;,. ]"), replacement = "")
    val letterCounterMap = mutableMapOf<Char, Int>()

    //generating the counter
    textAsWord.forEach { letter ->
        letterCounterMap[letter] = letterCounterMap.getOrDefault(letter, 0) + 1
    }

    // identify the highest count
    return letterCounterMap.toList().sortedBy { (key,value)-> value }.last().first
}
fun main(){
    println(task14(sentence = " I am it "))
}
