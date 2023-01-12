import foo.test.ModArray

fun main() {
        // var exampleArray = [1,[2,3,null,4],[null],5] in Kotlin looks like:
        val exampleArray: Array<Array<out Int?>> = arrayOf(arrayOf(1), arrayOf(2,3,null,4), arrayOf(null))

        val modArray = ModArray() // Create instance modArray of ModArray
        val flattenedArray = modArray.flattenArray(exampleArray).filterNotNull()
        // The new val uses the class method
        println(flattenedArray)

}