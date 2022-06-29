fun main(args: Array<String>) {
    var age =18
    if (age < 18){
        println("go home")
    }else{
        println("welcome to the party")
    }
    //grading system
    var marks = 30
    if (marks < 40){
        println("E")
    }else if (marks <50){
      println("D")
    }else if (marks <60){
        print("C")
    }else if (marks < 70){
        print("B")
    }else{
        print("A")
    }
    //BETTING SYSTEM
    var bettingnumber =0
    when(bettingnumber) {
        1 -> {
            println("oops! you have lost")
        }
        2->{
            println("oops! you have lost")
        }
        3->{
            println("oops! you have lost")
        }
        4->{
            println("congrats! YOU HAVE WON!!!")
        }
    }
}