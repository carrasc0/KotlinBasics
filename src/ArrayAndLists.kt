

fun main() {

    val weekDays = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    weekDays[3] = "Jueves"
    weekDays[6] = "Domingo"

    val a = weekDays.filter { it == "Monday" || it == "Sunday" }


    val monthsOfYear = mutableListOf<String>()
    monthsOfYear.add("January")
    monthsOfYear.add("February")

    println(monthsOfYear)

    monthsOfYear.removeAt(1)

    println(monthsOfYear)










    println("A filter have result of $a")
    println(printList(weekDays))
    println(printListAndPositions(weekDays))


}