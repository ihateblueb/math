package site.remlit.blueb.math.generic

/**
 * Return this to the power of x.
 *
 * @param this Number
 * @param x Exponent
 *
 * @return Long equivalent of this to the power of x.
 * */
infix fun Int.exp(x: Int): Long {
    var num = this.toLong()

    for (i in 1..<x)
        num *= this

    return num
}