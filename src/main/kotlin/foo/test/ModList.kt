package foo.test

class ModList {
    fun flattenList(list: List<List<Any>>): List<Any> {
        return list.flatten()
    }

    //fun flattenList(input: List<*>): List<Any?> {
        //return input.flatten()
        // Kotlin needs type declaration, * is for unknown input type
        // Return type changed from Array to List<Any>, while flatten() returns List
        // Any is the supertype of all types in Kotlin, it can hold Any datatype
        // flatten() only works with Collections like List.

    //}

}