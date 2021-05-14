import java.math.BigInteger
fun main() {
    // write your code here
    val a = readLine()!!.toBigInteger()
    val b = readLine()!!.toBigInteger()
    println("$a = $b*${a / b} + ${a % b}")
}