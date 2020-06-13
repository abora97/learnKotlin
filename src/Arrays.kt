fun main() {

    /*

    arrayOf ->  val interestingThing= arrayOf("kotlin","programming","movies")

    listOf ->   val interestingThing= listOf("kotlin","programming","movies")

     */

    val interestingThing = mutableListOf("kotlin", "programming", "movies")
    interestingThing.add("Java")
    println(interestingThing.size)
    println(interestingThing[0])

    for (interestingThing in interestingThing) {
        println(interestingThing)
    }
    println("************************************")
    interestingThing.forEach {
        println(it)
    }
    println("************************************")
    interestingThing.forEach { interestingThing ->
        println(interestingThing)
    }

    println("*************************************")

    interestingThing.forEachIndexed { index, interestingThing ->

        println("$interestingThing is at index $index")

    }

    //  val map= mapOf( 1 to "a", 2 to "b",3 to "c")
    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    map.put(4, "D")
    map[5] = "E"
    map.forEach { (key, v) -> println(" $key -> $v ") }
}