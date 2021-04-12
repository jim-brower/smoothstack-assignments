import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntsToStringsTest {

    @Test
    void intsToStrings() {
        List<Integer> intList = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        String premadeString = "e0,o1,e2,o3,e4,o5,e6,o7,e8,o9";
        assertEquals(premadeString, IntsToStrings.intsToStrings(intList));
    }
}