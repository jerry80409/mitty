package misc;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    static Map<Integer, BigInteger> dp = new HashMap<>();

    static {
        dp.put(0, BigInteger.ZERO);
        dp.put(1, BigInteger.ONE);
        dp.put(2, BigInteger.ONE);
        dp.put(3, BigInteger.TWO);
        dp.put(4, BigInteger.valueOf(3L));
        // ... init some com.example.practice.misc.Fibonacci result
    }

    /**
     * F(0) = 0
     * F(1) = 1
     * F(n) = F(n-1) + F(n-2)
     *
     * @param n
     * @return
     */
    static BigInteger calculate(int n) {
        // return cache value
        if (dp.containsKey(n)) {
            return dp.get(n);
        }

        if (n <= 0) {
            return BigInteger.ZERO;
        }
        if (n == 1 || n == 2) {
            return BigInteger.ONE;
        }

        // recursive and add to cache
        dp.put(n, calculate(n - 1).add(calculate(n - 2)));

        return dp.get(n);
    }

}
