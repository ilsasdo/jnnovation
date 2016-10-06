package it.squaresoftware.jnnovation

import groovy.json.JsonSlurper

public class CardLoader {
	
	List<Card> load (String cardsJson) {
		def jsonSlurper = new JsonSlurper()
		def objects = jsonSlurper.parseText (cardsJson)
		
		def cards = objects.fields.collect { new FieldCard(name: it.name, text:it.text) }
		cards.addAll(objects.cards.collect { 
			new AgeCard ( name: it.name
						, age: it.age
						, color:Color.valueOf(it.color.toUpperCase())
						, resources: it.icons.withIndex().collect { icon, index ->
							new Resource (type: Resource.Type.valueOf(icon.toUpperCase()), position: getResourcePosition (index))
						}
						, dogmas: it.dogmas.collect { dogma ->
							new Dogma (text: dogma, resource: getDogmaResource(dogma), type: getDogmaType(dogma), actions:[])
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