package week1.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CalculatorTest {
    private Calculator calculator;
    private CalculatorService service = Mockito.mock(CalculatorService.class);

    @BeforeEach
    public void setUp() {
        calculator = new Calculator(service);
    }

    @Test
    public void happyFlowTest() {
        when(service.add(2, 3)).thenReturn(5);
        assertEquals(10, calculator.perform(2, 3));
        verify(service).add(2, 3);

    }

}
