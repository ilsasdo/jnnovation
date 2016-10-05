package it.squaresoftware.jnnovation

public class Card {
	
	int era
	String name
	Color color
	List<Resource> resources
	List<Dogma> dogmas

	public int getResourceCount (Resource.Type type, Resource.Position position = null) {
		return resources.inject (0) { int returnValue, Resource resource ->
			if (resource.type != type) {
				return returnValue
			}
			
			if (position == null || resource.position.contains(position)) {
				return (returnValue + 1)
			}
			
			return returnValue
		}
	}
}