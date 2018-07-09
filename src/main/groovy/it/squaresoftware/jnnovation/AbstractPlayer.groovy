package it.squaresoftware.jnnovation

import it.squaresoftware.jnnovation.cards.Card

abstract class AbstractPlayer implements Player {
	
	List<Card> handCards
	List<PlayerDeck> decks
	List<Card> dominations
	List<Card> influence
}
