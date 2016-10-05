package it.squaresoftware.jnnovation

import it.squaresoftware.jnnovation.Resource.Position;

public class PlayerDeck {

	Color color
	List<Card> cards
	SplayDirection splayDirection
	
	public int getResourceCount (Resource.Type type) {
		if (cards.size() == 0) {
			return 0
		}
		
		Resource.Position position = null
		
		switch (splayDirection) {
			case SplayDirection.TOP:
				position = Resource.Position.BOTTOM
				break
			
			case SplayDirection.LEFT:
				position = Resource.Position.RIGHT
				break
				
			case SplayDirection.RIGHT:
				position = Resource.Position.LEFT
				break
				
			default:
				position = null
				break
		}
		
		if (splayDirection == SplayDirection.NONE) {
			return cards.first().getResourceCount(type)
		}
		
		return cards.reverse().inject (-1) { int returnValue, Card nextValue ->
			// active card
			if (returnValue == -1) {
				return nextValue.getResourceCount(type)
			}
			
			// other cards
			return returnValue + nextValue.getResourceCount(type, position)
		}
	}
}
