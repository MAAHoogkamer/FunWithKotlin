fun main() {
        // var array = [1,[2,3,null,4],[null],5] in Kotlin looks like:
        val exampleArray: Array<Array<out Int?>> = arrayOf(arrayOf(1), arrayOf(2,3,null,4), arrayOf(null))
}