package foo.test

class ModArray {
    // Doesn't work, try casting to list first
    fun flattenArray(input: Array<*>): List<Any?> { // Kotlin needs type declaration, * is for unknown input type
        // Return type changed from Array to List<Any>, while flatten() returns List
        // Any is the supertype of all types in Kotlin, it can hold Any datatype
        return input.flatMap { it as? Iterable<*> }
        // flatten() only works with Collections like List.
    }

}