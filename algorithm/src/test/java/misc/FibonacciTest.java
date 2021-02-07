package misc;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    @Test
    void assert_f0_zero() {
        assertEquals(BigInteger.ZERO, Fibonacci.calculate(0));
    }

    @Test
    void assert_f1_one() {
        assertEquals(BigInteger.ONE, Fibonacci.calculate(1));
    }

    @Test
    void assert_f2_one() {
        assertEquals(BigInteger.ONE, Fibonacci.calculate(2));
    }

    @Test
    void assert_f3_two() {
        assertEquals(BigInteger.TWO, Fibonacci.calculate(3));
    }

    @Test
    void assert_f10_fifty_five() {
        assertEquals(BigInteger.valueOf(55L), Fibonacci.calculate(10));
    }
}