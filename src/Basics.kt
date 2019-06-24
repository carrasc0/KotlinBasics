fun main() {
    println("First line")

    val first = 5
    val second = 9


    println("Suma: $first and $second is ${sum(first, second)}")
    println("Resta: $first and $second is ${rest(first, second)}")
    println("Mult: $first and $second is ${mult(first, second)}")
    println("Div: $first and $second is ${divid(first, second)}")

    println(range(9))


}

fun sum(first: Int, second: Int): Long = (first + second).toLong()

fun rest(first: Int, second: Int): Long = (first - second).toLong()

fun mult(first: Int, second: Int): Long = (first * second).toLong()

fun divid(first: Int, second: Int): Long = (first / second).toLong()

fun printList(list: Array<String>){
    for (day in list) println(day)
}

fun printListAndPositions(list: Array<String>){
    for ((position, value) in list.withIndex()){
        println("Position $position Value $value")
    }
}