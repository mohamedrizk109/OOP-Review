import java.util.*;

public class Deck {

    public static int numSuits = 4;
    public static int numRanks = 13;
    public static int numCards = numSuits * numRanks;

    private X[][] cards;

    public Deck() {
        cards = new X[numSuits][numRanks];
        for (int suit = X.DIAMONDS; suit <= X.SPADES; suit++) {
            for (int rank = X.ACE; rank <= X.KING; rank++) {
                cards[suit-1][rank-1] = new X(rank, suit);
            }
        }
    }

    public X getCard(int suit, int rank) {
        return cards[suit-1][rank-1];
    }
}