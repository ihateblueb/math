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
        val union = Set(listOf("apple", "plum"))

        assertEquals(union.list, (one intersection two).list)
    }
 }