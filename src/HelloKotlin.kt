

var greeting: String? = "hello"

fun main() {
    println("hello kotlin")

    // var like final in java
    // val mutable variable
    val fName: String = "mahmoud"
    var lName: String = "dd"
    lName = "elebiary"
    println(lName)
    println(greeting)
    greeting = null

println("************************************************")

    when(greeting){
        null -> println(fName)
       // "ss"-> println(lName)
        else -> println(greeting?.toString())
    }
    println("******************************************")

    val checkedGreeting = if (greeting != null) greeting else "hi ;)"

    val greetingToPrint= when (greeting){
        null-> "hi"
        else -> greeting
    }

    println(greetingToPrint)
    println(checkedGreeting)
}
