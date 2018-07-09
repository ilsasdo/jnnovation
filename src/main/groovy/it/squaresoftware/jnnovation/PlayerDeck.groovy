package it.squaresoftware.jnnovation

import it.squaresoftware.jnnovation.cards.Card
import it.squaresoftware.jnnovation.data.Color
import it.squaresoftware.jnnovation.data.SplayDirection

class PlayerDeck {

	Color color
	List<Card> cards = new ArrayList<>()
	SplayDirection splayDirection = SplayDirection.NONE

	boolean isSplayed () {
		return splayDirection != SplayDirection.NONE
	}
	
}
