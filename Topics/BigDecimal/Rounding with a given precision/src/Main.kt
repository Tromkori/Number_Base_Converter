import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    // write your code here
    val a = BigDecimal(readLine()!!)
    val b = readLine()!!.toInt()
    val sum = a.setScale(b, RoundingMode.HALF_DOWN)
    println(sum)
}