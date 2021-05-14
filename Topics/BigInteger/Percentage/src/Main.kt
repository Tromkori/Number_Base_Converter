import java.math.BigInteger
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val one = scanner.nextBigInteger()
    val two = scanner.nextBigInteger()
    val percentOne = BigInteger.valueOf(100) * one / (one + two)
    val percentTwo = BigInteger.valueOf(100) * two / (one + two)
    println("$percentOne% $percentTwo%")
}
