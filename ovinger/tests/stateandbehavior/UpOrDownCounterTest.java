package stateandbehavior;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class UpOrDownCounterTest {


    private void testCount(UpOrDownCounter counter, int end, int delta) {
        boolean result = true;
        while (delta > 0 ? counter.getCounter() < end : counter.getCounter() > end) {
            assertTrue(result, "Before reaching the end value, the count() method should return true. ");
            int i = counter.getCounter();
            result = counter.count();
            int expected = i + delta;
            assertEquals(expected, counter.getCounter(),
                    "When counting from " + i + " the result should be " + expected + ". ");
        }
        assertFalse(result, "When reaching the end value, the count method should return false. ");
        assertEquals(end, counter.getCounter(), "After reaching the end value, the counter should not change. ");
        assertFalse(counter.count(), "After reaching the end value, the count() method should return false. ");
        assertEquals(end, counter.getCounter(), "After reaching the end value, the counter should not change. ");
    }

    @Test
    public void testUpOrDownCounter() {
        UpOrDownCounter counter13 = new UpOrDownCounter(1, 3);
        assertEquals(1, counter13.getCounter(),
                "After instantiating an UpOrDownCounter the counter should be the start value. ");
        UpOrDownCounter counter31 = new UpOrDownCounter(3, 1);
        assertEquals(3, counter31.getCounter(),
                "After instantiating an UpOrDownCounter the counter should be the start value. ");
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