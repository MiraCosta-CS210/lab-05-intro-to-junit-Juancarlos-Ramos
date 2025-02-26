import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumNumbersTest {
    @Test
    void sumIsEvenTest1() {
        SumNumbers sumEvenTest1 = new SumNumbers();
        double result1 = sumEvenTest1.sumIsEven(1,1);
        assertEquals(1, result1);
    }
    @Test
    void sumIsEvenTest2() {
        SumNumbers sumEvenTest2 = new SumNumbers();
        double result2 = sumEvenTest2.sumIsEven(1,2);
        assertEquals(0, result2);
    }
}
