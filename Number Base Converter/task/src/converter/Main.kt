package converter

import java.math.BigInteger
import java.util.Scanner
import kotlin.math.pow

internal class Num {
    var intPart: Long = 0
    var fractalPart = 0.0
    var intString: String? = null
    var fractalString: String? = null
    var isToOne = false
    var isWithFractal = false
}

val reader = Scanner(System.`in`)

//меню конвертора
fun main() {
    println("Enter two numbers in format: {source base} {target base} (To quit type /exit)")
    val sourceBase = reader.next()
    val targetBase: String
    if (sourceBase == "/exit") {
        println()
    } else {
        targetBase = reader.next()
        converter(sourceBase.toInt(), targetBase.toInt())
    }
}

//конвертер целых чисел
fun converter(sourceBase: Int, targetBase: Int) {
    println("Enter number in base $sourceBase to convert to base $targetBase (To go back type /back)")
    when (val numBase = reader.next()) {
        "/back" -> main()
        "/exit" -> println()
        else -> {
            if (numBase.contains('.')) {
                converterShort(numBase, sourceBase, targetBase)
            } else {
                println("Conversion to decimal result: ${BigInteger(numBase, sourceBase).toString(targetBase)}")
                converter(sourceBase, targetBase)
            }
        }
    }
}

//конвертер дробных чисел
fun converterShort(numBase: String, sourceBase: Int, targetBase: Int) {
    val roundUpFive = 5
    val num = Num()
    if (numBase.contains(".")) {
        num.isWithFractal = true
        val point = numBase.indexOf(".")
        num.intString = numBase.substring(0, point)
        num.fractalString = numBase.substring(point + 1)
    } else {
        num.intString = numBase
    }
    if (sourceBase == 1) {
        num.intPart = num.intString!!.length.toLong()
    } else {
        num.intPart = num.intString!!.toLong(sourceBase)
    }
    if (targetBase == 1) {
        num.isToOne = true
        for (i in 0 until num.intPart) {
            print(1)
        }
    } else {
        val intTarget = num.intPart.toString(targetBase)
        print("Conversion result: $intTarget")
    }
    if (!num.isToOne && num.isWithFractal) {
        val digits = num.fractalString!!.toCharArray()
        val fractalTarget = StringBuilder()
        fractalTarget.append(".")
        for (i in digits.indices) {
            val partOfFractal = (Character.digit(digits[i], sourceBase)
                    / sourceBase.toDouble().pow((i + 1).toDouble()))
            num.fractalPart += partOfFractal
        }
        for (i in 0 until roundUpFive) {
            val fractalToTargetRadix = num.fractalPart * targetBase
            val intPartOfFractal = fractalToTargetRadix.toLong()
            val intPartOfFractalStr = intPartOfFractal.toString(targetBase)
            num.fractalPart = fractalToTargetRadix - intPartOfFractal
            fractalTarget.append(intPartOfFractalStr)
        }
        print(fractalTarget.toString())
        println()
        converter(sourceBase, targetBase)
    }
}

