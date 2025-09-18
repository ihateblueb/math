package site.remlit.blueb.math.probability

/**
 * Determines the base probability of something to happen.
 *
 * @param x Number of possible occurrences of specific condition
 * @param y Number of total possible outcomes
 *
 * @return Probability, as a double
 * */
@Theoretical
fun prob(x: Int, y: Int): Double =
	x.toDouble() / y.toDouble()