interface PersonInfoProvider {
    fun printerInfo(person: Person)
}

 class BasicInfoProvider : PersonInfoProvider{
     override fun printerInfo(person: Person) {

         println("PrintInfo ${person.nickName}")
     }

 }

fun main(){
    val provider=BasicInfoProvider()


    provider.printerInfo(Person ())
}