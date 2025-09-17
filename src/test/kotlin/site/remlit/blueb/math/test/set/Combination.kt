package site.remlit.blueb.math.test.set

import org.junit.jupiter.api.assertThrows
import site.remlit.blueb.math.set.nCr
import kotlin.test.Test
import kotlin.test.assertEquals

class Combination {
	@Test
	fun testCombination() {
		assertEquals(120L, 5 nCr 5)
	}

	@Test
	fun testCombination2() {
		assertEquals(270725L, 6 nCr 2)
	}

	@Test
	fun testCombination3() {
		assertEquals(270725L, 20 nCr 4)
	}

	@Test
	fun testCombination4() {
		assertThrows<IllegalArgumentException> {
			4 nCr 5
		}
	}
}