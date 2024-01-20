import OOP.Employee
import OOP.Person


fun main(args: Array<String>) {
//   var language:String?;
//    language = "tonu";
//    println("hello ${language}")
//    var arr = arrayOf(1,2,5);
//    println(arr[2])
//
//    val age = Integer.valueOf(readLine())
//    if (age >= 21) println("you are older")
//    else println("you not older")
//    val day = readLine();
//    val food = when(day) {
//        "Monday", "Wednesday" -> "Chicken"
//        "Friday" -> "Salmon"
//        "Sunday" -> "Steak"
//        else -> "Bacon"
//    }
//    println(food)

//    val list = listOf("Kotlin", "java", "python", "c++")
//    val map = mapOf(1 to "kotlin", 2 to "java", 3 to "python", 4 to "c++")
//
//    for((a,b) in map){
//        println("$a -> $b")
//    }
//
//    for(i in 1 until 9 step 2){
//        print(i)
//    }
//    println()
//    for(i in 9 downTo 1){
//        print(i)
//    }

    fun String.getEmotion(): String{
        return when{
            last() == '!' -> "fuck"
            last() == '.' -> "stop"

            else -> "unidentified"
        }
    }

    val s = "how are you."
    println(s.getEmotion())

    val p1 = Person("tonu", "islam")
    println(p1.fullName)

    val p3 = Person(year = 234)
    println("${p3.firstName} ${p3.age}")

    val el = Employee(company = "koshailimited")
    println("${el.firstName}  ${el.id}")
    el.wearClothes()
}