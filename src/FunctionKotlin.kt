
fun getData():String{
    return "Hello"
}

fun getDummyData(): String = "hello Kotlin"
// unit for function don't have  return

fun sayHello(myMsg:String){
    val msg="hello $myMsg"
    println(msg)
}

fun sayHello(myMsg: String,myMsg2: String)= println("Hello $myMsg and $myMsg2")

fun main(){
    println(getData())
    println(getDummyData())
    sayHello("mahmoud","ahmed")
}