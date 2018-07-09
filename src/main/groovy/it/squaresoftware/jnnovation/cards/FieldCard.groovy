package it.squaresoftware.jnnovation.cards

class FieldCard extends Card {
    private final String text

    FieldCard(String name, String text) {
        super(name)
        this.text = text
    }

    String getText() {
        return text
    }
}