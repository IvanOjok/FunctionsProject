open class Box {
    private var length:Int? = null
    open protected  var width:Int = 3
    open val height:Int = 9
}

open class Brown: Box() {
    override val height: Int = 5
    override var width: Int = 6
    val tree:String = ""
    val rest:Float ?= null
}

class Black: Brown() {
    override val height: Int = super.height
}


fun main() {
    val x = Black()
    println(x.height)
}