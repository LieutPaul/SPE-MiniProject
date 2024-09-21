import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    // Test for square_root method
    @Test
    public void testSquareRootPositive() {
        assertEquals(5.0, Calculator.square_root(25), 0.0001);
    }

    @Test
    public void testSquareRootNegative() {
        assertTrue(Double.isNaN(Calculator.square_root(-25)));
    }

    // Test for factorial method
    @Test
    public void testFactorialPositive() {
        assertEquals(120.0, Calculator.factorial(5), 0.0001);
    }

    @Test
    public void testFactorialNegative() {
        assertTrue(Double.isNaN(Calculator.factorial(-5)));
    }

    // Test for natural_log method
    @Test
    public void testNaturalLogPositive() {
        assertEquals(Math.log(10), Calculator.natural_log(10), 0.0001);
    }

    @Test
    public void testNaturalLogNonPositive() {
        assertTrue(Double.isNaN(Calculator.natural_log(0)));
    }

    // Test for exponent method
    @Test
    public void testExponentPositive() {
        assertEquals(8.0, Calculator.exponent(2, 3), 0.0001);
    }

    @Test
    public void testExponentZero() {
        assertEquals(1.0, Calculator.exponent(0, 0), 0.0001);
    }
}
