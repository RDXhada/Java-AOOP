package cards;

public class Card {
    private int face;
    private int suit;

    public static String []faces = {"ACE", "TEN", "KING", "QUEEN", "JACK", "NINE", "EIGHT", "SEVEN"};
    public static String []suits = {"CLUBS","DIAMONDS", "HEARTS", "SPADES"};

    public int getFace() {
        return face;
    }

    public int getSuit() {
        return suit;
    }

    public void setFace(int face) {
        this.face = face;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public Card(int face, int suit) {
        setFace(face);
        setSuit(suit);
    }

    String getSuitName()
    {
        return suits[suit].toString();
    }

    @Override
    public String toString() {
        return faces[face].toString() + " of " + getSuitName();
    }
}
