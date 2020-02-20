package stateandbehavior;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import static assertions.Assertions.*;

import stateandbehavior.Account;

public class AccountTest {
  private Account account;
  
  @BeforeEach
  protected void setUp() {
    account = new Account();
    
  }
  
  private boolean operator_equals(final double d1, final double d2) {
    boolean _xblockexpression = false;
    {
      final double epsilon = 0.000001d;
      _xblockexpression = (((d1 - epsilon) < d2) && ((d1 + epsilon) > d2));
    }
    return _xblockexpression;
  }
  
  @Test
  public void testConstructor() {
    _test__constructor_transitions0_effects0_state(account);
    
  }
  
  @Test
  public void testDeposit() {
    _transition_exprAction__deposit_transitions0_actions0(account);
    _test__deposit_transitions0_effects0_state(account);
    
  }
  
  @Test
  public void testDepositNegative() {
    _transition_exprAction__depositNegative_transitions0_actions0(account);
    _test__depositNegative_transitions0_effects0_state(account);
    
  }
  
  @Test
  public void testAddInterest() {
    _transition_exprAction__addInterest_transitions0_actions0(account);
    _test__addInterest_transitions0_effects0_state(account);
    _transition_exprAction__addInterest_transitions1_actions0(account);
    _test__addInterest_transitions1_effects0_state(account);
    _transition_exprAction__addInterest_transitions2_actions0(account);
    _test__addInterest_transitions2_effects0_state(account);
    
  }
  
  private void _test__constructor_transitions0_effects0_state(final Account it) {
    _test__constructor_transitions0_effects0_state_objectTests0_test(account);
    
  }
  
  private void _test__constructor_transitions0_effects0_state_objectTests0_test(final Account it) {
    
    double _balance = it.getBalance();
    _assertTrue("balance == 0 failed", this.operator_equals(_balance, 0));
    
  }
  
  private void _transition_exprAction__deposit_transitions0_actions0(final Account it) {
    try {
      
      it.deposit(100);
      } catch (AssertionFailedError error) {
      fail("deposit(100) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__deposit_transitions0_effects0_state(final Account it) {
    _test__deposit_transitions0_effects0_state_objectTests0_test(account);
    
  }
  
  private void _test__deposit_transitions0_effects0_state_objectTests0_test(final Account it) {
    
    double _balance = it.getBalance();
    _assertTrue("balance == 100 failed after deposit(100)", this.operator_equals(_balance, 100));
    
  }
  
  private void _transition_exprAction__depositNegative_transitions0_actions0(final Account it) {
    try {
      
      it.deposit((-50));
      } catch (AssertionFailedError error) {
      fail("deposit(-50) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__depositNegative_transitions0_effects0_state(final Account it) {
    _test__depositNegative_transitions0_effects0_state_objectTests0_test(account);
    
  }
  
  private void _test__depositNegative_transitions0_effects0_state_objectTests0_test(final Account it) {
    
    double _balance = it.getBalance();
    _assertTrue("balance == 0 failed after deposit(-50)", this.operator_equals(_balance, 0));
    
  }
  
  private void _transition_exprAction__addInterest_transitions0_actions0(final Account it) {
    try {
      
      it.setInterestRate(5);
      } catch (AssertionFailedError error) {
      fail("interestRate = 5 failed: " + error.getMessage());
    }
    
  }
  
  private void _test__addInterest_transitions0_effects0_state(final Account it) {
    _test__addInterest_transitions0_effects0_state_objectTests0_test(account);
    
  }
  
  private void _test__addInterest_transitions0_effects0_state_objectTests0_test(final Account it) {
    
    double _balance = it.getBalance();
    boolean _equals = this.operator_equals(_balance, 0);
    _assertTrue("balance == 0 failed after interestRate = 5", _equals);
    
    double _interestRate = it.getInterestRate();
    _assertTrue("interestRate == 5 failed after interestRate = 5", this.operator_equals(_interestRate, 5));
    
  }
  
  private void _transition_exprAction__addInterest_transitions1_actions0(final Account it) {
    try {
      
      it.deposit(100);
      } catch (AssertionFailedError error) {
      fail("deposit(100) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__addInterest_transitions1_effects0_state(final Account it) {
    _test__addInterest_transitions1_effects0_state_objectTests0_test(account);
    
  }
  
  private void _test__addInterest_transitions1_effects0_state_objectTests0_test(final Account it) {
    
    double _balance = it.getBalance();
    _assertTrue("balance == 100 failed after deposit(100)", this.operator_equals(_balance, 100));
    
  }
  
  private void _transition_exprAction__addInterest_transitions2_actions0(final Account it) {
    try {
      
      it.addInterest();
      } catch (AssertionFailedError error) {
      fail("addInterest failed: " + error.getMessage());
    }
    
  }
  
  private void _test__addInterest_transitions2_effects0_state(final Account it) {
    _test__addInterest_transitions2_effects0_state_objectTests0_test(account);
    
  }
  
  private void _test__addInterest_transitions2_effects0_state_objectTests0_test(final Account it) {
    
    double _balance = it.getBalance();
    _assertTrue("balance == 105 failed after addInterest", this.operator_equals(_balance, 105));
    
  }
}
