package cards;

public class FaceOfCard
{
    private enum faceStatus {ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};

    private faceStatus face;

    public FaceOfCard(String face)
    {
        switch (face)
        {
            case "Ace": default: this.face = faceStatus.ACE; break;
            case "Deuce": this.face = faceStatus.DEUCE; break;
            case "Three": this.face = faceStatus.THREE; break;
            case "Four": this.face = faceStatus.FOUR; break;
            case "Five": this.face = faceStatus.FIVE; break;
            case "Six": this.face = faceStatus.SIX; break;
            case "Seven": this.face = faceStatus.SEVEN; break;
            case "Eight": this.face = faceStatus.EIGHT; break;
            case "Nine": this.face = faceStatus.NINE; break;
            case "Ten": this.face = faceStatus.TEN; break;
            case "Jack": this.face = faceStatus.JACK; break;
            case "Queen": this.face = faceStatus.QUEEN; break;
            case "King": this.face = faceStatus.KING; break;
        }
    }

    public String getFace()
    {
        switch (face)
        {
            case ACE: return "Ace";
            case DEUCE: return "Deuce";
            case THREE: return "Three";
            case FOUR: return "Four";
            case FIVE: return "Five";
            case SIX: return "Six";
            case SEVEN: return "Seven";
            case EIGHT: return "Eight";
            case NINE: return "Nine";
            case TEN: return "Ten";
            case JACK: return "Jack";
            case QUEEN: return "Queen";
            case KING: return "King";
        }

        return "Invalid"; //unreachable code
    }
}
