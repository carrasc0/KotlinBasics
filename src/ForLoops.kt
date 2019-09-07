fun main() {
    val weekDays = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    for (item in weekDays) println(item)
    println(printListAndPositions(weekDays))
    println(printPositions(weekDays))
    returnExpression()
    labels()
    anonymus()
    breakSimulation()

}

fun printPositions(list: Array<String>){
    loopPos@ for (i in list.indices) println(i)
}

fun printListAndPositions(list: Array<String>){
    loopLandP@ for ((position, value) in list.withIndex()){
        println("Position $position Value $value")
    }
}

fun returnExpression() {
    println("returnExpression")
    println(" ")
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return
        println(it)
    }
    println("this point is unreachable")
}
fun labels() {
    println("labels")
    println(" ")
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit
        println(it)
    }
    println(" done with explicit label")
}

fun anonymus() {
    println("anonymus")
    println(" ")
    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3) return  // local return to the caller of the anonymous fun, i.e. the forEach loop
        println(value)
    })
    println(" done with anonymous function")
}

fun breakSimulation() {
    println("breakSimulation")
    println(" ")
    run loop@{
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@loop
            print(it)
        }
    }
    print(" done with nested loop")
}