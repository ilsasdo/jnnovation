package it.squaresoftware.jnnovation.cards

import it.squaresoftware.jnnovation.data.Color
import it.squaresoftware.jnnovation.data.Dogma
import it.squaresoftware.jnnovation.data.Resource

class AgeCard extends Card {
	private final int age
	private final Color color

	private final List<Resource> resources
	private final List<Dogma> dogmas

	AgeCard(String name, int age, Color color, List<Resource> resources, List<Dogma> dogmas) {
		super(name)
		this.age = age
		this.color = color
		this.resources = resources
		this.dogmas = dogmas
	}

	int getAge() {
		return age
	}

	Color getColor() {
		return color
	}

	List<Resource> getResources() {
		return resources
	}

	List<Dogma> getDogmas() {
		return dogmas
	}
}