package encapsulation;


import static assertions.Assertions._assertEquals;
import static assertions.Assertions._assertTrue;

import org.junit.jupiter.api.Test;

public class DigitTest {

    private Digit digit;
        
    @Test
	public void testDigit() {
		digit = new Digit(10);
		_assertEquals(0, digit.getValue());
		_assertEquals(10, digit.getBase());
		boolean caught = false;
		try {
			digit = new Digit(-1);
		} catch (IllegalArgumentException e) {
			caught = true;
		}
		_assertTrue("Creating a Digit with negative base should throw IllegalArgumentException.", caught);
	}

	private void testIncrement(int base, boolean checkValue, boolean checkToString) {
		digit = new Digit(base);
		int i = 0;
		String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		while (i < base) {
			if (checkValue) {
				_assertEquals(i % base,  digit.getValue());
			}
			if (checkToString) {
				_assertEquals(String.valueOf(digits.charAt(i % base)),  digit.toString().toUpperCase());
			}
			boolean overflow = digit.increment();
			i++;
			if (checkValue) {
				_assertEquals(i % base == 0, overflow);
				_assertEquals(i % base, digit.getValue());
			}
			if (checkToString) {
				_assertEquals(String.valueOf(digits.charAt(i % base)),  digit.toString().toUpperCase());
			}
		}
	}

	private void testIncrement(boolean checkValue, boolean checkToString) {
		for (int base = 2; base <= 16; base++) {
			testIncrement(base, checkValue, checkToString);
		}
	}

    @Test
	public void testIncrement() {
		testIncrement(true, false);
    }
    
    @Test
	public void testToString() {
		testIncrement(false, true);
	}
}