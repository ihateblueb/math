package site.remlit.blueb.math.set

import site.remlit.blueb.math.generic.factorial

/**
 * Calculate the number of possible permutations of n to r where order does matter.
 *
 * @param this Number of elements
 * @param r Number of groups this can be put into
 *
 * @return Long equivalent of number of possible permutations.
 * */
infix fun Int.nPr(r: Int): Long {
    val n = this

    if (n < r)
        throw IllegalArgumentException("n must be greater or equal to r")

    if (r == n)
        return factorial { n }

    return factorial { n } / factorial { n - r }
}