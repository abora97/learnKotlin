import java.lang.Integer.parseInt
import kotlin.test.todo

fun main() {
    println("Hello world!")
    println("test print ${sum(2, 5)}")
    println("short fun ${sumShort(3, 8)}")
    println(printSum(3, 8))


    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    val c: Int  // Type required when no initializer is provided
    c = 3       // deferred assignment
    val s = "a is $a"
    println(s)
    println(" max between $a and $b is ${maxOf(a, b)}")

    getStringLength(2)

    forLoop()
    describe(1)

    range(11, 10)

    for (range in 1..5) {
        println("range example $range")
    }

    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    // downTo to stop at this num
    for (x in 9 downTo -10 step 3) {
        print(x)
    }

    //Using lambda expressions to filter and map collections
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }

}

fun forLoop() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}


fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sumShort(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    // unit like void in java
    println("sum of $a and $b is ${a + b}")
}

fun maxOf(a: Int, b: Int) = if (a > b) a else b

fun getStringLength(obj: Any): Int? {
    //A reference must be explicitly marked as nullable when null value is possible
    if (obj is String) {
        // `obj` is automatically cast to `String` in this branch
        return obj.length
    }

    // `obj` is still of type `Any` outside of the type-checked branch
    return null
}

fun describe(obj: Any): String =
    //when like switch case
    when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }

//Ranges
//Check if a number is within a range using in operator
fun range(x: Int, maxRange: Int) {

    val maxRange = 90
    if (x in 1..maxRange + 1) {
        println("fits in range ($x)")

    }
}