fun main() {
    val number3 = 9.4f
   val x = addTwoNumbers(2.0f, 4.7f) + number3
    print("Sum of floats is = $x")
}

fun addTwoNumbers(number1:Float, number2:Float): Float {
    val answer = number1 + number2
    //print("Answer = $answer")
    return answer
}


//write a function that takes two integers
// from the keyboard, and returns their sum