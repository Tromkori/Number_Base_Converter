fun main() {
    val word = readLine()!!
    print(word.last())
    print(word.substring(1, word.lastIndex))
    print(word.first())
}