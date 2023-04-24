package game;

public class Card {
    Face face;
    Suit suit;

    public Card(Face face, Suit suit) {
        setFace(face);
        setSuit(suit);
    }

    public Face getFace() {
        return face;
    }

    public void setFace(Face face) {
        if (face == null) {
            face = Face.NINE;
            return;
        }

        this.face = face;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        if (suit == null) {
            suit = Suit.SPADES;
            return;
        }

        this.suit = suit;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }
}
