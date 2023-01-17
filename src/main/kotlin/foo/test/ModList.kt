package foo.test

class ModList {
    // Only works with 1 layer of nested lists
    fun flattenList(input: List<*>): List<Any?> {
        val result = input.flatMap {
            if (it is Iterable<*>) it.filterNotNull() else listOf(it)
        }
        return result
    }
    var newList: MutableList<Int> = mutableListOf() // Variable needs to be outside of function scope, otherwise
    // using it in a recursion doesn't work. List is immutable.
    fun flattenListRecursive(input: List<*>): List<Int> {
        // TODO
        // use Recursion, loops, functions - flattenListRecursive()

        // Idea: Use for loop to iterate through List, if the element is another list, call itself (the function)
        // on this element.
        for (element in input) {
            if (element is Int) {
                newList.add(element)
            } else if (element is List<*>) {
                flattenListRecursive(element)
            }
        }
        return newList

    }
    /*
    The flatMap function iterates through the list and applies a lambda function to each element.
    The lambda function checks if the current element is an Iterable*. If so,
    it filters the null values and flattens it, otherwise it wraps the element in.

    * Iterable is an object which can be looped over or iterated over with the help of a for loop.
    Objects like lists, tuples, sets, dictionaries, strings, etc. are called iterables.
    In short and simpler terms, iterable is anything that you can loop over.
    In this case; is it iterable = a collection within the collection.
     */
}