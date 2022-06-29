package opp

fun main(args: Array<String>) {
    var firstschool = School()
    firstschool.motto()
    println(firstschool.login())
}
interface  FirstInterface {
    var age:Int
    fun login():String
    fun motto(){
        println("Hello, this is our motto")
    }
}

class School():FirstInterface{
    override var age: Int = 100
    override fun login(): String {
        val loginStatement = "Yeah I can login"
        return loginStatement
    }

}