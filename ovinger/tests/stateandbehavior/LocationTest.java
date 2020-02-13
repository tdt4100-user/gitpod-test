package stateandbehavior;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LocationTest {
    private Location location;

    @BeforeEach
    public void setup() {
        this.location = new Location();
    }

    @Test
    public void testThatConstructorWorks() {
        assertNotNull(this.location, " <--- Sett inn melding her --->");
    }

    @Test
    public void testMoveLeft() {
        this.location.left();
        assertEquals(-1, this.location.getX(), " <--- Sett inn melding her --->");
    }

    @Test
    public void testMoveRight() {
        this.location.right();
        assertEquals(1, this.location.getX(), " <--- Sett inn melding her --->");
    }

    @Test
    public void testMoveUp() {
        this.location.up();
        assertEquals(-1, this.location.getY(), " <--- Sett inn melding her --->");
    }

    @Test
    public void testMoveDown() {
        this.location.up();
        assertEquals(1, this.location.getX(), " <--- Sett inn melding her --->");
    }
}