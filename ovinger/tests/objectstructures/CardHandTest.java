package objectstructures;

import static org.junit.jupiter.api.Assertions.fail;
import static assertions.Assertions.*;

import java.util.Collection;
import java.util.Collections;
import objectstructures.Card;
import objectstructures.CardDeck;
import objectstructures.CardHand;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

public class CardHandTest {
  private CardHand cardHand;
  
  @BeforeEach
  protected void setUp() {
    cardHand = new CardHand();
    
  }
  
  private boolean operator__assertEquals(final CardHand it, final Collection<String> toStrings) {
    boolean _xblockexpression = false;
    {
      int _cardCount = it.getCardCount();
      int _size = toStrings.size();
      _assertEquals(_cardCount, _size);
      int i = 0;
      for (final String toString : toStrings) {
        {
          final Card card = it.getCard(i);
          char _suit = card.getSuit();
          String _valueOf = String.valueOf(_suit);
          int _face = card.getFace();
          String _plus = (_valueOf + Integer.valueOf(_face));
          _assertEquals(_plus, toString);
          i = (i + 1);
        }
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }
  
  @Test
  public void testConstructor() {
    _test__constructor_transitions0_effects0_state(cardHand);
    
  }
  
  @Test
  public void testDeal() {
    CardDeck deck = _init__deal_deck();
    _transition_exprAction__deal_transitions0_actions0(cardHand, deck);
    _test__deal_transitions0_effects0_state(cardHand, deck);
    
  }
  
  @Test
  public void testDealPlay() {
    CardDeck deck = _init__dealPlay_deck();
    _transition_exprAction__dealPlay_transitions0_actions0(cardHand, deck);
    _test__dealPlay_transitions0_effects0_state(cardHand, deck);
    _transition_exprAction__dealPlay_transitions1_actions0(cardHand, deck);
    _test__dealPlay_transitions1_effects0_state(cardHand, deck);
    _transition_exprAction__dealPlay_transitions2_actions0(cardHand, deck);
    _test__dealPlay_transitions2_effects0_state(cardHand, deck);
    _transition_exprAction__dealPlay_transitions3_actions0(cardHand, deck);
    _test__dealPlay_transitions3_effects0_state(cardHand, deck);
    
  }
  
  private void _test__constructor_transitions0_effects0_state(final CardHand it) {
    _test__constructor_transitions0_effects0_state_objectTests0_test(cardHand);
    
  }
  
  private void _test__constructor_transitions0_effects0_state_objectTests0_test(final CardHand it) {
    
    int _cardCount = it.getCardCount();
    _assertEquals("cardCount == 0 failed", 0, _cardCount);
    
  }
  
  private CardDeck _init__deal_deck() {
    CardDeck _cardDeck = new CardDeck(2);
    return _cardDeck;
  }
  
  private void _transition_exprAction__deal_transitions0_actions0(final CardHand it, final CardDeck deck) {
    try {
      
      deck.deal(this.cardHand, 3);
      } catch (AssertionFailedError error) {
      fail("deck.deal(cardHand, 3) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__deal_transitions0_effects0_state(final CardHand it, final CardDeck deck) {
    _test__deal_transitions0_effects0_state_objectTests0_test(cardHand, deck);
    
  }
  
  private void _test__deal_transitions0_effects0_state_objectTests0_test(final CardHand it, final CardDeck deck) {
    
    _assertTrue("it ?= #[\"C2\", \"C1\", \"D2\"] failed after deck.deal(cardHand, 3)", this.operator__assertEquals(it, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("C2", "C1", "D2"))));
    
  }
  
  private CardDeck _init__dealPlay_deck() {
    CardDeck _cardDeck = new CardDeck(2);
    return _cardDeck;
  }
  
  private void _transition_exprAction__dealPlay_transitions0_actions0(final CardHand it, final CardDeck deck) {
    try {
      
      deck.deal(this.cardHand, 3);
      } catch (AssertionFailedError error) {
      fail("deck.deal(cardHand, 3) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__dealPlay_transitions0_effects0_state(final CardHand it, final CardDeck deck) {
    _test__dealPlay_transitions0_effects0_state_objectTests0_test(cardHand, deck);
    
  }
  
  private void _test__dealPlay_transitions0_effects0_state_objectTests0_test(final CardHand it, final CardDeck deck) {
    
    _assertTrue("it ?= #[\"C2\", \"C1\", \"D2\"] failed after deck.deal(cardHand, 3)", this.operator__assertEquals(it, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("C2", "C1", "D2"))));
    
  }
  
  private void _transition_exprAction__dealPlay_transitions1_actions0(final CardHand it, final CardDeck deck) {
    try {
      
      it.play(1);
      } catch (AssertionFailedError error) {
      fail("play(1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__dealPlay_transitions1_effects0_state(final CardHand it, final CardDeck deck) {
    _test__dealPlay_transitions1_effects0_state_objectTests0_test(cardHand, deck);
    
  }
  
  private void _test__dealPlay_transitions1_effects0_state_objectTests0_test(final CardHand it, final CardDeck deck) {
    
    _assertTrue("it ?= #[\"C2\", \"D2\"] failed after play(1)", this.operator__assertEquals(it, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("C2", "D2"))));
    
  }
  
  private void _transition_exprAction__dealPlay_transitions2_actions0(final CardHand it, final CardDeck deck) {
    try {
      
      it.play(0);
      } catch (AssertionFailedError error) {
      fail("play(0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__dealPlay_transitions2_effects0_state(final CardHand it, final CardDeck deck) {
    _test__dealPlay_transitions2_effects0_state_objectTests0_test(cardHand, deck);
    
  }
  
  private void _test__dealPlay_transitions2_effects0_state_objectTests0_test(final CardHand it, final CardDeck deck) {
    
    _assertTrue("it ?= #[\"D2\"] failed after play(0)", this.operator__assertEquals(it, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("D2"))));
    
  }
  
  private void _transition_exprAction__dealPlay_transitions3_actions0(final CardHand it, final CardDeck deck) {
    try {
      
      it.play(0);
      } catch (AssertionFailedError error) {
      fail("play(0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__dealPlay_transitions3_effects0_state(final CardHand it, final CardDeck deck) {
    _test__dealPlay_transitions3_effects0_state_objectTests0_test(cardHand, deck);
    
  }
  
  private void _test__dealPlay_transitions3_effects0_state_objectTests0_test(final CardHand it, final CardDeck deck) {
    
    int _cardCount = it.getCardCount();
    _assertEquals("cardCount == 0 failed after play(0)", 0, _cardCount);
    
  }
}
