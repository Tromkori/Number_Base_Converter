fun main() {
    // put your code here
    val h1: Int = readLine()!!.toInt()
    val h2: Int = readLine()!!.toInt()
    val h3: Int = readLine()!!.toInt()
    val x = (h2 in h3..h1) || (h2 in h1..h3)
    print(x)
}