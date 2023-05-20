fun main() {
    //printNumber("xerox")

//    val printing:(String) -> Unit = {
//        x -> println("The string is $x")
//    }
//    printing("Ivan")

    val addTwoNumbers2:() -> Unit = {
         ->
        println("Enter first number")
        val z = readln().toInt()
        println("Enter second number")
        val r = readln().toInt()
        val d = z + r
        println("Answer is $d")
    }
    println(addTwoNumbers2())

}

//fun printNumber(x:String): Unit {
//    println("The string is $x")
//}

//write a lambda that takes two floats, multiplies
// them,
//returns a string saying "Multiple is $multiple"
//print the returned statement