fun main() {
    // put your code here
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    var c = readLine()!!.toInt()
    var sum = 0
    if (a > 0) sum++
    if (b > 0) sum++
    if (c > 0) sum++
    if (sum == 1) println("true") else println("false")
}