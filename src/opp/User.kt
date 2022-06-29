package opp

fun main(args: Array<String>) {
    var firstUser = User("king", "king@gmail.com", "12345", "12345")
    firstUser.register()

    var secondUser = User("loitah","loitah@gmail.com", "123", "123")
    secondUser.register()
}

class User{
   var name:String
    var email:String
    var password:String
    var confirmpassword:String

    //This is a constructor
    constructor(name:String, email:String, password:String, confirmpassword:String){
        this.name = name
        this.email = email
        this.password = password
        this.confirmpassword = confirmpassword
    }
    //This are functionalities
    fun register(){
        if(!password.equals(confirmpassword)){
            println("passwords don't match")
        }else{
            println("user registered successfully")
        }
    }

    fun login(){
        if (email.equals("emobilis@gmail.com")&& password.equals(12345)){
            println("login successful")
        }else{
            println("login failed")
        }
    }
}