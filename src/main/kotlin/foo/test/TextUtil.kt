package foo.test

class TextUtil {

    fun isPangram(input: String): Boolean {
        for (character in ALPHABET) { // Check if all values in alphabet is in it.
            if (!input.contains(character)) { // When the array value doesn't have a character from alphabet..
                return false
            }
        }
        return true
    }

    fun isPangramResult(sentence: String, isAPangram: Boolean) {
        // With multiple parameter inputs, you have to name them. (a: Int b: String)
        if (isAPangram) {
            println("\"$sentence\" is a Pangram")
        } else {
            println("\"$sentence\" is not a Pangram")
        }
    }

    companion object {
        const val ALPHABET = "abcdefghijklmnopqrstuvwxyz"
    }
}