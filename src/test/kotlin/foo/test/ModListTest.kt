package foo.test

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

internal class ModListTest {
    private val modList = ModList()

    @Test
    fun `return a flat list without null values`() {
        val nestedList = listOf(1, listOf(2, null, 4), listOf(null), 5)
        val expected = listOf(1, 2, 4, 5)
        val result = modList.flattenList(nestedList)
        assertEquals(expected, result)
    }

    @Test
    fun `return an empty list for empty input`() {
        val nestedList = listOf<Any>()
        val expected = emptyList<Any>()
        val result = modList.flattenList(nestedList)
        assertEquals(expected, result)
    }

    @Test
    fun `return the same list for flat input`() {
        val nestedList = listOf(1, 2, 3, 4, 5)
        val expected = listOf(1, 2, 3, 4, 5)
        val result = modList.flattenList(nestedList)
        assertEquals(expected, result)
    }
}



