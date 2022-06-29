fun main(args: Array<String>) {
    motto()
    average(23.0, 50, 65.0f)
    userVerification("kingwanyama","kingwanyama@gmail.com")
    addition(2,33.0)
    login("king")
    login("kingwanyama@gmail.com","kingwanyama123")
}

fun motto(){
    println("hello this' our motto")
}
fun userVerification(username:String, email:String){
    println("Your username is $username and your email is $email")
}

fun average(x:Double, y:Int, z:Float){
    var result = (x + y + z)/3.0
        println("Hello your average is $result")
}

fun addition(x:Int, y:Double):Double {
    var answer = x + y
    return answer
}

fun login(name:String){
    println("Hello your name is $name")
}
fun login(email:String,password:String){
    println("Hello your email is $email and your password is $password")
}