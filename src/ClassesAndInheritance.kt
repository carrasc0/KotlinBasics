class Person(name: String) {

    constructor(name: String, lastName: String) : this(name) {
        println("Secondary contrusctor $lastName")
    }

    var address: String = ""
        get(){
            return "Milin Kamak Sofia 18"
        }

    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
        println("Address ${address}")
        address = "#18"
        println(address)
    }


}

fun main() {
    val person = Person("Gabriel", "Betancourt")
}