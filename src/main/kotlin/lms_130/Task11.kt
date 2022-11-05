package lms_130

fun task11_1(guests: List<String>): Int {
    return guests.size
}
fun task11_2(guests: List<String>, condition: String): List<String> {
    val result = mutableListOf<String>()
    for (guest in guests){
        if (condition in guest) {
            result.add(guest)
        }

    }

    return result
}
fun main() {

    // Change the condition to either "-V", "-A", or "-K" to test your code under different conditions
    val conditionOfInterest = "-K"
    val listOfAttendees = listOf(
        "Lia-K","Mar-A", "Luz-K","Ulf-V"
    )
    println("The event has a total of ${task11_1(listOfAttendees)} attendees.")
    println("The attendees with condition $conditionOfInterest are ${task11_2(listOfAttendees, conditionOfInterest)}")
}
