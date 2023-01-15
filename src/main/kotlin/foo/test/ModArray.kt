package foo.test

class ModArray {

    fun flattenArray(input: Array<*>): List<Any?> {
        val result = mutableListOf<Any?>()
        for (element in input) {
            if (element is Array<*>) {
                result.addAll(flattenArray(element))
            } else {
                result.add(element)
            }
        }
        return result.filterNotNull()
        // Kotlin needs type declaration, * is for unknown input type
        // Return type changed from Array to List<Any>, while flatten() returns List
        // Any is the supertype of all types in Kotlin, it can hold Any datatype
        // flatten() only works with Collections like List.

    }

}