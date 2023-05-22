/**
 * High order functions receive functions as parameters
 * and can also return functions.
 *
 * Consider function addTwoIntegers below, it takes
 * parameters; a and b; both integers and also a function/lambda
 * addedNumbers that takes an integer and returns a string
 *
 * When calling a lambda, it's important You define its body(code)
 * while defining it e.g. val numbersFirst in the main function, cause when calling it in the high order function,
 * it only requires its name, and no definition e.g. val x in the main function.
 *
 * A high order function can also return a function e.g. function high which returns a string but since our lambda parameter returns
 * a string as well, the function can also return the lambda which is its parameter
 */

fun main() {

    val numbersFirst:(Int) -> String = {
        it.toString()
    }

    val x = addTwoIntegers(3, 6, numbersFirst)
    println(x)



    val p = myFun("5")
    print(p::class.java.typeName)

    val rest = {a:Int, b:Int -> a + b }
    print(rest(2, 5))

    val ex:(String, String) -> (String) = {s, t -> s + t}
    print(high("5", "t", ex))

    val d = high("c", "f") { _, _ ->
        "tree" + "form"
    }
    print(d)

    val y = panOut(myFun)
    print(y)
}

fun addTwoIntegers(a:Int, b:Int, addedNumbers:(Int) -> (String)): String {
    return  "Result is Good"
}

val myFun: (String) -> (Int) = { level -> level.toInt() }

fun high(a:String, b:String, trial:(String, String)->(String)): String {
    return trial(a, b)
}

fun panOut(ex:(String) -> (Int)) {
    print("Result is $ex")
}
