package objectstructures;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import static assertions.Assertions.*;

public class PartnerTest {
  private Partner p1;
  
  private Partner _init_p1() {
    Partner _partner = new Partner("1");
    return _partner;
  }
  
  private Partner p2;
  
  private Partner _init_p2() {
    Partner _partner = new Partner("2");
    return _partner;
  }
  
  @BeforeEach
  protected void setUp() {
    p1 = _init_p1();
    p2 = _init_p2();
    
  }
  
  @Test
  public void testConstructor() {
    _test__constructor_transitions0_effects0_state();
    
  }
  
  @Test
  public void testPartner() {
    _test__partner_transitions0_source_state();
    _transition_exprAction__partner_transitions0_actions0();
    _test__partner_transitions0_effects0_state();
    
  }
  
  @Test
  public void testDivorce() {
    _transition_exprAction__divorce_transitions0_actions0();
    _test__divorce_transitions0_effects0_state();
    _transition_exprAction__divorce_transitions1_actions0();
    _test__divorce_transitions1_effects0_state();
    
  }
  
  @Test
  public void testSwinger() {
    Partner p3 = _init__swinger_p3();
    Partner p4 = _init__swinger_p4();
    _transition_exprAction__swinger_transitions0_actions0(p3, p4);
    _transition_exprAction__swinger_transitions0_actions1(p3, p4);
    _test__swinger_transitions0_effects0_state(p3, p4);
    _transition_exprAction__swinger_transitions1_actions0(p3, p4);
    _test__swinger_transitions1_effects0_state(p3, p4);
    
  }
  
  private void _test__constructor_transitions0_effects0_state() {
    _test__constructor_transitions0_effects0_state_objectTests0_test(p1);
    _test__constructor_transitions0_effects0_state_objectTests1_test(p2);
    
  }
  
  private void _test__constructor_transitions0_effects0_state_objectTests0_test(final Partner it) {
    
    Partner _partner = it.getPartner();
    _assertEquals("partner == null failed", null, _partner);
    
  }
  
  private void _test__constructor_transitions0_effects0_state_objectTests1_test(final Partner it) {
    
    Partner _partner = it.getPartner();
    _assertEquals("partner == null failed", null, _partner);
    
  }
  
  private void _test__partner_transitions0_source_state() {
    _test__partner_transitions0_source_state_objectTests0_test(p1);
    _test__partner_transitions0_source_state_objectTests1_test(p2);
    
  }
  
  private void _test__partner_transitions0_source_state_objectTests0_test(final Partner it) {
    
    Partner _partner = it.getPartner();
    _assertEquals("partner == null failed after p1.setPartner(p2)", null, _partner);
    
  }
  
  private void _test__partner_transitions0_source_state_objectTests1_test(final Partner it) {
    
    Partner _partner = it.getPartner();
    _assertEquals("partner == null failed after p1.setPartner(p2)", null, _partner);
    
  }
  
  private void _transition_exprAction__partner_transitions0_actions0() {
    try {
      
      this.p1.setPartner(this.p2);
      } catch (AssertionFailedError error) {
      fail("p1.setPartner(p2) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__partner_transitions0_effects0_state() {
    _test__partner_transitions0_effects0_state_objectTests0_test(p1);
    _test__partner_transitions0_effects0_state_objectTests1_test(p2);
    
  }
  
  private void _test__partner_transitions0_effects0_state_objectTests0_test(final Partner it) {
    
    Partner _partner = it.getPartner();
    _assertEquals("partner == p2 failed after p1.setPartner(p2)", this.p2, _partner);
    
  }
  
  private void _test__partner_transitions0_effects0_state_objectTests1_test(final Partner it) {
    
    Partner _partner = it.getPartner();
    _assertEquals("partner == p1 failed after p1.setPartner(p2)", this.p1, _partner);
    
  }
  
  private void _transition_exprAction__divorce_transitions0_actions0() {
    try {
      
      this.p1.setPartner(this.p2);
      } catch (AssertionFailedError error) {
      fail("p1.setPartner(p2) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__divorce_transitions0_effects0_state() {
    _test__divorce_transitions0_effects0_state_objectTests0_test(p1);
    _test__divorce_transitions0_effects0_state_objectTests1_test(p2);
    
  }
  
  private void _test__divorce_transitions0_effects0_state_objectTests0_test(final Partner it) {
    
    Partner _partner = it.getPartner();
    _assertEquals("partner == p2 failed after p1.setPartner(p2)", this.p2, _partner);
    
  }
  
  private void _test__divorce_transitions0_effects0_state_objectTests1_test(final Partner it) {
    
    Partner _partner = it.getPartner();
    _assertEquals("partner == p1 failed after p1.setPartner(p2)", this.p1, _partner);
    
  }
  
  private void _transition_exprAction__divorce_transitions1_actions0() {
    try {
      
      this.p1.setPartner(null);
      } catch (AssertionFailedError error) {
      fail("p1.setPartner(null) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__divorce_transitions1_effects0_state() {
    _test__divorce_transitions1_effects0_state_objectTests0_test(p1);
    _test__divorce_transitions1_effects0_state_objectTests1_test(p2);
    
  }
  
  private void _test__divorce_transitions1_effects0_state_objectTests0_test(final Partner it) {
    
    Partner _partner = it.getPartner();
    _assertEquals("partner == null failed after p1.setPartner(null)", null, _partner);
    
  }
  
  private void _test__divorce_transitions1_effects0_state_objectTests1_test(final Partner it) {
    
    Partner _partner = it.getPartner();
    _assertEquals("partner == null failed after p1.setPartner(null)", null, _partner);
    
  }
  
  private Partner _init__swinger_p3() {
    Partner _partner = new Partner("3");
    return _partner;
  }
  
  private Partner _init__swinger_p4() {
    Partner _partner = new Partner("5");
    return _partner;
  }
  
  private void _transition_exprAction__swinger_transitions0_actions0(final Partner p3, final Partner p4) {
    try {
      
      this.p1.setPartner(this.p2);
      } catch (AssertionFailedError error) {
      fail("p1.setPartner(p2) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__swinger_transitions0_actions1(final Partner p3, final Partner p4) {
    try {
      
      p3.setPartner(p4);
      } catch (AssertionFailedError error) {
      fail("p3.setPartner(p4) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__swinger_transitions0_effects0_state(final Partner p3, final Partner p4) {
    _test__swinger_transitions0_effects0_state_objectTests0_test(p1, p3, p4);
    _test__swinger_transitions0_effects0_state_objectTests1_test(p2, p3, p4);
    _test__swinger_transitions0_effects0_state_objectTests2_test(p3, p3, p4);
    _test__swinger_transitions0_effects0_state_objectTests3_test(p4, p3, p4);
    
  }
  
  private void _test__swinger_transitions0_effects0_state_objectTests0_test(final Partner it, final Partner p3, final Partner p4) {
    
    Partner _partner = it.getPartner();
    _assertEquals("partner == p2 failed after p1.setPartner(p2) ,p3.setPartner(p4)", this.p2, _partner);
    
  }
  
  private void _test__swinger_transitions0_effects0_state_objectTests1_test(final Partner it, final Partner p3, final Partner p4) {
    
    Partner _partner = it.getPartner();
    _assertEquals("partner == p1 failed after p1.setPartner(p2) ,p3.setPartner(p4)", this.p1, _partner);
    
  }
  
  private void _test__swinger_transitions0_effects0_state_objectTests2_test(final Partner it, final Partner p3, final Partner p4) {
    
    Partner _partner = it.getPartner();
    _assertEquals("partner == p4 failed after p1.setPartner(p2) ,p3.setPartner(p4)", p4, _partner);
    
  }
  
  private void _test__swinger_transitions0_effects0_state_objectTests3_test(final Partner it, final Partner p3, final Partner p4) {
    
    Partner _partner = it.getPartner();
    _assertEquals("partner == p3 failed after p1.setPartner(p2) ,p3.setPartner(p4)", p3, _partner);
    
  }
  
  private void _transition_exprAction__swinger_transitions1_actions0(final Partner p3, final Partner p4) {
    try {
      
      this.p1.setPartner(p4);
      } catch (AssertionFailedError error) {
      fail("p1.setPartner(p4) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__swinger_transitions1_effects0_state(final Partner p3, final Partner p4) {
    _test__swinger_transitions1_effects0_state_objectTests0_test(p1, p3, p4);
    _test__swinger_transitions1_effects0_state_objectTests1_test(p4, p3, p4);
    _test__swinger_transitions1_effects0_state_objectTests2_test(p2, p3, p4);
    _test__swinger_transitions1_effects0_state_objectTests3_test(p3, p3, p4);
    
  }
  
  private void _test__swinger_transitions1_effects0_state_objectTests0_test(final Partner it, final Partner p3, final Partner p4) {
    
    Partner _partner = it.getPartner();
    _assertEquals("partner == p4 failed after p1.setPartner(p4)", p4, _partner);
    
  }
  
  private void _test__swinger_transitions1_effects0_state_objectTests1_test(final Partner it, final Partner p3, final Partner p4) {
    
    Partner _partner = it.getPartner();
    _assertEquals("partner == p1 failed after p1.setPartner(p4)", this.p1, _partner);
    
  }
  
  private void _test__swinger_transitions1_effects0_state_objectTests2_test(final Partner it, final Partner p3, final Partner p4) {
    
    Partner _partner = it.getPartner();
    _assertEquals("partner == null failed after p1.setPartner(p4)", null, _partner);
    
  }
  
  private void _test__swinger_transitions1_effects0_state_objectTests3_test(final Partner it, final Partner p3, final Partner p4) {
    
    Partner _partner = it.getPartner();
    _assertEquals("partner == null failed after p1.setPartner(p4)", null, _partner);
    
  }
}
