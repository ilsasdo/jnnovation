package it.squaresoftware.jnnovation

class Resource {

	enum Type 		{ TOWER, CROWN, TREE, CLOCK, FACTORY, BULB, ERA }
	enum Position 	{ TOP, LEFT, RIGHT, BOTTOM }
	
	Type type
	List<Position> position
}
