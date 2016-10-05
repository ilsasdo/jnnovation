package it.squaresoftware.jnnovation

import java.util.List

abstract class AbstractPlayer implements Player {
	
	List<Card> handCards
	List<PlayerDeck> decks
	List<Card> dominations
	List<Card> influence
	
	int getInfluenceCount () {
		int sum = 0
		for (Card card : influence) {
			sum += card.era
		}
		return sum
	}
	
	int getResourceCount (Resource resource) {
		int sum = 0
		for (Card card : influence) {
			sum += card.era
		}
		return sum
	}
}
