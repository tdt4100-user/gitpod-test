package objectstructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CardHand {
     private List<Card> hand;

    private final List<Character> legalSuites = Arrays.asList('S', 'H', 'D', 'C');
    private final List<Integer> legalFaces = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);

    public CardHand(){
        this.hand = new ArrayList<>();
    }

    public int getCardCount(){
        return this.hand.size();
    }

    public Card getCard(int cardIndex){
        return this.hand.get(cardIndex);
    }

    public void addCard(Card card){
        this.hand.add(card);
    }

    public Card play(int cardIndex){
        return this.hand.remove(cardIndex);
    }
}