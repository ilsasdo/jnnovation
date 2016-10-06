package it.squaresoftware.jnnovation

import spock.lang.Specification

class CardLoaderSpec extends Specification {
	
	def "test loading cards" () {
		setup:
			CardLoader loader = new CardLoader()
		
		when:
			def cards = loader.load(this.getClass().getResource("/cards.json").text)
		
		then:
			cards != null
			cards.size() == 110
			cards[0].name == "Monument"
			cards[5].color == Color.YELLOW
	}
	
	def "test field card loading" () {
		setup:
			CardLoader loader = new CardLoader()
		
		when:
			def cards = loader.load('{"fields":[{"name": "card name", "text": "card text"}]}')
		
		then:
			cards != null
			cards.size() == 1
			cards[0].name == "card name"
			cards[0].text == "card text"
	}
	
	def "test age card loading" () {
		setup:
			CardLoader loader = new CardLoader()
			
			when:
				def cards = loader.load('{"cards":[{"name": "card name", "color": "red", "age": 2, "icons":["castle","age","lightbulb","leaf"], "dogmas":["[CASTLE][SUP]: I demand you to do this", "[CASTLE]: You may do that"]}]}')
				
			then:
				cards != null
				cards.size() == 1
				cards[0].name == "card name"
				cards[0].color == Color.RED
				cards[0].age	== 2
				cards[0].dogmas != null
				cards[0].dogmas.size() == 2
				cards[0].dogmas[0].type == Dogma.Type.SUPREMACY
				cards[0].dogmas[0].text == "[CASTLE][SUP]: I demand you to do this"
				cards[0].dogmas[0].resource == Resource.Type.CASTLE
				cards[0].dogmas[1].type == Dogma.Type.COLLABORATION
				cards[0].dogmas[1].text == "[CASTLE]: You may do that"
				cards[0].dogmas[1].resource == Resource.Type.CASTLE
	}
	
}
