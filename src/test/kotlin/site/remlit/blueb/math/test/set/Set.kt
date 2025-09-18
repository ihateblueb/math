package site.remlit.blueb.math.test.set

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows
import site.remlit.blueb.math.set.*
import kotlin.test.assertEquals

class Set {
    @Test
    fun createSet() {
        assertDoesNotThrow {
            Set(listOf("orange", "apple", "banana"))
        }
    }

    @Test
    fun getCardinality() {
        assertEquals(3, Set(listOf("orange", "apple", "banana")).cardinality)
    }

    @Test
    fun getPossibleSubsets() {
        assertEquals(8L, Set(listOf("orange", "apple", "banana")).possibleSubsets)
    }

    @Test
    fun createUniversalSet() {
        val one = Set(listOf(1, 2, 3, 4))
        val two = Set(listOf(7, 8, 10, 14, 19))
        val universal = Set(listOf(1, 2, 3, 4, 7, 8, 10, 14, 19))

        assertEquals(universal.list, createUniversalSet(one, two).list)
    }

    @Test
    fun noDuplicates() {
        assertThrows<IllegalArgumentException> {
            Set(listOf(1, 1, 3, 1, 2, 4))
        }
    }

    @Test
    fun nothingButIntOrString() {
        assertThrows<IllegalArgumentException> {
            Set(listOf(5L, 8L, 14L))
        }
    }

    @Test
    fun doIntUnion() {
        val one = Set(listOf(1, 2))
        val two = Set(listOf(3, 4, 5))
        val union = Set(listOf(1, 2, 3, 4, 5))

        assertEquals(union.list, (one union two).list)
    }

    @Test
    fun doStringUnion() {
        val one = Set(listOf("orange", "banana"))
        val two = Set(listOf("apple", "plum", "peach"))
        val union = Set(listOf("orange", "banana", "apple", "plum", "peach"))

        assertEquals(union.list, (one union two).list)
    }

    @Test
    fun doIntIntersection() {
        val one = Set(listOf(1, 2, 3, 4))
        val two = Set(listOf(3, 4, 5))
        val union = Set(listOf(3, 4))

        assertEquals(union.list, (one intersection two).list)
    }

    @Test
    fun doStringIntersection() {
        val one = Set(listOf("orange", "banana", "apple", "plum"))
        val two = Set(listOf("apple", "plum", "peach"))
        val intersection = Set(listOf("apple", "plum"))

        assertEquals(intersection.list, (one intersection two).list)
    }

    @Test
    fun doDisjointIntersection() {
        val one = Set(listOf(1, 2, 3, 4))
        val two = Set(listOf(10, 12, 13))

        assertEquals(nullSet<Int>().list, (one intersection two).list)
        assertEquals(true, (one isDisjoint two))
    }

    /* Real Problems */

    fun <T> reportAnswer(
        num: Int,
        ans: site.remlit.blueb.math.set.Set<T>
    ) = println("$num: ${ans.list}")

    @Test
    fun allRealProblems() {
        realProblem3()
        realProblem()
        realProblem2()
    }

    @Test
    fun realProblem() {
        val a = Set(listOf(
            31, 35, 36, 37
        ))
        val b = Set(listOf(
            33, 36, 37, 38, 39
        ))
        val c = Set(listOf(
            31, 32, 33, 35, 36, 39
        ))
        val d = Set(listOf(
            31, 39, 33, 32, 36, 35
        ))
        val e = Set(listOf(
            30, 31, 32, 33
        ))
        val f = Set(listOf(
            31, 33, 35
        ))

        val u = createUniversalSet(a, b, c, d, e, f)

        reportAnswer(51, a intersection c)
        reportAnswer(52, f intersection e)
        reportAnswer(53, c intersection e)
        reportAnswer(54, a intersection b intersection c)
        reportAnswer(55, e union f)
        reportAnswer(56, c union e)
        reportAnswer(57, a union c)
        reportAnswer(58, b diff c)
        reportAnswer(59, a diff c)
        reportAnswer(60, b complement u)
    }

    @Test
    fun realProblem2() {
        val g = Set(listOf(
            "apple", "cherry", "orange", "raspberry"
        ))
        val h = Set(listOf(
            "banana", "cherry", "grape", "orange", "peach"
        ))
        val j = Set(listOf(
            "apple", "grape", "orange"
        ))
        val k = Set(listOf(
            "banana", "grape", "orange", "peach", "raspberry", "strawberry"
        ))

        val u = createUniversalSet(g, h, j, k)

        reportAnswer(61, h complement u)
        reportAnswer(62, (g union j) complement u)
        reportAnswer(63, (g complement u) union (j complement u))
        reportAnswer(64, k diff h)
        reportAnswer(65, (h intersection k) complement u)
        reportAnswer(66, (h complement u) union (k complement u))
        reportAnswer(67, g union h union j)
        reportAnswer(68, g intersection h intersection k)
        reportAnswer(69, k diff (g union h))
        reportAnswer(70, g intersection (h union j))
        reportAnswer(71, (j intersection k) diff g)
        reportAnswer(72, (h intersection k) diff j complement u)
    }

    @Test
    fun realProblem3() {
        val a = Set(listOf(
            "a", "g", "h"
        ))
        val b = Set(listOf(
            "b", "g", "h"
        ))
        val c = Set(listOf(
            "b", "c", "d", "e", "f"
        ))

        val u = createUniversalSet(a, b, c)

        reportAnswer(25, a intersection b)
        reportAnswer(26, b intersection c)
        reportAnswer(27, a union b)
        reportAnswer(28, b union c)
        reportAnswer(29, a complement u)
        reportAnswer(30, b complement u)
        reportAnswer(31, (a complement u) intersection (b complement u))
        reportAnswer(32, (b complement u) intersection c)
        reportAnswer(33, a union (c complement u))
        reportAnswer(34, b union (c complement u))
        reportAnswer(35, (a intersection c) complement u)
        reportAnswer(36, (a intersection b) complement u)
        reportAnswer(37, (a complement u) union (c complement u))
        reportAnswer(38, (a complement u) union (b complement u))
    }
 }