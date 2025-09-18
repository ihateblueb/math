package site.remlit.blueb.math.util

fun <T> reportAnswer(
	num: Int,
	ans: site.remlit.blueb.math.set.Set<T>
) = println("$num: ${ans.list}")