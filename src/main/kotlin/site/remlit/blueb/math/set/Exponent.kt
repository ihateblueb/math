package site.remlit.blueb.math.set

private fun exp(y: Long, x: Int): Long {
    var num = y

    for (i in 1..<x)
        num *= y

    return num
}

/**
 * Return this to the power of x.
 *
 * @param this Number
 * @param x Exponent
 *
 * @return Long equivalent of this to the power of x.
 * */
infix fun Int.exp(x: Int): Long = exp(this.toLong(), x)

/**
 * Return this to the power of x.
 *
 * @param this Number
 * @param x Exponent
 *
 * @return Long equivalent of this to the power of x.
 * */
infix fun Long.exp(x: Int): Long = exp(this, x)