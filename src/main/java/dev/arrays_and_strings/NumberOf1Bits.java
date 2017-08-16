package dev.arrays_and_strings;

/**
 * Created by rthakur on 7/9/17.
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).
 * <p>
 * For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 * 2147483648 (10000000000000000000000000000000)
 */
public class NumberOf1Bits {

    public static int process(int n) {
        int ones = 0;
        while (n != 0) {
            ones += n & 1;
            n >>>= 1;
        }

        return ones;
    }

    public static void main(String[] args) {
//        2147483647
        System.out.println(Integer.MAX_VALUE > 2147483647);
        System.out.println(process(Integer.parseInt("2147483647")));
    }
}
