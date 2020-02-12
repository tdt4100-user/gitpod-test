package objectstructures;

import static org.junit.jupiter.api.Assertions.fail;
import static assertions.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import objectstructures.Card;

public class CardTest  {
  private Card c;
  
  private Card _init_c() {
    return null;
  }
  
  @BeforeEach
  protected void setUp() {
    c = _init_c();
    
  }
  
  private boolean operator_equals(final Character c, final String s) {
    return ((s.length() == 1) && ((c).charValue() == s.charAt(0)));
  }
  
  @Test
  public void testConstructor() {
    _transition_exprAction__constructor_transitions0_actions0(c);
    _test__constructor_transitions0_effects0_state(c);
    _transition_exprAction__constructor_transitions1_actions0(c);
    _test__constructor_transitions1_effects0_state(c);
    _transition_exprAction__constructor_transitions2_actions0(c);
    _test__constructor_transitions2_effects0_state(c);
    _transition_exprAction__constructor_transitions3_actions0(c);
    _test__constructor_transitions3_effects0_state(c);
    _transition_exprAction__constructor_transitions4_actions0(c);
    _test__constructor_transitions4_effects0_state(c);
    _transition_exprAction__constructor_transitions5_actions0(c);
    _test__constructor_transitions5_effects0_state(c);
    _transition_exprAction__constructor_transitions6_actions0(c);
    _test__constructor_transitions6_effects0_state(c);
    _transition_exprAction__constructor_transitions7_actions0(c);
    _test__constructor_transitions7_effects0_state(c);
    try {
      _transition_exprAction__constructor_transitions8_actions0(c);
      fail("IllegalArgumentException should be thrown after c = new Card('X', 1)");
    } catch (Exception e) {
      _assertTrue("IllegalArgumentException should be thrown after c = new Card('X', 1)", e instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructor_transitions9_actions0(c);
      fail("IllegalArgumentException should be thrown after c = new Card('S', 0)");
    } catch (Exception e_1) {
      _assertTrue("IllegalArgumentException should be thrown after c = new Card('S', 0)", e_1 instanceof IllegalArgumentException);
    }
    try {
      _transition_exprAction__constructor_transitions10_actions0(c);
      fail("IllegalArgumentException should be thrown after c = new Card('C', 14)");
    } catch (Exception e_2) {
      _assertTrue("IllegalArgumentException should be thrown after c = new Card('C', 14)", e_2 instanceof IllegalArgumentException);
    }
    
  }
  
  @Test
  public void testToString() {
    _transition_exprAction__toString_transitions0_actions0(c);
    _test__toString_transitions0_effects0_state(c);
    _transition_exprAction__toString_transitions1_actions0(c);
    _test__toString_transitions1_effects0_state(c);
    _transition_exprAction__toString_transitions2_actions0(c);
    _test__toString_transitions2_effects0_state(c);
    _transition_exprAction__toString_transitions3_actions0(c);
    _test__toString_transitions3_effects0_state(c);
    _transition_exprAction__toString_transitions4_actions0(c);
    _test__toString_transitions4_effects0_state(c);
    _transition_exprAction__toString_transitions5_actions0(c);
    _test__toString_transitions5_effects0_state(c);
    _transition_exprAction__toString_transitions6_actions0(c);
    _test__toString_transitions6_effects0_state(c);
    _transition_exprAction__toString_transitions7_actions0(c);
    _test__toString_transitions7_effects0_state(c);
    
  }
  
  private void _transition_exprAction__constructor_transitions0_actions0(final Card it) {
    try {
      
      Card _card = new Card('S', 1);
      this.c = _card;
      } catch (AssertionFailedError error) {
      fail("c = new Card('S', 1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__constructor_transitions0_effects0_state(final Card it) {
    _test__constructor_transitions0_effects0_state_objectTests0_test(c);
    
  }
  
  private void _test__constructor_transitions0_effects0_state_objectTests0_test(final Card it) {
    
    char _suit = it.getSuit();
    boolean _equals = this.operator_equals(Character.valueOf(_suit), "S");
    _assertTrue("suit == 'S' failed after c = new Card('S', 1)", _equals);
    
    int _face = it.getFace();
    _assertEquals("face == 1 failed after c = new Card('S', 1)", 1, _face);
    
  }
  
  private void _transition_exprAction__constructor_transitions1_actions0(final Card it) {
    try {
      
      Card _card = new Card('S', 13);
      this.c = _card;
      } catch (AssertionFailedError error) {
      fail("c = new Card('S', 13) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__constructor_transitions1_effects0_state(final Card it) {
    _test__constructor_transitions1_effects0_state_objectTests0_test(c);
    
  }
  
  private void _test__constructor_transitions1_effects0_state_objectTests0_test(final Card it) {
    
    char _suit = it.getSuit();
    boolean _equals = this.operator_equals(Character.valueOf(_suit), "S");
    _assertTrue("suit == 'S' failed after c = new Card('S', 13)", _equals);
    
    int _face = it.getFace();
    _assertEquals("face == 13 failed after c = new Card('S', 13)", 13, _face);
    
  }
  
  private void _transition_exprAction__constructor_transitions2_actions0(final Card it) {
    try {
      
      Card _card = new Card('H', 1);
      this.c = _card;
      } catch (AssertionFailedError error) {
      fail("c = new Card('H', 1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__constructor_transitions2_effects0_state(final Card it) {
    _test__constructor_transitions2_effects0_state_objectTests0_test(c);
    
  }
  
  private void _test__constructor_transitions2_effects0_state_objectTests0_test(final Card it) {
    
    char _suit = it.getSuit();
    boolean _equals = this.operator_equals(Character.valueOf(_suit), "H");
    _assertTrue("suit == 'H' failed after c = new Card('H', 1)", _equals);
    
    int _face = it.getFace();
    _assertEquals("face == 1 failed after c = new Card('H', 1)", 1, _face);
    
  }
  
  private void _transition_exprAction__constructor_transitions3_actions0(final Card it) {
    try {
      
      Card _card = new Card('H', 13);
      this.c = _card;
      } catch (AssertionFailedError error) {
      fail("c = new Card('H', 13) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__constructor_transitions3_effects0_state(final Card it) {
    _test__constructor_transitions3_effects0_state_objectTests0_test(c);
    
  }
  
  private void _test__constructor_transitions3_effects0_state_objectTests0_test(final Card it) {
    
    char _suit = it.getSuit();
    boolean _equals = this.operator_equals(Character.valueOf(_suit), "H");
    _assertTrue("suit == 'H' failed after c = new Card('H', 13)", _equals);
    
    int _face = it.getFace();
    _assertEquals("face == 13 failed after c = new Card('H', 13)", 13, _face);
    
  }
  
  private void _transition_exprAction__constructor_transitions4_actions0(final Card it) {
    try {
      
      Card _card = new Card('D', 1);
      this.c = _card;
      } catch (AssertionFailedError error) {
      fail("c = new Card('D', 1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__constructor_transitions4_effects0_state(final Card it) {
    _test__constructor_transitions4_effects0_state_objectTests0_test(c);
    
  }
  
  private void _test__constructor_transitions4_effects0_state_objectTests0_test(final Card it) {
    
    char _suit = it.getSuit();
    boolean _equals = this.operator_equals(Character.valueOf(_suit), "D");
    _assertTrue("suit == 'D' failed after c = new Card('D', 1)", _equals);
    
    int _face = it.getFace();
    _assertEquals("face == 1 failed after c = new Card('D', 1)", 1, _face);
    
  }
  
  private void _transition_exprAction__constructor_transitions5_actions0(final Card it) {
    try {
      
      Card _card = new Card('D', 13);
      this.c = _card;
      } catch (AssertionFailedError error) {
      fail("c = new Card('D', 13) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__constructor_transitions5_effects0_state(final Card it) {
    _test__constructor_transitions5_effects0_state_objectTests0_test(c);
    
  }
  
  private void _test__constructor_transitions5_effects0_state_objectTests0_test(final Card it) {
    
    char _suit = it.getSuit();
    boolean _equals = this.operator_equals(Character.valueOf(_suit), "D");
    _assertTrue("suit == 'D' failed after c = new Card('D', 13)", _equals);
    
    int _face = it.getFace();
    _assertEquals("face == 13 failed after c = new Card('D', 13)", 13, _face);
    
  }
  
  private void _transition_exprAction__constructor_transitions6_actions0(final Card it) {
    try {
      
      Card _card = new Card('C', 1);
      this.c = _card;
      } catch (AssertionFailedError error) {
      fail("c = new Card('C', 1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__constructor_transitions6_effects0_state(final Card it) {
    _test__constructor_transitions6_effects0_state_objectTests0_test(c);
    
  }
  
  private void _test__constructor_transitions6_effects0_state_objectTests0_test(final Card it) {
    
    char _suit = it.getSuit();
    boolean _equals = this.operator_equals(Character.valueOf(_suit), "C");
    _assertTrue("suit == 'C' failed after c = new Card('C', 1)", _equals);
    
    int _face = it.getFace();
    _assertEquals("face == 1 failed after c = new Card('C', 1)", 1, _face);
    
  }
  
  private void _transition_exprAction__constructor_transitions7_actions0(final Card it) {
    try {
      
      Card _card = new Card('C', 13);
      this.c = _card;
      } catch (AssertionFailedError error) {
      fail("c = new Card('C', 13) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__constructor_transitions7_effects0_state(final Card it) {
    _test__constructor_transitions7_effects0_state_objectTests0_test(c);
    
  }
  
  private void _test__constructor_transitions7_effects0_state_objectTests0_test(final Card it) {
    
    char _suit = it.getSuit();
    boolean _equals = this.operator_equals(Character.valueOf(_suit), "C");
    _assertTrue("suit == 'C' failed after c = new Card('C', 13)", _equals);
    
    int _face = it.getFace();
    _assertEquals("face == 13 failed after c = new Card('C', 13)", 13, _face);
    
  }
  
  private void _transition_exprAction__constructor_transitions8_actions0(final Card it) {
    try {
      
      Card _card = new Card('X', 1);
      this.c = _card;
      } catch (AssertionFailedError error) {
      fail("c = new Card('X', 1) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructor_transitions9_actions0(final Card it) {
    try {
      
      Card _card = new Card('S', 0);
      this.c = _card;
      } catch (AssertionFailedError error) {
      fail("c = new Card('S', 0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__constructor_transitions10_actions0(final Card it) {
    try {
      
      Card _card = new Card('C', 14);
      this.c = _card;
      } catch (AssertionFailedError error) {
      fail("c = new Card('C', 14) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__toString_transitions0_actions0(final Card it) {
    try {
      
      Card _card = new Card('S', 1);
      this.c = _card;
      } catch (AssertionFailedError error) {
      fail("c = new Card('S', 1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__toString_transitions0_effects0_state(final Card it) {
    _test__toString_transitions0_effects0_state_objectTests0_test(c);
    
  }
  
  private void _test__toString_transitions0_effects0_state_objectTests0_test(final Card it) {
    
    String _string = it.toString();
    _assertEquals("toString == 'S1' failed after c = new Card('S', 1)", "S1", _string);
    
  }
  
  private void _transition_exprAction__toString_transitions1_actions0(final Card it) {
    try {
      
      Card _card = new Card('S', 13);
      this.c = _card;
      } catch (AssertionFailedError error) {
      fail("c = new Card('S', 13) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__toString_transitions1_effects0_state(final Card it) {
    _test__toString_transitions1_effects0_state_objectTests0_test(c);
    
  }
  
  private void _test__toString_transitions1_effects0_state_objectTests0_test(final Card it) {
    
    String _string = it.toString();
    _assertEquals("toString == 'S13' failed after c = new Card('S', 13)", "S13", _string);
    
  }
  
  private void _transition_exprAction__toString_transitions2_actions0(final Card it) {
    try {
      
      Card _card = new Card('H', 1);
      this.c = _card;
      } catch (AssertionFailedError error) {
      fail("c = new Card('H', 1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__toString_transitions2_effects0_state(final Card it) {
    _test__toString_transitions2_effects0_state_objectTests0_test(c);
    
  }
  
  private void _test__toString_transitions2_effects0_state_objectTests0_test(final Card it) {
    
    String _string = it.toString();
    _assertEquals("toString == 'H1' failed after c = new Card('H', 1)", "H1", _string);
    
  }
  
  private void _transition_exprAction__toString_transitions3_actions0(final Card it) {
    try {
      
      Card _card = new Card('H', 13);
      this.c = _card;
      } catch (AssertionFailedError error) {
      fail("c = new Card('H', 13) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__toString_transitions3_effects0_state(final Card it) {
    _test__toString_transitions3_effects0_state_objectTests0_test(c);
    
  }
  
  private void _test__toString_transitions3_effects0_state_objectTests0_test(final Card it) {
    
    String _string = it.toString();
    _assertEquals("toString == 'H13' failed after c = new Card('H', 13)", "H13", _string);
    
  }
  
  private void _transition_exprAction__toString_transitions4_actions0(final Card it) {
    try {
      
      Card _card = new Card('D', 1);
      this.c = _card;
      } catch (AssertionFailedError error) {
      fail("c = new Card('D', 1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__toString_transitions4_effects0_state(final Card it) {
    _test__toString_transitions4_effects0_state_objectTests0_test(c);
    
  }
  
  private void _test__toString_transitions4_effects0_state_objectTests0_test(final Card it) {
    
    String _string = it.toString();
    _assertEquals("toString == 'D1' failed after c = new Card('D', 1)", "D1", _string);
    
  }
  
  private void _transition_exprAction__toString_transitions5_actions0(final Card it) {
    try {
      
      Card _card = new Card('D', 13);
      this.c = _card;
      } catch (AssertionFailedError error) {
      fail("c = new Card('D', 13) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__toString_transitions5_effects0_state(final Card it) {
    _test__toString_transitions5_effects0_state_objectTests0_test(c);
    
  }
  
  private void _test__toString_transitions5_effects0_state_objectTests0_test(final Card it) {
    
    String _string = it.toString();
    _assertEquals("toString == 'D13' failed after c = new Card('D', 13)", "D13", _string);
    
  }
  
  private void _transition_exprAction__toString_transitions6_actions0(final Card it) {
    try {
      
      Card _card = new Card('C', 1);
      this.c = _card;
      } catch (AssertionFailedError error) {
      fail("c = new Card('C', 1) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__toString_transitions6_effects0_state(final Card it) {
    _test__toString_transitions6_effects0_state_objectTests0_test(c);
    
  }
  
  private void _test__toString_transitions6_effects0_state_objectTests0_test(final Card it) {
    
    String _string = it.toString();
    _assertEquals("toString == 'C1' failed after c = new Card('C', 1)", "C1", _string);
    
  }
  
  private void _transition_exprAction__toString_transitions7_actions0(final Card it) {
    try {
      
      Card _card = new Card('C', 13);
      this.c = _card;
      } catch (AssertionFailedError error) {
      fail("c = new Card('C', 13) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__toString_transitions7_effects0_state(final Card it) {
    _test__toString_transitions7_effects0_state_objectTests0_test(c);
    
  }
  
  private void _test__toString_transitions7_effects0_state_objectTests0_test(final Card it) {
    
    String _string = it.toString();
    _assertEquals("toString == 'C13' failed after c = new Card('C', 13)", "C13", _string);
    
  }
}
