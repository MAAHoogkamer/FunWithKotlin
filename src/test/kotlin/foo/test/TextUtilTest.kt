package foo.test

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

internal class TextUtilTest {

    private val textUtil = TextUtil()

    @Test
    fun `is Pangram false`() {
        // 1. setup - if you need certain pre conditions
        // but here not needed for the moment

        // 2. execute the unit under test
        // aka the business logic (part) will be executed
        val isAPangram = textUtil.isPangram("a b c")

        // 3. assert
        assertEquals(expected = false, actual = isAPangram) // kotlin.test
        // junit asserts - Baeldung.com doc.
    }

    @Test
    fun `is Pangram true`() {
        val isAPangram = textUtil.isPangram("The quick brown fox jumps over the lazy dog.")
        assertEquals(true, isAPangram)
    }

    @Test
    fun `is pangram with another use case`() {
    }
}