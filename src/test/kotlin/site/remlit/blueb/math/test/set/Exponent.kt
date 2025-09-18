package site.remlit.blueb.math.test.set

import site.remlit.blueb.math.set.exp
import kotlin.test.Test
import kotlin.test.assertEquals

class Exponent {
    @Test
    fun testExponent() {
        assertEquals((2L*2), 2 exp 2)
    }

    @Test
    fun testExponent2() {
        assertEquals((2L*2*2*2), 2 exp 4)
    }

    @Test
    fun testExponent3() {
        assertEquals((10L*10), 10 exp 2)
    }

    @Test
    fun testExponent4() {
        assertEquals((21L*21*21*21*21*21), 21 exp 6)
    }
}