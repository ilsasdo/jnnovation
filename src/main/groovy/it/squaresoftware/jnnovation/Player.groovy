package it.squaresoftware.jnnovation;

public interface Player {
	
	List<PlayerDeck> getDecks()
	List<AgeCard> getHandCards()
	List<AgeCard> getDominations()
	List<AgeCard> getInfluence()
	int getInfluenceCount()
	int getResourceCount (Resource resource)
}
