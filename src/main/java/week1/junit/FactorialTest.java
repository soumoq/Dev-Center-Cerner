package week1.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    private Factorial factorial;

    @BeforeEach
    public void setUp() {
        factorial = new Factorial();
    }

    @Test
    public void happyFlowTest() {
        assertEquals(120, factorial.fact(5));
    }

    @Test
    public void zeroValueTest() {
        assertEquals(1, factorial.fact(0));
    }

    @Test
    public void negativeValueTest() {
        NumberFormatException thrown = Assertions.assertThrows(NumberFormatException.class, () -> {
            factorial.fact(-1);
        }, "NumberFormatException was expected");
        assertEquals("Negative number factorial is not possible.", thrown.getMessage());
    }

    @Test
    public void largeValueTest() {
        NumberFormatException thrown = Assertions.assertThrows(NumberFormatException.class, () -> {
            factorial.fact(11);
        }, "NumberFormatException was expected");
        assertEquals("Number is too large.", thrown.getMessage());
    }
}
