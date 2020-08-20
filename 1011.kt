import java.util.*

fun main(args: Array<String>) {
    var a = readLine()!!.toDouble()
    var b = readLine()!!.toDouble()
    var c = readLine()!!.toDouble()
    var tri = (a * c) / 2
    var cir = 3.14159 * c * c
    var tra = ((a + b) * c) / 2
    var qua = b * b
    var ret = b * a
    println("TRIANGULO: %.3f".format(tri))
    println("CIRCULO: %.3f".format(cir))
    println("TRAPEZIO: %.3f".format(tra))
    println("QUADRADO: %.3f".format(qua))
    println("ETANGULO: %.3f".format(ret))

}