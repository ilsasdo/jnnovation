package it.squaresoftware.jnnovation.data

import it.squaresoftware.jnnovation.Action
import it.squaresoftware.jnnovation.data.Resource

class Dogma {
	enum Type { SUPREMACY, COLLABORATION }
	
	Type type
	Resource.Type resource
	List<Action> actions
	String text
}
