import lab03.Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Lab01Test {
    Calculator calc;

    @BeforeEach
    public void init() {
       calc = new Calculator();
    }

    @Test
    public void TestAdd(){
        assertEquals(5,calc.add(2,3));
    }

    @Test
    public void TestSubtract(){
        assertEquals(5,calc.subtract(8,3));
    }

    @Test
    public void TestDivide(){
        Exception exception = assertThrows(ArithmeticException.class, () -> calc.divide(1, 0));
        assertEquals("/ by zero", exception.getMessage());
    }

    @Test
    public void TestMultiply(){
        assertEquals(20,calc.multiply(10,2));
    }
}
