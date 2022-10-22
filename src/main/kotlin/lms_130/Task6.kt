package lms_130

fun task6(sentence: String): String {
    var result = ""

    for((index, letter) in sentence.withIndex()) {

        result += if (index % 2 == 0) {
            letter.uppercaseChar()
        } else {
            letter
        }
    }

    sentence.forEachIndexed { index,letter ->
        result += if (index % 2 == 0) {
            letter.uppercaseChar()
        } else {
            letter
        }
    }
    return result
}

fun main() {
    println(task6(sentence = "I like gothenburg"))
}
