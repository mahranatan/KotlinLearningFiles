fun main() {
    println("What's your age?")
    var con:Int = readln().toInt()
    if (con < 18){
        println("sorry we don't accept minors (lower than 18)")
    }
    else {
        println("welcome friend")
    }
    println("")
    println("Please put your grade")
    val grade:Int = readln().toInt()
    if (grade >= 90) {
        println("Excellent you got A your grade is $grade")
    }
    else if (grade >= 65){
        println("You got B good for you your grade is $grade")
    }
    else {
        println("Congrats YOU FAILED IDIOT")
    }
}