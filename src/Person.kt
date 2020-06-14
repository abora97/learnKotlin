class Person (_fName:String,_lName:String){

     val fName:String=_fName
     val lName:String=_lName

//    init {
//        fName=_fName
//        lName=_lName
//    }

    init {
        println("init 1")
    }

    // called when get object and don't add parmiters
    constructor():this("mahmoud","elebiary"){
        println("secondary constructor")
    }

    init {
        println("init 2")
    }

    var nickName:String?= null
    set (value){
        field=value
        println("the new nickName is $value")

    }
    get(){
        println("the returned nickName is $field")
        return field
    }


}