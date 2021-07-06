fun main() {
    println(removeVowels("The Quick brown fox jumps over the lazy dog"))
}

fun removeVowels(words: String): String {
    val re = StringBuilder()
    for (i in words) {
        if (i != 'A' && i != 'a'
            && i != 'E' && i != 'e'
            && i != 'I' && i != 'i'
            && i != 'O' && i != 'o'
            && i != 'U' && i != 'u') {
            re.append(i)
        }
    }
    return re.toString()
}

