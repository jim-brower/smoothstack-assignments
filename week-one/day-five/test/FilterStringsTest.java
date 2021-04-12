import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilterStringsTest {

    @Test
    void filterStrings() {
        List<String> unfiltered = Arrays.asList("a12","b12","c123","a345","a6", "a78");
        List<String> prefiltered = Arrays.asList("a12", "a78");
        assertEquals(prefiltered, FilterStrings.filterStrings(unfiltered));
    }
}