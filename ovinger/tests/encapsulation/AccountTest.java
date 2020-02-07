package encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTest{

	private double epsilon = 0.000001d;
	
	private Account account;

	@BeforeEach
	protected void setUp() throws Exception {
        this.account = new Account(100, 5);
	}
    
    @Test
	public void testAccount() {
		this.account = new Account(100, 5);
		assertEquals(100.0d, this.account.getBalance(), epsilon);
		assertEquals(5.0d, this.account.getInterestRate(), epsilon);
		try {
			this.account = new Account(-1, 5);
			fail("Creating Account with negative balance should throw an IllegalArgumentException.");
		} catch (Exception e) {
			assertEquals(100.0d, this.account.getBalance(), epsilon);
			assertEquals(5.0d, this.account.getInterestRate(), epsilon);	
			assertTrue(e instanceof IllegalArgumentException, "Exception should be IllegalArgumentException.");
		}
		
		try {
			this.account = new Account(100, -1);
			fail("Creating Account with negative interestRate should throw an IllegalArgumentException.");
		} catch (Exception e) {
			assertEquals(100.0d, this.account.getBalance(), epsilon);
			assertEquals(5.0d, this.account.getInterestRate(), epsilon);
			assertTrue(e instanceof IllegalArgumentException,"Exception should be IllegalArgumentException.");
		}
	}
    
    @Test
	public void testSetInterestRate() {
		this.account.setInterestRate(7);
		assertEquals(7.0d, this.account.getInterestRate(), epsilon);
		try {
			this.account.setInterestRate(-2);
			fail("Setting a negative interestRate should result throw exception.");
		} catch (Exception e) {
			assertEquals(7.0d, this.account.getInterestRate(), epsilon);
		}
	}
	
    @Test
	public void testDeposit() {
		this.account.deposit(100);
		assertEquals(200.0d, this.account.getBalance(), epsilon);
	}
    
    @Test
	public void testDepositNegativeAmount() {
		try {
			this.account.deposit(-50);
			fail("deposit should throw an IllegalArgumentException when given negative amounts.");
		} catch (Exception e) {
			assertEquals(100.0d, this.account.getBalance(), epsilon, "deposit should ignore negative amounts.");
			assertTrue(e instanceof IllegalArgumentException, "Exception should be IllegalArgumentException.");
		}
	}
    
    @Test
	public void testWithdraw() {
		try {
			this.account.withdraw(50);
			assertEquals(50.0d, this.account.getBalance(), epsilon);
		} catch (Exception e){
			fail();
		}
	}
    
    @Test
	public void testWithdrawTooLargeAmount() {
		try {
			this.account.withdraw(150);
			fail("Expected IllegalArgumentException here");
		} catch (Exception e){
			assertEquals(100.0d, this.account.getBalance(), epsilon);
			assertTrue(e instanceof IllegalArgumentException);
		}
	}
}