package opp

fun main(args: Array<String>) {
    var firstAdmin = Admin("King", 900000.00, "king@gmail.com")
    firstAdmin.registerUser()
    println(firstAdmin.salary)

    firstAdmin.setidNumber("11223344")
    println(firstAdmin.getidnumber())
}

class Admin {
    var name:String
    var salary:Double
    var email:String
    private var phoneNumber:String = ""
    private var idnumber:String = ""

    constructor(name:String, salary:Double, email:String){
        this.name = name
        this.email = email
        this.salary = salary
    }

    fun registerUser(){
        println("I can register a user")
    }

    fun  suspendEmployee(){
        println("I can suspend an employee")
    }

    fun setphoneNumber(phoneNumber:String){
        this.phoneNumber = phoneNumber
    }
    fun getphoneNumber(phoneNumber: String): String {
        return this.phoneNumber
    } fun setidNumber(idnumber:String){
        this.idnumber = idnumber
    }
    fun getidnumber(phoneNumber: String): String {
        return this.idnumber
    }

    fun getidnumber() {

    }
}