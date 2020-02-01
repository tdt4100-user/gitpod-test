package encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("A special test case")
public class AccountTest{

    private final double epsilon = 0.000001d;
    private Account account;

    @BeforeEach
    public void setup(){
        this.account = new Account(100, 5);
    }

    @Test
    public void testingThatBalanceAndInterestRateAreSetCorrectly(){
        double expectedBalance = 100.0;
        double expectedInterestRate = 5;
        assertEquals(expectedBalance, this.account.getBalance(), epsilon, "Balance should be" + expectedBalance);
        assertEquals(expectedInterestRate, this.account.getInterestRate(), epsilon, "InterestRate should be" + expectedInterestRate);
    }


    @Test
    public void account(){
        try {
			this.account = new Account(-1, 5);
			fail("Creating Account with negative balance should throw an IllegalArgumentException.");
		} catch (final Exception e) {
			assertEquals(100.0d, this.account.getBalance(), epsilon);
			assertEquals(5.0d, this.account.getInterestRate(), epsilon);
			assertTrue(e instanceof IllegalArgumentException, "Exception should be IllegalArgumentException.");
		}

		try {
			account = new Account(100, -1);
			fail("Creating Account with negative interestRate should throw an IllegalArgumentException.");
		} catch (final Exception e) {
			assertEquals(100.0d, this.account.getBalance(), epsilon);
			assertEquals(5.0d, this.account.getInterestRate(), epsilon);
			assertTrue(e instanceof IllegalArgumentException, "Exception should be IllegalArgumentException.");
		}
    }
    @Test
    public void testSetInterestRate() {
		this.account.setInterestRate(7);
		assertEquals(7.0d, this.account.getInterestRate(), epsilon);
		try {
			this.account.setInterestRate(-2);
			fail("Setting a negative interestRate should result throw exception.");
		} catch (final Exception e) {
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
		} catch (final Exception e) {
			assertEquals(100.0d, this.account.getBalance(), epsilon, "deposit should ignore negative amounts." );
			assertTrue(e instanceof IllegalArgumentException,"Exception should be IllegalArgumentException." );
		}
	}

    @Test
	public void testWithdraw() {
		try {
			this.account.withdraw(50);
			assertEquals(50.0d, this.account.getBalance(), epsilon);
		} catch (final Exception e){
			fail();
		}
	}

    @Test
	public void testWithdrawTooLargeAmount() {
		try {
			this.account.withdraw(150);
			fail("Expected IllegalArgumentException here");
		} catch (final Exception e){
			assertEquals(100.0d, this.account.getBalance(), epsilon);
			assertTrue(e instanceof IllegalArgumentException);
		}

    }
}
