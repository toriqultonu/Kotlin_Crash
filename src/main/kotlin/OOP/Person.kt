package OOP

open class Person constructor(var firstName:String = "John",
                         var lastName:String = "Smith",
                         var age:Int = 1){

    val fullName:String?
        get() {
            return "$firstName $lastName"
        }

    constructor(year: Int):this(){
        age += year
    }

    open val id:String
    init {
        id = fullName+age
    }
}

class Employee(company:String):Person(), PersonAction{

    override val id = fullName+" "+company+age
    override fun wearClothes() {
        println("Employee wears suit and tie")
    }
}