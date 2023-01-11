fun main1() {
    val arrayToCheck = arrayOf("Is it a Pangram? Please enter a text to check.", "The quick brown fox jumps over the lazy dog.")
    val alphabet = "abcdefghijklmnopqrstuvwxyz"

    for (y in arrayToCheck) { // For every value in the array...
        var isAPangram = true
        for (x in alphabet) { // Check if all values in alphabet is in it.
            if (!y.contains(x)) { //When the array value doesn't have a character from alphabet..
                isAPangram = false
                break
            }
        }
        if (isAPangram) {
            println("Test")
            println("\"$y\" is a Pangram")
        } else {
            println("test1")
            println("\"$y\" is not a Pangram")
        }
    }
}