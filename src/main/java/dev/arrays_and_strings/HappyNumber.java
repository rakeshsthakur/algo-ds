package dev.arrays_and_strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by rthakur on 7/8/17.
 * Write an algorithm to determine if a number is "happy".
 * <p>
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number
 * by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay),
 * or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 * <p>
 * Example: 19 is a happy number
 * <p>
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
public class HappyNumber {

    public static boolean process(int n) {

        Set<Integer> set = new HashSet<>();

        while (set.add(n)) {
            int sum = 0;
            while (n > 0) {
                int lastElement = n % 10;
                sum += lastElement * lastElement;
                n = n / 10;
            }
            n = sum;
            if (n == 1)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(19 % 10);
        System.out.println(process(2));
    }
}
