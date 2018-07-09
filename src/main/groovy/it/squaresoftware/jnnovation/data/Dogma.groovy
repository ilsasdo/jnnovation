package it.squaresoftware.jnnovation.data

import it.squaresoftware.jnnovation.Action

class Dogma {
	enum Type { SUPREMACY, COLLABORATION }
	
	private final Type type
	private final Resource.Type resource
	private final List<Action> actions
	private final String text

	Dogma(String text, Type type, Resource.Type resource) {
		this(text, type, resource, [])
	}

	Dogma(String text, Type type, Resource.Type resource, List<Action> actions) {
		this.type = type
		this.resource = resource
		this.actions = actions
		this.text = text
	}

	Type getType() {
		return type
	}

	Resource.Type getResource() {
		return resource
	}

	List<Action> getActions() {
		return actions
	}

	String getText() {
		return text
	}
}
