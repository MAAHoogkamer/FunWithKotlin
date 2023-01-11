fun main2() {
    println("Is it a Pangram? \nPlease enter a text to check.")
    val textToCheck = readLine()!!.lowercase()
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    var isAPangram = true

    for (x in alphabet) {
        if (!textToCheck.contains(x)) {
            isAPangram = false
            break
        }
    }

    if (isAPangram) {
        println(textToCheck + " is a Pangram")
    } else {
        println(textToCheck + " is not a Pangram")
    }
}