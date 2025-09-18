package site.remlit.blueb.math.generic

/**
 * Calculate the number of possible combinations of n to r where order does not matter.
 *
 * @param this Number of elements
 * @param r Number of groups this can be put into
 *
 * @return Long equivalent of number of possible combinations.
 * */
infix fun Int.nCr(r: Int): Long {
	val n = this

	if (n < r)
        throw IllegalArgumentException("n must be greater or equal to r")

	if (r == n)
        return factorial { n }

	return factorial { n } / (factorial { n - r } * factorial { r })
}