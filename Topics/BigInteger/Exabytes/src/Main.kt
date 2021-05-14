import java.math.BigInteger

fun main() {
    // write your code here
    var a = readLine()!!
    var num = BigInteger("9223372036854775808")
    val res = num * a.toBigInteger()
    println(res)
}