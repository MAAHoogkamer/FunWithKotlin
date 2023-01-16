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
    The lambda function checks if the current element is an Iterable*. If so,
    it filters the null values and flattens it, otherwise it wraps the element in

    * Iterable is an object which can be looped over or iterated over with the help of a for loop.
    Objects like lists, tuples, sets, dictionaries, strings, etc. are called iterables.
    In short and simpler terms, iterable is anything that you can loop over.
     */
}