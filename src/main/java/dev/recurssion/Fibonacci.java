package dev.recurssion;

import java.math.BigInteger;

/**
 * Created by rthakur on 4/16/17.
 */
public class Fibonacci {


    public static int fibRec(int input) {

        int fib0 = 0;
        int fib1 = 1;

        int fib = 0;
        while (input > 1) {
            fib = fib0 + fib1;
            fib0 = fib1;
            fib1 = fib;
            input--;
        }

        return fib;
    }
//
//    public static BigInteger fibonacci2 (int n){
//            if (n == 0) return BigInteger.ZERO;
//           BigInteger bigIntn =  BigInteger.valueOf(n);
//            BigInteger a = BigInteger.ZERO;
//        BigInteger b = BigInteger.ONE;
//            for (BigInteger i = BigInteger.valueOf(2); i.compareTo(bigIntn) > 0  ; i.add(BigInteger.ONE)) {
//                BigInteger c = a.add(b);
//                a=b;
//                b = c;
//            }
//            return a.add(b);
//    }

    public static BigInteger fibonacci(int input) {
//        long current = 0;

//        System.out.println(input);
        return fibonacci(input, new BigInteger[input + 1]);
//        fibonacci(input-1) + fibonacci(input-2);

//        for (int i = 1; i <= input; i++) {
//            current += getFibonacciNumber(i);
//        }

//        return current;
    }

    private static BigInteger fibonacci(int input, BigInteger[] memo) {
        if (input == 1 || input == 0) {
            return BigInteger.valueOf(input);
        }
        if (memo[input] == null) {
            memo[input] = fibonacci(input - 1, memo).add(fibonacci(input - 2, memo));
        }

        return memo[input];
    }

//    private static long getFibonacciNumber(int input) {
//
//        if (input == 0 || input == 1) {
//            return 1;
//        }
//        long output = 0;
//        while (input > 1) {
//            output = input + input - 1;
//            input--;
//        }
//        return output;
//    }
}
