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

        val p51 = a intersection c
        println("51: " + p51.list)

        val p52 = f intersection e
        println("52: " + p52.list)

        val p53 = c intersection e
        println("53: " + p53.list)

        val p54 = a intersection b intersection c
        println("54: " + p54.list)

        val p55 = e union f
        println("55: " + p55.list)

        val p56 = c union e
        println("56: " + p56.list)

        val p57 = a union c
        println("57: " + p57.list)

        val p58 = b diff c
        println("58: " + p58.list)

        val p59 = a diff c
        println("59: " + p59.list)

        val p60 = b complement u
        println("60: " + p60.list)
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

        val p61 = h complement u
        println("61: " + p61.list)

        val p62 = (g union j) complement u
        println("62: " + p62.list)

        val p63 = (g complement u) union (j complement u)
        println("63: " + p63.list)

        val p64 = k diff h
        println("64: " + p64.list)

        val p65 = (h intersection k) complement u
        println("65: " + p65.list)

        val p66 = (h complement u) union (k complement u)
        println("66: " + p66.list)

        val p67 = g union h union j
        println("67: " + p67.list)

        val p68 = g intersection h intersection k
        println("68: " + p68.list)

        val p69 = k diff (g union h)
        println("69: " + p69.list)

        val p70 = g intersection (h union j)
        println("70: " + p70.list)

        val p71 = (j intersection k) diff g
        println("71: " + p71.list)

        val p72 = (h intersection k) diff j complement u
        println("72: " + p72.list)
    }
 }