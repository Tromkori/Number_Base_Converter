fun main() {
    // put your code here
    val a: Int = readLine()!!.toInt()
    val b: Int = readLine()!!.toInt()
    val c: Int = readLine()!!.toInt()
    val x =  a!=b && b!=c && a!=c
    print(x)
}