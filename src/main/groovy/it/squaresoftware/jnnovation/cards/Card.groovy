package it.squaresoftware.jnnovation.cards

abstract class Card {
	private final String name

	Card(String name) {
		this.name = name
	}

	String getName() {
		return name
	}
}