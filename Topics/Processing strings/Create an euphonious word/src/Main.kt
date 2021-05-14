fun main() {
    val word = readLine()!!
    checkWord(word)
}

fun isVowel(c: Char): Boolean {
    val vowels = listOf('a', 'e', 'i', 'o', 'u', 'y')
    return c in vowels
}

fun checkWord(word: String) {
    var count = 0
    var currentTypeCount = 0
    var lastTypeVowel = true
    for (c in word) {
        if (isVowel(c) == lastTypeVowel) {
            if (++currentTypeCount == 3) {
                count++
                currentTypeCount = 1
            }
        } else {
            lastTypeVowel = !lastTypeVowel
            currentTypeCount = 1
        }
    }
    println(count)
}


/*
fun main() {
    // write your code here
    var str = readLine()!!.toString()
    var glas = 0
    var sogl = 0
    var count = 0
    str = str.replace(Regex("""[aeiouy]"""), "0")
    str = str.replace(Regex("""[bcdfghjklmnpqrstvwxz]"""), "1")
    for (i in str){
        if (i=='0') glas++ else sogl++
        if (glas==3 || sogl==3){
            count++
            glas=0
            sogl=0
        }
    }
    println(count)
}
*/