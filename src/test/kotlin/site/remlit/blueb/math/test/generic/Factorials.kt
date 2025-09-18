package site.remlit.blueb.math.test.generic

import site.remlit.blueb.math.generic.factorial
import kotlin.test.Test
import kotlin.test.assertEquals

class Factorials {
	@Test
	fun testFactorial() {
        assertEquals((5 * 4 * 3 * 2 * 1).toLong(), factorial { 5 })
	}

	@Test
	fun testFactorial2() {
        assertEquals((6 * 5 * 4 * 3 * 2 * 1).toLong(), factorial { 6 })
	}

	@Test
	fun testFactorial3() {
        assertEquals((8 * 7 * 6 * 5 * 4 * 3 * 2 * 1).toLong(), factorial { 8 })
	}

	@Test
	fun testFactorial4() {
        assertEquals((10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1).toLong(), factorial { 10 })
	}

	@Test
	fun testFactorial5() {
		// 20L so this starts as a long
        assertEquals(
            (20L * 19 * 18 * 17 * 16 * 15 * 14 * 13 * 12 * 11 * 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1),
            factorial { 20 })
	}

	@Test
	fun testFactorial6() {
        assertEquals(1L, factorial { 0 })
	}
}