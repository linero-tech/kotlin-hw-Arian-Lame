fun task6(sentence: String): String {
    var result = ""
    for ( index in sentence.indices){
        var letter = sentence[index]
        if (index % 2 == 0 ){
            letter = letter.toUpperCase()
        }
        result += letter
    }

    return result
}
fun main (){
    println(task6("I like Stockholm"))
}