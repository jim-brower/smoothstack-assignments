import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @Test
    void isOdd() {
        PerformOperation op = MyMath.isOdd();
        assertFalse(op.check(4));
        assertTrue(op.check(3));
    }

    @Test
    void isPrime() {
        PerformOperation op = MyMath.isPrime();
        assertTrue(op.check(5));
        assertFalse(op.check(12));
    }

    @Test
    void isPalindrome() {
        PerformOperation op = MyMath.isPalindrome();
        assertTrue(op.check(898));
        assertFalse(op.check(123));
    }
}