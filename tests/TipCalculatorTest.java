import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TipCalculatorTest {
    @Test
    void calculatorTest1() {
        TipCalculator calculatorTest1 = new TipCalculator();
        double result1 = calculatorTest1.calculateTip(100.00, 20);
        assertEquals(20, result1);
    }
    @Test
    void calculatorTest2() {
        TipCalculator calculatorTest2 = new TipCalculator();
        double result2 = calculatorTest2.calculateTip(1000.00, 20);
        assertEquals(200, result2);
    }
}
