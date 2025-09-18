package site.remlit.blueb.math.test.probability

import site.remlit.blueb.math.probability.prob
import kotlin.test.Test
import kotlin.test.assertEquals

class Probability {
	@Test
	fun testTheoretical() {
		assertEquals(1.toDouble() / 6, prob(1, 6))
	}
}