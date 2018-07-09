package it.squaresoftware.jnnovation

import it.squaresoftware.jnnovation.data.Resource;

interface Player {
	
	List<PlayerDeck> getDecks()
	List<AgeCard> getHandCards()
	List<AgeCard> getDominations()
	List<AgeCard> getInfluence()
	int getInfluenceCount()
	int getResourceCount (Resource resource)
}
