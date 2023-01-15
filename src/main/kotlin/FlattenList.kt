import foo.test.ModList

fun main() {
        val nestedList = listOf(1, listOf(2, 3, null, 4), listOf(null), 5)
        val modList = ModList()

        val flattenedList = modList.flattenList(nestedList as List<List<Any>>)

        /*
        val flattenedList = nestedList.flatMap {
                if (it is Iterable<*>) it.filterNotNull() else listOf(it)
        }
         */
        println(flattenedList)
}