
package stateandbehavior;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DigitTest {

    private Digit digit;

    @BeforeEach
    public void setup() {
        this.digit = new Digit(10);
    }

    @Test
    public void testDigit(){
        assertEquals(0, this.digit.getValue(), "Tester digit konstruktøren");
    }

    	private void testIncrement(int base, boolean checkValue, boolean checkToString) {
		this.digit = new Digit(base);
		int i = 0;
		String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		while (i < base) {
			if (checkValue) {
				assertEquals(i % base,  this.digit.getValue());
			}
			if (checkToString) {
				assertEquals(String.valueOf(digits.charAt(i % base)),  this.digit.toString().toUpperCase());
			}
			boolean overflow = this.digit.increment();
			i++;
			if (checkValue) {
				assertEquals(i % base == 0, overflow);
				assertEquals(i % base, this.digit.getValue());
			}
			if (checkToString) {
				assertEquals(String.valueOf(digits.charAt(i % base)),  this.digit.toString().toUpperCase());
			}
		}
    }
    
    private void testIncrement(boolean checkValue, boolean checkToString) {
		for (int base = 2; base <= 16; base++) {
			testIncrement(base, checkValue, checkToString);
		}
	}

    @Test
    public void incrementationTest(){
        testIncrement(true, false);
    }

    @Test
    public void testingToStringMethodForDigit(){
        testIncrement(false, true);
    }
}