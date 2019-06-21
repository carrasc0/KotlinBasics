fun main() {
    println("First line")

    val first = 5
    val second = 9

    println("Suma: $first and $second is ${sum(first, second)}")
    println("Resta: $first and $second is ${rest(first, second)}")
    println("Mult: $first and $second is ${mult(first, second)}")
    println("Div: $first and $second is ${divid(first, second)}")

    println(range(9))

    println(types(5.toLong()))
    println(types(false))
    println(types('y'))
    println(types(6.7))

}

fun sum(first: Int, second: Int): Long = (first + second).toLong()

fun rest(first: Int, second: Int): Long = (first - second).toLong()

fun mult(first: Int, second: Int): Long = (first * second).toLong()

fun divid(first: Int, second: Int): Long = (first / second).toLong()

fun range(number: Int): String {
    return when (number) {
        in 1..4 -> "Between 1 and 4"
        in 4..8 -> "Between 4 and 9"
        !in 10..89 -> "Not between 10 and 89"
        else -> "No idea"
    }
}

fun types(value: Any): String {
    return when (value) {
        is String -> "is String"
        is Long -> "is Long"
        is Char -> "is Char"
        is Boolean -> "is Boolean"
        else -> "Dont recognize it"
    }
}