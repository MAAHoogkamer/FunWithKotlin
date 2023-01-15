import foo.test.ModList

fun main() {
        val nestedList = listOf(1, listOf(2, null, 4), listOf(null), 5)
        val modList = ModList()

        println(modList.flattenList(nestedList))
}