fun main() {
var imali=Human("AYOMA",20,49)
    imali.eat(9)
    println(imali.weight)
    imali.speak("you can do anything you set your mind to do")
    imali.birthday()
    var okola=User("Happy","Ayoma","ayomahappy@gmail.com","0727890499","Mercy#1466")
    println(okola.email)
    println(okola.password)


}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int) :Int{
        println("I am eating $foodWeight kgs of food")
        weight=foodWeight+weight
        return weight

    }
    fun speak(speech:String){
        println("$speech")

    }
    fun birthday(){
        age++
        println(age)
    }
}
data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:  String,var password:String)