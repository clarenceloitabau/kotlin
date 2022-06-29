package opp

fun main(args: Array<String>) {
    var firstStudent = Student("Faith",100)
     firstStudent.viewResults()
    var firstBoardmember = boardMember("linet", 25)
    firstBoardmember.publishMagazine()
}
open class Teacher(open var name:String, open var age:Int) {
    fun viewResults(){
        println("Hello $name you can view results")
    }
    fun publishMagazine(){
        println("Hello $name you are $age years and you can publish a magazine")
    }
}

open class Student(name: String, age: Int):Teacher(name,age){
    fun sitForExams(){
        println("Hello,I can sit for exams")
    }
}

class boardMember(name: String, age: Int):Student(name, age){

}