package foo.test

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

internal class ModListTest {
    private val modList = ModList()

    @Test
    fun `flattenList return a flat list without null values`() {
        val nestedList = listOf(1, listOf(2, null, 4), listOf(null), 5)
        val expected = listOf(1, 2, 4, 5)
        val result = modList.flattenList(nestedList)
        assertEquals(expected, result)
    }

    @Test
    fun `flattenList return an empty list for empty input`() {
        val nestedList = listOf<Any>()
        val expected = emptyList<Any>()
        val result = modList.flattenList(nestedList)
        assertEquals(expected, result)
    }

    @Test
    fun `flattenList return the same list for flat input`() {
        val nestedList = listOf(1, 2, 3, 4, 5)
        val expected = listOf(1, 2, 3, 4, 5)
        val result = modList.flattenList(nestedList)
        assertEquals(expected, result)
    }

    @Test
    fun `flattenListRecursive using multi nested list, return a flat list without null values`() {
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
        val expected = listOf(1, 2, 6, 7, 8, 2, 3, 5, 3)
        val result = modList.flattenListRecursive(nestedList)
        assertEquals(expected, result)
    }

    @Test
    fun `flattenListRecursive return an empty list for empty input`() {
        val nestedList = listOf<Any>()
        val expected = emptyList<Any>()
        val result = modList.flattenListRecursive(nestedList)
        assertEquals(expected, result)
    }

    @Test
    fun `flattenListRecursive return the same list for flat input without strings`() {
        val nestedList = listOf(1, 2, 3, 4, 5, listOf("1", "2", "3", "4", "5"))
        val expected = listOf(1, 2, 3, 4, 5)
        val result = modList.flattenListRecursive(nestedList)
        assertEquals(expected, result)
    }
}



