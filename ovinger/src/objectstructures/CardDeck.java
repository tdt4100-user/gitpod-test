package objectstructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CardDeck {

    private List<Card> deck;

    private final List<Character> legalSuites = Arrays.asList('S', 'H', 'D', 'C');
    private final List<Integer> legalFaces = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);

    public CardDeck(final int n) {
        this.deck = new ArrayList<Card>();

        for (int i = 0; i < this.legalSuites.size(); i++) {
            for (int j = 0; j < n; j++) {
                final char currentSuit = legalSuites.get(i);
                final int currentFace = legalFaces.get(j);
                deck.add(new Card(currentSuit, currentFace));
            }
        }

    }

    public int getCardCount() {
        return this.deck.size();
    }

    public Card getCard(final int n) {
        if (n < 0 || n > getCardCount()) {
            throw new IllegalArgumentException();
        }
        return this.deck.get(n);
    }

    public void deal(final CardHand cardHand, final int n) {
        for (int i = 0; i < n; i++) {
            cardHand.addCard(this.deck.remove(getCardCount() - 1));
        }
    }

    public void shufflePerfectly() {
        final int middleIndex = this.getCardCount() / 2;

        final List<Card> firstHalf = this.deck.subList(0, middleIndex);
        final List<Card> secondHalf = this.deck.subList(middleIndex, middleIndex * 2);
        final List<Card> shuffledDeck = new ArrayList<>();

        for (int i = 0; i < (firstHalf.size() + secondHalf.size()) / 2; i++) {
            shuffledDeck.add(firstHalf.get(i));
            shuffledDeck.add(secondHalf.get(i));
        }

        this.deck = shuffledDeck;
    }

    public static void main(final String[] args) {
        final CardDeck deck = new CardDeck(4);
        deck.shufflePerfectly();
    }
}