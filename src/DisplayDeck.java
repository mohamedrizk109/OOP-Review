import java.util.*;

public class DisplayDeck {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for (int suit = X.DIAMONDS; suit <= X.SPADES; suit++) {
            for (int rank = X.ACE; rank <= X.KING; rank++) {
                X card = deck.getCard(suit, rank);
                System.out.format("%s of %s%n",
                        card.rankToString(card.getRank()),
                        card.suitToString(card.getSuit()));
            }
        }
    }
}