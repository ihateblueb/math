package site.remlit.blueb.math.generic

/**
 * Turns the scientific notation of a number into the long it represents
 *
 * @param x Power of 10 to use
 *
 * @return Long number
 * */
infix fun Double.e(x: Int): Double {
    return this * (10 exp x)
}