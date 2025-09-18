package site.remlit.blueb.math.util

import site.remlit.blueb.math.set.Set

fun <T> reportAnswer(
	num: Int,
	ans: Set<T>
) = println("$num: $ans")

fun <T> reportAnswer(
	num: Int,
	ans: Collection<T>
) = println("$num: $ans")

fun reportAnswer(
	num: Int,
	ans: String
) = println("$num: $ans")

fun reportAnswer(
	num: Int,
	ans: Int
) = println("$num: $ans")

fun reportAnswer(
	num: Int,
	ans: Long
) = println("$num: $ans")