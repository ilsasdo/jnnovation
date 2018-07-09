package it.squaresoftware.jnnovation.data

class Resource {

	enum Type 		{ CASTLE, CROWN, LEAF, CLOCK, FACTORY, LIGHTBULB, AGE }
	enum Position 	{ TOP, LEFT, CENTER, RIGHT }
	
	private final Type type
	private final Position position

	Resource(Type type, Position position) {
		this.type = type
		this.position = position
	}

	Type getType() {
		return type
	}

	Position getPosition() {
		return position
	}
}
