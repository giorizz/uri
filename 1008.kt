import java.util.*

fun main(args: Array<String>) {
    var numf = readLine()!!.toInt()
    var hrst = readLine()!!.toInt()
    var salf = readLine()!!.toDouble()
    var calc = hrst * salf
    println("NUMBER = $numf")
    println("SALARY = U$ %.2f".format(calc))
}