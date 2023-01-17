import foo.test.ModList

fun main() {
    val nestedList = listOf(
        1, listOf(2, null, listOf(6, 7, 8, listOf(2, 3))), listOf(null), 5,
        listOf(
            listOf(
                listOf(
                    listOf(3)
                )
            )
        )
    )
    val modList = ModList()

    println(modList.flattenList(nestedList))

    // expected: [1, 2, 6, 7, 8, 2, 3, 5, 3]
    // task extended: 3b)
    // function should handle infinite nested lists => TODO.
    // no sorting or duplicate removal is needed.
    // if you are a real hacker: no Kotlin helper functions allowed - only use loops & functions -> Recursion
}