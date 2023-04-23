package cards;

import java.util.Random;

public class StackOfCards {
    private Card[] cards; // array of all 64 cards in the deck
    private Card[] pack1; // array of the first deck after dealing the cards
    private Card[] pack2; // array of the second deck after dealing the cards
    private Card[] hand; // current hand drawn of 12 cards
    private Random random; // random number generator
    private int currentCard; // number of cards currently drawn from cards
    private int currentPack1; // number of cards currently drawn from pack1
    private int currentPack2; // number of cards currently drawn from pack2
    private int[] faceCounters; // array for frequency count of face in hand

    public StackOfCards() {
        cards = new Card[64];
        pack1 = new Card[64];
        pack2 = new Card[64];
        hand = new Card[12];
        random = new Random();
        currentCard = 0;
        currentPack1 = 0;
        currentPack2 = 0;
        faceCounters = new int[8];

        // initialize cards array with all 64 cards
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                cards[i * 8 + j] = new Card(j, i);
            }
        }
    }

    public void shuffleCards() {
        // shuffle the cards array in a random order
        for (int i = cards.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            Card temp = cards[index];
            cards[index] = cards[i];
            cards[i] = temp;
        }
        currentCard = 0; // reset the currentCard counter
    }

    public String printCards() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < hand.length; i++) {
            sb.append(hand[i].toString());
            if ((i + 1) % 2 == 0) {
                sb.append(",\n");
            } else {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public void make2packs() {
        shuffleCards();
        int N = random.nextInt(13) + 18; // choose random value of n between 18 and 30
        for (int i = 0; i < N; i++) {
            pack1[i] = cards[i];
        }
        currentPack1 = N;
        for (int i = N; i < 64; i++) {
            pack2[i - N] = cards[i];
        }
        currentPack2 = 64 - N;
    }

    public boolean dealHand() {
        if (currentPack1 + currentPack2 < 12) {
            return false; // there are not enough cards to draw a hand
        }
        for (int i = 0; i < 12; i++) {
            if (currentPack1 > 0) {
                hand[i] = pack1[currentPack1 - 1];
                currentPack1--;
            } else {
                hand[i] = pack2[currentPack2 - 1];
                currentPack2--;
            }
        }
        // update the faceCounters array with the frequency count of face in hand
        for (int i = 0; i < hand.length; i++) {
            int face = hand[i].getFace();
            faceCounters[face - 2]++;
        }
        return true; // successfully dealt a hand
    }


    public boolean hasKQ(){
        boolean[] aceSuits = {false, false, false, false};
        boolean[] kingSuits = {false, false, false, false};

        for (int i = 0; i < 12 && this.hand[i] != null; i++) {
            //check for aces
            if (this.hand[i].getFace() - 1 == 0){
                aceSuits[this.hand[i].getSuit() - 1] = true;
            }
            //check for kings
            if (this.hand[i].getFace() - 1 == 2){
                kingSuits[this.hand[i].getSuit() - 1] = true;
            }
        }

        for (int i = 0; i < 4; i++) {
            if(kingSuits[i] && aceSuits[i]) {
                return true;
            }
        }
        return false;
    }


    public boolean hasSixTEN() {
        for (int i = 0; i < faceCounters.length; i++) {
            if (faceCounters[i] >= 2 && i+2 == 6) {
                Card tempCard = new Card(i, 0);
                for (int j = 0; j < hand.length; j++) {
                    if (hand[j].toString().equals(tempCard.toString())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

