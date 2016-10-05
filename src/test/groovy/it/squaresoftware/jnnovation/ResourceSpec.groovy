package it.squaresoftware.jnnovation

import spock.lang.Specification

class ResourceSpec extends Specification {
	
	def "test card resource count" () {
		when:
			Card card = new Card (era:1, resources:[new Resource(type: Resource.Type.TREE, position:[Resource.Position.TOP, 	Resource.Position.LEFT]),
			                                        new Resource(type: Resource.Type.TREE, position:[Resource.Position.BOTTOM, 	Resource.Position.LEFT]),
			                                        new Resource(type: Resource.Type.ERA,  position:[Resource.Position.TOP, 	Resource.Position.RIGHT])])
		then:
			card.getResourceCount (Resource.Type.TREE) 							 == 2
			card.getResourceCount (Resource.Type.TREE, Resource.Position.BOTTOM) == 1
			card.getResourceCount (Resource.Type.TREE, Resource.Position.LEFT) 	 == 2
			card.getResourceCount (Resource.Type.TREE, Resource.Position.RIGHT)  == 0
			card.getResourceCount (Resource.Type.ERA,  Resource.Position.RIGHT)  == 1
			card.getResourceCount (Resource.Type.ERA,  Resource.Position.TOP)    == 1
	}
	
	def "test deck resource count" () {
		setup:
			PlayerDeck deck = new PlayerDeck(cards:[])
			deck.cards << new Card (era:1, resources:[new Resource(type: Resource.Type.TREE, position:[Resource.Position.TOP, 	 Resource.Position.LEFT]),
													  new Resource(type: Resource.Type.TREE, position:[Resource.Position.BOTTOM, Resource.Position.LEFT]),
													  new Resource(type: Resource.Type.ERA,  position:[Resource.Position.TOP, 	 Resource.Position.RIGHT])])
			
			deck.cards << new Card (era:1, resources:  [new Resource(type: Resource.Type.TREE, position:[Resource.Position.TOP, 	Resource.Position.LEFT]),
														new Resource(type: Resource.Type.TREE, position:[Resource.Position.BOTTOM, 	Resource.Position.LEFT]),
														new Resource(type: Resource.Type.ERA,  position:[Resource.Position.TOP, 	Resource.Position.RIGHT])])
			
			deck.cards << new Card (era:1, resources: [ new Resource(type: Resource.Type.TREE, position:[Resource.Position.TOP, 	Resource.Position.LEFT]),
														new Resource(type: Resource.Type.TREE, position:[Resource.Position.BOTTOM, 	Resource.Position.LEFT]),
														new Resource(type: Resource.Type.ERA,  position:[Resource.Position.TOP, 	Resource.Position.RIGHT])])
			
		when:
			deck.splayDirection = SplayDirection.NONE
		then:
			deck.getResourceCount (Resource.Type.TREE) == 2
			
		when:
			deck.splayDirection = SplayDirection.LEFT
		then:
			deck.getResourceCount (Resource.Type.TREE) == 2
			
		when:
			deck.splayDirection = SplayDirection.RIGHT
		then:
			deck.getResourceCount (Resource.Type.TREE) == 6
			
		when:
			deck.splayDirection = SplayDirection.TOP
		then:
			deck.getResourceCount (Resource.Type.TREE) == 4

		when:
			deck.cards.clear()
		then:
			deck.getResourceCount (Resource.Type.TREE) == 0
	}
}
