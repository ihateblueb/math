package site.remlit.blueb.math.util

/**
 * Representation of constants related to a standard deck of cards.
 * */
object StandardDeck {
	val full = 52

	val suit = 52 / 4
	val diamond = suit
	val heart = suit
	val spade = suit
	val club = suit

	val red = 52 / 2
	val black = 52 / 2

	val jack = 4
	val queen = 4
	val king = 4
	val face = jack + queen + king
}