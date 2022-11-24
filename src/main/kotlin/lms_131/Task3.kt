package lms_131

fun task3(a: Map<Int, String>, b: Map<Int, String>): List<Int> {
    val result = mutableListOf<Int>()
    b.keys.forEach { key->
        if(key in a.keys) {
            result.add(key)
        }
    }
    return result
}

fun main() {
    println(task3(
        a = mutableMapOf( 1 to "A", 2 to "B", 3 to "C" ),
        b = mutableMapOf( 1 to  "A",2 to "B", 4 to "D")
    ))
}
