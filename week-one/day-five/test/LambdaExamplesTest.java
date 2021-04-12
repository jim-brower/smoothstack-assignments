import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LambdaExamplesTest {

    @Test
    void sortByLength() {
        String[] preSorted = {"b", "cd", "efg", "astart", "estart"};
        assertTrue(Arrays.deepEquals(preSorted, LambdaExamples.sortByLength()));
    }

    @Test
    void sortByReverseLength() {
        String[] preSorted = {"astart", "estart", "efg", "cd", "b"};
        assertTrue(Arrays.deepEquals(preSorted, LambdaExamples.sortByReverseLength()));
    }

    @Test
    void sortByFirstChar() {
        String[] preSorted = {"astart", "b", "cd", "efg", "estart"};
        assertTrue(Arrays.deepEquals(preSorted, LambdaExamples.sortByFirstChar()));
    }

    @Test
    void sortByEChar() {
        String[] preSorted = {"efg", "estart", "cd", "b", "astart"};
        assertTrue(Arrays.deepEquals(preSorted, LambdaExamples.sortByEChar()));
    }

    @Test
    void sortByECharHelper() {
        String[] preSorted = {"efg", "estart", "cd", "b", "astart"};
        assertTrue(Arrays.deepEquals(preSorted, LambdaExamples.sortByECharHelper()));
    }
}