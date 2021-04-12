import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {

    @Test
    void groupSumClump() {
        assertTrue(Recursion.groupSumClump(0, new int[]{2, 4, 8}, 10));
        assertTrue(Recursion.groupSumClump(0, new int[]{1, 2, 4, 8, 1}, 14));
        assertFalse(Recursion.groupSumClump(0, new int[]{2, 4, 4, 8}, 14));
    }
}