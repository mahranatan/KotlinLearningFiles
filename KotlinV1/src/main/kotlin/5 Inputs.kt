import java.util.Calendar

fun main() {
    print("Please put your age --->")
    val age:Int = readln().toInt() //important
    val now =Calendar.getInstance().get(Calendar.YEAR) //to get the current year now or in the future
    val year = now - age
    println("you're born in $year")
}