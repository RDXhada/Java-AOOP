package cards;

public class SuitOfCard
{
    private enum suitStatus {CLUBS, DIAMONDS, HEARTS, SPADES};

    private suitStatus suit;

    public SuitOfCard(String suit)
    {
        switch(suit)
        {
            case "Clubs": default: this.suit = suitStatus.CLUBS; break;
            case "Diamonds": this.suit = suitStatus.DIAMONDS; break;
            case "Hearts": this.suit = suitStatus.HEARTS; break;
            case "Spades": this.suit = suitStatus.SPADES; break;
        }
    }

    public String getSuit()
    {
        switch(this.suit)
        {
            case CLUBS: return "Clubs";
            case HEARTS: return "Hearts";
            case SPADES: return "Spades";
            case DIAMONDS: return "Diamonds";
        }
        return "Invalid"; //unreachable code
    }
}
