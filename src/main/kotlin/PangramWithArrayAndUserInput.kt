package foo.test
fun main() {
    println("How many texts would you like to check?")
    val textEntries = readLine()
    val textEntries1 = textEntries?.toInt()
    val sentences = arrayListOf<String>()
    for (i in 0 until textEntries1!!) {
        println("Please enter the text to check.")
        val input = readLine()
        if (input != null) {
            sentences.add(input)
        }
    }

    val textUtil = TextUtil()

    for (sentence in sentences) { // For every value in the array...

        val isAPangram = textUtil.isPangram(sentence)

        if (isAPangram) {
            println("\"$sentence\" is a Pangram")
        } else {
            println("\"$sentence\" is not a Pangram")
        }
    }
}


