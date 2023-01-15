package foo.test

class ModList {
    fun flattenList(input: List<*>): List<Any?> {
        val result = input.flatMap {
            if (it is Iterable<*>) it.filterNotNull() else listOf(it)
        }
        return result
    }
    /*
    The flatMap function iterates through the list and applies a lambda function to each element.
    The lambda function checks if the current element is an Iterable. If so,
    it filters the null values and flattens it, otherwise it wraps the element in a list.
    It then concatenates the results to produce a flattened list.
     */
}