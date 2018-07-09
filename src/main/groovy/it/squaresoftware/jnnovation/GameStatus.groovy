package it.squaresoftware.jnnovation

import it.squaresoftware.jnnovation.cards.Card

class GameStatus {
	private final List<Player> players
	private final List<List<Card>> ageDecks
	private final List<Card> fields
	private final List<Card> ages

	GameStatus(List<Player> players, List<List<Card>> ageDecks, List<Card> fields, List<Card> ages) {
		this.players = players
		this.ageDecks = ageDecks
		this.fields = fields
		this.ages = ages
	}

	List<Player> getPlayers() {
		return players
	}

	List<List<Card>> getAgeDecks() {
		return ageDecks
	}

	List<Card> getFields() {
		return fields
	}

	List<Card> getAges() {
		return ages
	}
}
