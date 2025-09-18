package site.remlit.blueb.math.test.generic

import site.remlit.blueb.math.generic.e
import kotlin.test.Test
import kotlin.test.assertEquals

class ScientificNotation {
    @Test
    fun small() {
        assertEquals(5213.0, 5.213 e 3)
    }

    @Test
    fun medium() {
        assertEquals(5232423413.0, 5.232423413 e 9)
    }

    @Test
    fun incomplete() {
        assertEquals(52324234.13, 5.232423413 e 7)
    }
}