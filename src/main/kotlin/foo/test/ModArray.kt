package foo.test

class ModArray {

    fun flattenAray(input: Array<*>): Array<*> { // Kotlin needs type declaration, * accepts any datatype
        val flattened = input.flatten() // Kotlin has this function for flattening
        return flattened
    }
}