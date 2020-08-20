import java.util.*

fun main(args: Array<String>) {
    var x = readLine()!!.toInt()
    var y = readLine()!!.toDouble()
    var calc = x / y
    println("%.3f km/l".format(calc))
}