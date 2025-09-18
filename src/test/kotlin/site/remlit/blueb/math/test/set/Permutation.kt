package site.remlit.blueb.math.test.set

import org.junit.jupiter.api.assertThrows
import site.remlit.blueb.math.set.nPr
import kotlin.test.Test
import kotlin.test.assertEquals

class Permutation {
    @Test
    fun testPermutation() {
        assertEquals(120L, 5 nPr 5)
    }

    @Test
    fun testPermutation2() {
        assertEquals(30L, 6 nPr 2)
    }

    @Test
    fun testPermutation3() {
        assertEquals(116280L, 20 nPr 4)
    }

    @Test
    fun testPermutation4() {
        assertThrows<IllegalArgumentException> {
            4 nPr 5
        }
    }
}