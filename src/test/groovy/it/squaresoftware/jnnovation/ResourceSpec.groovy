package it.squaresoftware.jnnovation

import spock.lang.Specification

class ResourceSpec extends Specification {
	
//	def "test card resource count" () {
//		when:
//			Card card = new Card (era:1, resources:[new Resource(type: Resource.Type.LEAF, position:Resource.Position.TOP),
//			                                        new Resource(type: Resource.Type.LEAF, position:Resource.Position.LEFT),
//			                                        new Resource(type: Resource.Type.LEAF, position:Resource.Position.CENTER),
//			                                        new Resource(type: Resource.Type.AGE,  position:Resource.Position.RIGHT)])
//		then:
//			card.getResourceCount (Resource.Type.LEAF) 							 == 3
//			card.getResourceCount (Resource.Type.LEAF, [Resource.Position.CENTER]) == 1
//			card.getResourceCount (Resource.Type.LEAF, [Resource.Position.LEFT]) 	 == 2
//			card.getResourceCount (Resource.Type.LEAF, [Resource.Position.RIGHT])  == 0
//			card.getResourceCount (Resource.Type.AGE,  [Resource.Position.RIGHT])  == 1
//			card.getResourceCount (Resource.Type.AGE,  [Resource.Position.TOP])    == 1
//	}
//	
//	def "test deck resource count" () {
//		setup:
//			PlayerDeck deck = new PlayerDeck(cards:[])
//			deck.cards << new Card (era:1, resources:[new Resource(type: Resource.Type.LEAF, position:[Resource.Position.TOP, 	 Resource.Position.LEFT]),
//													  new Resource(type: Resource.Type.LEAF, position:[Resource.Position.CENTER, Resource.Position.LEFT]),
//													  new Resource(type: Resource.Type.AGE,  position:[Resource.Position.TOP, 	 Resource.Position.RIGHT])])
//			
//			deck.cards << new Card (era:1, resources:  [new Resource(type: Resource.Type.LEAF, position:[Resource.Position.TOP, 	Resource.Position.LEFT]),
//														new Resource(type: Resource.Type.LEAF, position:[Resource.Position.CENTER, 	Resource.Position.LEFT]),
//														new Resource(type: Resource.Type.AGE,  position:[Resource.Position.TOP, 	Resource.Position.RIGHT])])
//			
//			deck.cards << new Card (era:1, resources: [ new Resource(type: Resource.Type.LEAF, position:[Resource.Position.TOP, 	Resource.Position.LEFT]),
//														new Resource(type: Resource.Type.LEAF, position:[Resource.Position.CENTER, 	Resource.Position.LEFT]),
//														new Resource(type: Resource.Type.AGE,  position:[Resource.Position.TOP, 	Resource.Position.RIGHT])])
//			
//		when:
//			deck.splayDirection = SplayDirection.NONE
//		then:
//			deck.getResourceCount (Resource.Type.LEAF) == 2
//			
//		when:
//			deck.splayDirection = SplayDirection.LEFT
//		then:
//			deck.getResourceCount (Resource.Type.LEAF) == 2
//			
//		when:
//			deck.splayDirection = SplayDirection.RIGHT
//		then:
//			deck.getResourceCount (Resource.Type.LEAF) == 6
//			
//		when:
//			deck.splayDirection = SplayDirection.TOP
//		then:
//			deck.getResourceCount (Resource.Type.LEAF) == 4
//
//		when:
//			deck.cards.clear()
//		then:
//			deck.getResourceCount (Resource.Type.LEAF) == 0
//	}
}
