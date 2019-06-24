fun main() {


    if (6 > 4) println("true") else println("false")

    val max = if (13 > 6) 5 else 9
    println(max)

    val min = if (12 > 4) {
        println("choose 12")
        12
    } else {
        println("Choose 4")
        4
    }
    println(min)

    println(types(5.toLong()))
    println(types(false))
    println(types('y'))
    println(types(6.7))

    println("When capture ${whenCapture()}")
}

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

fun whenCapture() =
    when (val type = types('H')) {
        "is Long" -> "Long type"
        "is Char" -> "Char Type"
        else -> "Nothing"
    }