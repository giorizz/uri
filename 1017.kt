import java.util.*

fun main(args: Array<String>) {
    var temp = readLine()!!.toDouble()
    var velm = readLine()!!.toDouble()
    var dist = velm * temp
    var calc = dist / 12
    println("%.3f".format(calc))
}