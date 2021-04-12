import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class FunctionalTest {

    @Test
    void rightDigit() {
        List<Integer> initial = Arrays.asList(1, 22, 93);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, Functional.rightDigit(initial));

        initial = Arrays.asList(16, 8, 886, 8, 1);
        expected = Arrays.asList(6, 8, 6, 8, 1);
        assertEquals(expected, Functional.rightDigit(initial));

        initial = Arrays.asList(10, 0);
        expected = Arrays.asList(0, 0);
        assertEquals(expected, Functional.rightDigit(initial));
    }

    @Test
    void doubling() {
        List<Integer> initial = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(2, 4, 6);
        assertEquals(expected, Functional.doubling(initial));

        initial = Arrays.asList(6, 8, 6, 8, -1);
        expected = Arrays.asList(12, 16, 12, 16, -2);
        assertEquals(expected, Functional.doubling(initial));

        initial = Arrays.asList();
        expected = Arrays.asList();
        assertEquals(expected, Functional.doubling(initial));
    }

    @Test
    void noX() {
        List<String> initial = Arrays.asList("ax", "bb", "cx");
        List<String> expected = Arrays.asList("a", "bb", "c");
        assertEquals(expected, Functional.noX(initial));

        initial = Arrays.asList("xxax", "xbxbx", "xxcx");
        expected = Arrays.asList("a", "bb", "c");
        assertEquals(expected, Functional.noX(initial));

        initial = Arrays.asList("x");
        expected = Arrays.asList("");
        assertEquals(expected, Functional.noX(initial));
    }
}