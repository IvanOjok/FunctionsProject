fun main() {

    val numbersFirst:(Int) -> String = {
        it.toString()
    }

    val x = addTwoIntegers(3, 6, numbersFirst)
    println(x)
}

fun addTwoIntegers(a:Int, b:Int, addedNumbers:(Int) -> (String)): String {
    return  "Result is Good"
}