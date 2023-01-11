import foo.test.TextUtil

fun main() {
    val sentences = arrayOf(
        "Is it a Pangram? Please enter a text to check.",
        "The quick brown fox jumps over the lazy dog."
    )
    val textUtil = TextUtil()

    for (sentence in sentences) { // For every value in the array...

        val isAPangram = textUtil.isPangram(sentence)
        textUtil.isPangramResult(sentence, isAPangram)

    }
}