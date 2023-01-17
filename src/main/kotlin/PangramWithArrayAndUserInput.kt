import foo.test.TextUtil

fun main() {
    println("How many texts would you like to check?")
    var textEntries: Int? // Initializes a variable which can contain Int or Null(=?)
    val textEntriesInput = readLine()
    textEntries= textEntriesInput?.toIntOrNull() // Sets textEntries to Int when Int, otherwise to Null

    // input can be everything: null, 1, 42, -3
    // 1. never trust input (data): expected: Integer, given: "doanwojdna"
    // 2. use null safe operator for nullable variables
    // 3.a !! enforces (casts) to non-null variable. only do that in business logic if you are 100% sure the var is not null
    // 3.b ;) test your code for null or similar cases
    // sunny case -> 3. bad/wrong: "", -42, null, ...

    if (textEntries == null || textEntries <= 0) { // Can't do if (!textEntries) in Kotlin
        println("Please enter a number (integer).")
        val newInput = readLine()
        textEntries = newInput?.toIntOrNull() // null safe operator
    }

    if (textEntries == null) {
        println("textEntries is null. returning") // handling error cases
        return
    }

    val sentences = arrayListOf<String>()
    // https://kotlinlang.org/docs/keyword-reference.html#special-identifiers
    for (i in 1 until textEntries + 1) { // !! is not-null enforcing operator, forces the variable to be non-null
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


