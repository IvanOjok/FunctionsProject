fun main() {
    val mul:(Float, Float) -> String = {
        a, b ->
        val x = a * b
        "Multiple is $x"
    }

    println(mul(3.0f, 2.1f))
}
