import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    // write your code here
    val sum = BigDecimal(readLine()!!)
    var interestRate = BigDecimal(readLine()!!)
    interestRate = interestRate.setScale(2 + interestRate.scale()) / BigDecimal(100)
    val year = readLine()!!.toInt()
    val yearlyPercent = (BigDecimal(1) + interestRate).pow(year)
    val finalAmount = (sum * yearlyPercent).setScale(2, RoundingMode.CEILING)
    println("Amount of money in the account: $finalAmount")
}
