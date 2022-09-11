fun main() {
    var MuhammadIQ = 117
    println("Old Muhammad Mahran's Iq is $MuhammadIQ")
    MuhammadIQ = 136
    println("Current Muhammad Mahran's Iq is = $MuhammadIQ")
    /*He use the dollar sign in commas "$MuhammadIQ to determine the variables we can also use this" */
    println("Muhammad's Iq is" + MuhammadIQ) /* put this is a bit of complex the easier is to just use dollar signs but
    in some cases we must use "String"+ Variable*/

    //now that's how execute variables but what is data types

    var name:String = "Muhammad"
    var age:Int = 15
    var pi:Double = 3.141592653659
    var num:Long = 313123131231312313
    var grade:Char = 'A'
    var male:Boolean = true
    var tall:Float = 5.11F

    println("my name is $name and my age is $age my gpa grade is $grade" +
            " i am a $male alpha male i  am $tall i know the pi is $pi" +
            "      " +
            "i can give you sum random long number like $num")

    println()

    var alphamale:Boolean? =null
    println(alphamale)
    alphamale = true
    println(alphamale)
}