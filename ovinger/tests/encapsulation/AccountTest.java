package encapsulation;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static assertions.Assertions._assertEquals;
import static assertions.Assertions._assertTrue;




public class AccountTest {

    private double epsilon = 0.000001d;
    
    Account account;

    @BeforeEach
    public void setup(){
        account = new Account(100,5);
    }

    @Test
	public void testAccount() {
        account = new Account(100, 5);
        
		_assertEquals(100.0d, account.getBalance(), epsilon);
		_assertEquals(5.0d, account.getInterestRate(), epsilon);
		try {
			account = new Account(-1, 5);
			fail("Creating Account with negative balance should throw an IllegalArgumentException.");
		} catch (Exception e) {
			_assertEquals(100.0d, account.getBalance(), epsilon);
			_assertEquals(5.0d, account.getInterestRate(), epsilon);
			_assertTrue("Exception should be IllegalArgumentException.", e instanceof IllegalArgumentException);
		}

		try {
			account = new Account(100, -1);
			fail("Creating Account with negative interestRate should throw an IllegalArgumentException.");
		} catch (Exception e) {
			_assertEquals(100.0d, account.getBalance(), epsilon);
			_assertEquals(5.0d, account.getInterestRate(), epsilon);
			_assertTrue("Exception should be IllegalArgumentException.", e instanceof IllegalArgumentException);
		}
	}

    @Test
	public void testSetInterestRate() {
		account.setInterestRate(7);
		_assertEquals(7.0d, account.getInterestRate(), epsilon);
		try {
			account.setInterestRate(-2);
			fail("Setting a negative interestRate should result throw exception.");
		} catch (Exception e) {
			_assertEquals(7.0d, account.getInterestRate(), epsilon);
		}
	}

    @Test
	public void testDeposit() {
		account.deposit(100);
		_assertEquals(200.0d, account.getBalance(), epsilon);
	}

    @Test
	public void testDepositNegativeAmount() {
		try {
			account.deposit(-50);
			fail("deposit should throw an IllegalArgumentException when given negative amounts.");
		} catch (Exception e) {
			_assertEquals("deposit should ignore negative amounts.", 100.0d, account.getBalance(), epsilon);
			_assertTrue("Exception should be IllegalArgumentException.", e instanceof IllegalArgumentException);
		}
	}

    @Test
	public void testWithdraw() {
		try {
			account.withdraw(50);
			_assertEquals(50.0d, account.getBalance(), epsilon);
		} catch (Exception e){
			fail();
		}
	}

    @Test
	public void testWithdrawTooLargeAmount() {
		try {
			account.withdraw(150);
			fail("Expected IllegalArgumentException here");
		} catch (Exception e){
			_assertEquals(100.0d, account.getBalance(), epsilon);
			_assertTrue(e instanceof IllegalArgumentException);
		}
	}
}