package it.squaresoftware.jnnovation;

public interface Player {
	
	List<PlayerDeck> getDecks()
	List<Card> getHandCards()
	List<Card> getDominations()
	List<Card> getInfluence()
	int getInfluenceCount()
	int getResourceCount (Resource resource)
}
