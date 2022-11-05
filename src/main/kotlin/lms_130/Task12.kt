package lms_130

fun task12_1(sells: List<Int>): String {

    val WeekDays = listOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val maxSellVallue = sells.maxOrNull()
    val indexOfMaxSellValue = sells.indexOf(maxSellVallue)
    val result = (WeekDays[indexOfMaxSellValue]).also {

        println(it)
    }

    return result
}


fun task12_2(sells: List<Int>): String {

    val WeekDays = listOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val maxSetlVallue = sells.minOrNull()
    val indexOfMaxSellValue = sells.indexOf(maxSetlVallue)
    val result = WeekDays[indexOfMaxSellValue]

    println(result)

    return result
}

fun task12_3(sells: List<Int>): Int {

    var result = 0
    sells.forEach {
        result += it
    }

    println(result)

    return result
}
