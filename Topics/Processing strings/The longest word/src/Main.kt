fun main() {
    val str = readLine()!!.split(" ")
    var word = str[0]
    var wordLen = str[0].length
    for (i in str) {
        if (i.length > wordLen) {
            wordLen = i.length
            word = i
        }
    }
    println(word)
}