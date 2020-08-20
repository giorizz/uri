import java.util.*

fun main(args: Array<String>) {
    var name = readLine() 
    var salario = readLine()!!.toDouble()
    var vendas = readLine()!!.toDouble()
    var calc = salario + (vendas * 0.15)
    println("TOTAL = R$ %.2f".format(calc))
}