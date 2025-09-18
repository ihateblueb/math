package site.remlit.blueb.math.set

import site.remlit.blueb.math.generic.exp

/**
 * A null set. Contains no elements and has a cardinality of 0.
 * */
val NullSet: Set<Nothing> =
    Set(emptyList<Nothing>())

/**
 * Class representing a mathematical set.
 *
 * @param set List representation of set
 * */
class Set<T>(set: List<T>) {
    /**
     * Size of a list
     * */
    val cardinality = set.size

    /**
     * Number of possible subsets this set could have
     * */
    val possibleSubsets = 2 exp cardinality

    /**
     * List representation of set
     * */
    val list = set

    /**
     * Adds together the elements of the sets.
     *
     * @param x Other set
     *
     * @return Set containing the elements of this one and the other set
     * */
    infix fun union(x: Set<T>): Set<T> = TODO()

    /**
     * Finds the overlap between the sets.
     *
     * @param x Other set
     *
     * @return Set containing the elements that overlap between these two sets
     * */
    infix fun intersection(x: Set<T>): Set<T> = TODO()

    /**
     * Removes the items from this set that are in the other set.
     *
     * @param x Other set
     *
     * @return Set containing the elements that weren't in the other set
     * */
    infix fun diff(x: Set<T>): Set<T> = TODO()

    /**
     * Determine if union of two sets is disjoint.
     *
     * @param x Other set
     *
     * @return If the sets are disjoint or not
     * */
    infix fun isDisjoint(x: Set<T>): Boolean =
        this union x == NullSet

    /**
     * Finds the complement of this set. The complement is the items of the universal set, without the items from this set.
     *
     * @param u Universal set
     *
     * @return Complement set
     * */
    fun complement(u: Set<T>): Set<T> = TODO()

    /**
     * Finds the elements that belong in one of the sets but not both of the sets.
     *
     * @param x Other set
     *
     * @return Elements not belonging in both of the sets
     * */
    infix fun symmetricDiff(x: Set<T>): Set<T> = TODO()
}

/**
 * Creates a universal set from a list of sets.
 *
 * @param sets List of sets
 *
 * @return Set with distinct elements from each passed set
 * */
fun <T> createUniversalSet(sets: List<Set<T>>): Set<T> {
    val u = mutableListOf<T>()

    for (set in sets)
        set.list.forEach { u.add(it) }

    return Set(u.distinct())
}

/**
 * Creates a set with every possible combination of subsets.
 *
 * @param set Set to make a power set of
 *
 * @return Set of every possible combination of subset.
 * */
fun <T> createPowerSet(set: Set<T>): Set<Set<T>> = TODO()