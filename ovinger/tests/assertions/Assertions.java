package assertions;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Assertions {

    /*
    Return assertEquals;
    */

    public static boolean _assertEqualsReturn(int expected, int actual){
        return expected == actual;
    }

     public static boolean _assertEqualsReturn(String expected, String actual){
        return expected.equals(actual);
    }

    /*
     * AssertEquals
     * 
     * @Jorgensta
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

    public static void _assertEquals(int expected, int actual) {
        assertEquals(expected, actual);
    }

    public static void _assertEquals(String msg, Integer expected, Integer actual) {
        assertEquals(expected, actual, msg);
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

    public static void _assertEquals(String msg, Double expected, Double actual, Double eps) {
        assertEquals(expected, actual, eps, msg);
    }

    public static void _assertEquals(String msg, Byte expected, Byte actual) {
        assertEquals(expected, actual, msg);
    }

    public static void _assertEquals(boolean expected, boolean actual) {
        assertEquals(expected, actual);
    }

    public static void _assertEquals(String msg, boolean expected, boolean actual) {
        assertEquals(expected, actual, msg);
    }

    public static void _assertEquals(Object expected, Object actual) {
        assertEquals(expected, actual);
    }

    public static void _assertEquals(String msg, Object expected, Object actual) {
        assertEquals(expected, actual, msg);
    }

    /*
     * AssertTrue
     * 
     * @Jorgensta
     */
    public static void _assertTrue(boolean condition) {
        assertTrue(condition);
    }

    public static void _assertTrue(String msg, boolean condition) {
        assertTrue(condition, msg);
    }

    /*
     * AssertNotNull
     * 
     * @Jorgensta
     */

    public static void _assertNotNull(Object notNullObject) {
        assertNotNull(notNullObject);
    }

    public static void _assertNotNull(String msg, Object notNullObject) {
        assertNotNull(notNullObject, msg);
    }

    /*
     * AssertFalse
     */

    public static void _assertFalse(boolean condition) {
        assertFalse(condition);
    }

    public static void _assertFalse(String msg, boolean condition) {
        assertFalse(condition, msg);
    }
}