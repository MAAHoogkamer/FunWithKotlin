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

    companion object {
        const val ALPHABET = "abcdefghijklmnopqrstuvwxyz"
    }
}