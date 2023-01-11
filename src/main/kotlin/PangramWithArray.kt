import foo.test.TextUtil

fun main() {
    val sentences = arrayOf(
        "Is it a Pangram? Please enter a text to check.",
        "The quick brown fox jumps over the lazy dog."
    )
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