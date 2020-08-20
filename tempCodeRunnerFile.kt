import java.util.*

fun main(args: Array<String>) {
    var temp = readLine()!!.toInt()
    var velm = readLine()!!.toInt()
    var dist = velm * temp
    var calc = dist * velm / temp
    println(calc)
}