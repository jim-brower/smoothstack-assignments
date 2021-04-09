import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void getSlope() {
        // checking for divide by zero
        Line vertical = new Line(5, 0, 5, 10);
        assertThrows(ArithmeticException.class, vertical::getSlope);

        // checking if matches slope of 10, accounting for rounding errors
        Line ln = new Line(0, 0, 1, 10);
        assertEquals(10.0, ln.getSlope(), 0.0001);
    }

    @Test
    void getDistance() {
        Line ln = new Line(0, 0, 100, 100);
        assertEquals(141.421356237, ln.getDistance(), 0.0001);
    }

    @Test
    void parallelTo() {
        Line parallel1 = new Line(0, 0, 10, 10);
        Line parallel2 = new Line(1, 0, 11, 10);
        assertTrue(parallel1.parallelTo(parallel2));

        Line notParallel = new Line(0, 0,-10, 10);
        assertFalse(parallel1.parallelTo(notParallel));
    }
}