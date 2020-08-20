import java.util.*

fun main() {
    var teste: List<String> = readLine()!!.split(" ")
    var teste2: List<String> = readLine()!!.split(" ")
    var calc = (teste[1].toDouble() * teste[2].toDouble()) + (teste2[1].toDouble() * teste2[2].toDouble())
    println(""calc)
}