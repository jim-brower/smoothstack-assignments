import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeCodeTest {

    @Test
    void getMonthLengthsInYear() {
        List<Integer> expected2012 = Arrays.asList(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
        assertEquals(expected2012, DateTimeCode.getMonthLengthsInYear(2012));
    }

    @Test
    void getMondaysInMonth() {
        List<Integer> expectedJanuary2021 = Arrays.asList(4, 11, 18, 25);
        assertEquals(expectedJanuary2021, DateTimeCode.getMondaysInMonth(0));
    }

    @Test
    void fridayThirteenth() {
        assertTrue(DateTimeCode.fridayThirteenth(2015, 1, 13));
        assertFalse(DateTimeCode.fridayThirteenth(2021, 1, 1));
    }
}