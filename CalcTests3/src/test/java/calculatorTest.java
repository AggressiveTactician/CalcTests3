import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class calculatorTest {
    @Test
    public void shouldDivideTwoNumbers() {
        //given
        Calculator calculator = new Calculator();
        int a = 6;
        int b = 2;

        //when
        double result = calculator.divide(a, b);

        //then
        Assertions.assertEquals(3, result);
    }

    @Test
    public void shouldReturnInfinityWhenDividedByZero() {
        //given
        final Calculator calculator = new Calculator();
        int a = 5;
        int b = 0;

        //when


        //then
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(a, b));
    }
}