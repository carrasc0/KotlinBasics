

fun main() {
    val weekDays = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    weekDays[3] = "Jueves"
    weekDays[6] = "Domingo"

    val a = weekDays.filter { it == "Monday" || it == "Sunday" }












    println("A filter have result of $a")
    println(printList(weekDays))
    println(printListAndPositions(weekDays))


}