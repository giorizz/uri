import java.util.*

fun main(args: Array<String>) {
    var A = readLine()!!.toDouble()
    var B = readLine()!!.toDouble()
    var C = readLine()!!.toDouble()
    var calc = ((A * 2) + (B * 3) + (C * 5)) / (10)
    println("MEDIA = %.1f".format(calc))
}