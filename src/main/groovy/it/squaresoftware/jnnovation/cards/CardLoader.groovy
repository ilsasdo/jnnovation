package it.squaresoftware.jnnovation.cards

import groovy.json.JsonSlurper
import it.squaresoftware.jnnovation.data.Dogma
import it.squaresoftware.jnnovation.data.Resource

class CardLoader {
	
	List<Card> load (String cardsJson) {
		JsonSlurper jsonSlurper = new JsonSlurper()
		def objects = jsonSlurper.parseText (cardsJson)
		
		List<Card> cards = objects.fields.collect { new FieldCard(it.name, it.text) }
		cards.addAll(objects.cards.collect { 
			new AgeCard ( it.name
						, it.age
						, it.squaresoftware.jnnovation.data.Color.valueOf(it.color.toUpperCase())
						, it.icons.withIndex().collect { icon, index ->
							new Resource (Resource.Type.valueOf(icon.toUpperCase()), getResourcePosition (index))
						}
						, it.dogmas.collect { dogma ->
							new Dogma (dogma, getDogmaResource(dogma), getDogmaType(dogma))
						})
		})
		return cards
	}
	
	private Resource.Position getResourcePosition (int index) {
		switch (index) {
			case 0:
				return Resource.Position.TOP
			case 1:
				return Resource.Position.LEFT
			case 2:
				return Resource.Position.CENTER
			case 3:
				return Resource.Position.RIGHT
		}
	}
	
	private Resource.Type getDogmaResource (String text) {
		return Resource.Type.values().find { text.startsWith("[${it}]") }
	}
	
	private Dogma.Type getDogmaType (String text) {
		if (text.indexOf("[SUP]") > -1) {
			return Dogma.Type.SUPREMACY
		} else {
			return Dogma.Type.COLLABORATION
		}
	}
}