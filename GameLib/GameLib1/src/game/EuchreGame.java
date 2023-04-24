package game;

import java.util.Random;

public class EuchreGame {
    private final Card[] cards; // масив от всички карти в тестето от карти
    private Card[] hand; // текущо изтеглена ръка от 5 карти
    private final Suit TRUMP; // константа на всяка отделна игра
    private final Random random; // генератор на случайни числа
    private int usedCards; // брой карти изтеглени текущо от cards

    public final Face[] faces = new Face[] { Face.NINE, Face.TEN, Face.JACK, Face.QUEEN, Face.KING, Face.ACE };
    public final Suit[] suits = new Suit[] { Suit.HEARTS, Suit.SPADES, Suit.CLUBS, Suit.DIAMONDS };

    public EuchreGame() {
        cards = new Card[24];
        hand = new Card[5];
        random = new Random();
        usedCards = 0;
        TRUMP = suits[random.nextInt(0, 4)];

        for (int i = 0; i < 24; i++) {
            cards[i] = new Card(faces[i % 6], suits[i / 6]);
        }
    }

    public void shuffleCards() {
        usedCards = 0;

        for (int i = 0; i < 24; i++) {
            Card temp = cards[i];
            cards[i] = cards[random.nextInt(0,24)];
            cards[random.nextInt(0,24)] = temp;
        }
    }

    public String printCards() {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < hand.length && hand[i] != null; i++) {
            if (i != 0 && i != 3)
                output.append(", ");

            output.append(hand[i]);

            if (i == 2)
                output.append('\n');
        }

        output.append(String.format("%n%n Коз: %s", TRUMP));

        return output.toString();
    }

    public boolean dealHand() {
        if (usedCards == 24)
            return false;

        hand = new Card[5];

        int handIdx = 0;
        while (handIdx < 5 && usedCards < 24) {
            hand[handIdx++] = cards[usedCards++];
        }

        return true;
    }

    public int countHandStrength() {
        int strength = 1;

        for (Card card : hand) {
            if (card != null) strength *= card.face.getValue();
        }

        return strength;
    }

    public boolean hasJackQueenKing() {
        boolean hasJack = false;
        boolean hasQueen = false;
        boolean hasKing = false;

        for (Card card : hand) {
            if (card.face == Face.JACK)
                hasJack = true;
            else if (card.face == Face.QUEEN)
                hasQueen = true;
            else if (card.face == Face.KING)
                hasKing = true;

            if (hasJack && hasQueen && hasKing)
                return true;
        }

        return false;
    }

    boolean hasTwoTrumps() {
        int trumpCount = 0;

        for (Card card : hand) {
            if (card.suit == TRUMP)
                trumpCount++;

            if (trumpCount >= 2)
                return true;
        }

        return false;
    }
}
