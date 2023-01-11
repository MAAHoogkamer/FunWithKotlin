import foo.test.TextUtil

fun main() {
    println("How many texts would you like to check?")
    var textEntries: Int? // Initializes a variable which can contain Int or Null(=?)
    val textEntriesInput = readLine()
    textEntries= textEntriesInput?.toIntOrNull() // Sets textEntries to Int when Int, otherwise to Null

    if (textEntries == null) { // Can't do if (!textEntries) in Kotlin
        println("Please enter a number (integer).")
        val newInput = readLine()
        textEntries = newInput?.toIntOrNull()

    }
    val sentences = arrayListOf<String>()
    for (i in 1 until textEntries!!+1) { // !! is null-safety operator, forces the variable to be non-null
        println("Please enter text number $i.")
        val input = readLine()
        if (input != null) {
            sentences.add(input)
        }
    }
    val textUtil = TextUtil() // Creates instance of class TextUtil

    for (sentence in sentences) { // For every value in the array...

        val isAPangram = textUtil.isPangram(sentence)
        textUtil.isPangramResult(sentence, isAPangram)
        // Yes, isPangram and isPangramResult could be merged.
        // But I wanted to try this out.
    }
}


