fun main(args: Array<String>) {
    //WHILE LOOP
    var countOne = 0
    while (countOne <=5){
        println(countOne)
        countOne++
    }
//DO WHILE LOOP
    var countTwo = 10
    do {
        println(countTwo)
        countTwo++
    }while (countTwo <= 15)

    //REPEAT LOOP
    repeat(7){
        println("Good morning")
    }
    //FOR IN LOOP
    var names = arrayOf("King","masetu","shanky","faith","brian")
    //names.sort
    names.sortDescending()
    for (jina in names){
        println(jina)
    }

    var ascendingNumbers = 0 .. 20
    for (nambari in ascendingNumbers){
        println(nambari)
    }
    var descendingNumbers = 20 downTo 0
    for (n in descendingNumbers){
        println(n)
    }
}