package it.squaresoftware.jnnovation

import java.util.List

abstract class AbstractPlayer implements Player {
	
	List<Card> handCards
	List<PlayerDeck> decks
	List<Card> dominations
	List<Card> influence
}
