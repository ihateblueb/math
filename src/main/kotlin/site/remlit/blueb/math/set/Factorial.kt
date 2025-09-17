package site.remlit.blueb.math.set

/**
 * Calculates the value of a factorial.
 * n! = n*(n-1)*(n-2)...*1
 * Example: 4! = 4*3*2*1
 * */
inline fun factorial(n: () -> Int): Long {
	var value = n().toLong()
	if (value == 0L) return 1
	val copy = value

	for (i in 1 ..< value)
		value *= (copy - i)

	return value
}