import java.math.BigInteger

fun main() {
    // write your code here
    val one = BigInteger(readLine()!!)
    val two = BigInteger(readLine()!!)
    val lcm = one / one.gcd(two) * two
    println(lcm)
}