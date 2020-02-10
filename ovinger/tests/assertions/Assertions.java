package assertions;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Assertions {

    /*
     * AssertEquals
     */

    public static void _assertEquals(String expected, String actual) {
        assertEquals(expected, actual);
    }

    public static void _assertEquals(String msg, String expected, String actual) {
        assertEquals(expected, actual, msg);
    }

    public static void _assertEquals(Integer expected, Integer actual) {
        assertEquals(expected, actual);
    }

    public static void _assertEquals(String msg, Integer expected, Integer actual) {
        assertEquals(expected, actual, msg);
    }

    public static void _assertEquals(String msg, Double expected, Double actual, Double eps) {
        assertEquals(expected, actual, eps, msg);
    }

    public static void _assertEquals(Double expected, Double actual) {
        assertEquals(expected, actual);
    }

    public static void _assertEquals(String msg, Double expected, Double actual) {
        assertEquals(expected, actual, msg);
    }

    public static void _assertEquals(Double expected, Double actual, Double eps) {
        assertEquals(expected, actual, eps);
    }

    public static void _assertEquals(String msg, Byte expected, Byte actual) {
        assertEquals(expected, actual, msg);
    }

    public static void _assertEquals(String msg, Object expected, Object actual) {
        assertEquals(expected, actual, msg);
    }

    public static void _assertEquals(boolean expected, Boolean actual) {
        assertEquals(expected, actual);
    }

    public static void _assertEquals(String msg, boolean expected, Boolean actual) {
        assertEquals(expected, actual, msg);
    }

    /*
     * AssertTrue
     */
    public static void _assertTrue(boolean condition) {
        assertTrue(condition);
    }

    public static void _assertTrue(String msg, boolean condition) {
        assertTrue(condition, msg);
    }

    /*
     * AssertNotNull
     */

    public static void _assertNotNull(Object notNullObject) {
        assertNotNull(notNullObject);
    }

    public static void _assertNotNull(String msg, Object notNullObject) {
        assertNotNull(notNullObject, msg);
    }
}