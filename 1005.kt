import java.util.*

fun main(args: Array<String>) {
    var A = readLine()!!.toDouble()
    var B = readLine()!!.toDouble()
    var calc = ((A * 3.5) + (B * 7.5)) / (3.5 + 7.5)
    println("MEDIA = %.5f".format(calc))
}