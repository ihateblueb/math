package site.remlit.blueb.math.set

/**
 * Calculate the number of possible combinations of n to r where order does not matter.
 * */
infix fun Int.nCr(r: Int): Long {
	val n = this

	if (n < r)
        throw IllegalArgumentException("n must be greater or equal to r")

	if (r == n)
        return factorial { n }

	return factorial { n } / (factorial { n-r } * factorial { r })
}