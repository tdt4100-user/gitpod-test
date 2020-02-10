package encapsulation;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static assertions.Assertions.*;

public class UpOrDownCounterTest {

	@BeforeEach
	protected void setUp() throws Exception {
	}

	private void testCount(UpOrDownCounter counter, int end, int delta) {
		boolean result = true;
		while (delta > 0 ? counter.getCounter() < end : counter.getCounter() > end) {
			_assertTrue("Before reaching the end value, the count() method should return true. ", result);
			int i = counter.getCounter();
			result = counter.count();
			int expected = i + delta;
			_assertEquals("When counting from " + i + " the result should be " + expected + ". ", expected, counter.getCounter());
		}
		_assertFalse("When reaching the end value, the count method should return false. ", result);
		_assertEquals("After reaching the end value, the counter should not change. ", end, counter.getCounter());
		_assertFalse("After reaching the end value, the count() method should return false. ", counter.count());
		_assertEquals("After reaching the end value, the counter should not change. ", end, counter.getCounter());
	}

@Test
	public void testUpOrDownCounter() {
		UpOrDownCounter counter13 = new UpOrDownCounter(1, 3);
		_assertEquals("After instantiating an UpOrDownCounter the counter should be the start value. ", 1, counter13.getCounter());
		UpOrDownCounter counter31 = new UpOrDownCounter(3, 1);
		_assertEquals("After instantiating an UpOrDownCounter the counter should be the start value. ", 3, counter31.getCounter());
	}
	@Test
	public void testUpOrDownCounterWithException() {
		Exception iae = null;
		try {
			new UpOrDownCounter(0, 0);
			fail("When the start and end values are equal an IllegalArgumentException should be thrown. ");
		} catch (Exception e) {
			iae = e;
		}
		_assertTrue("When the start and end values are equal an IllegalArgumentException should be thrown, ", iae instanceof IllegalArgumentException);
	}

	@Test
	public void testCountUp() {
		UpOrDownCounter counter13 = new UpOrDownCounter(1, 3);
		testCount(counter13, 3, 1);
	}
	@Test
	public void testCountDown() {
		UpOrDownCounter counter31 = new UpOrDownCounter(3, 1);
		testCount(counter31, 1, -1);
	}
}
