package dev.arrays_and_strings;

/**
 * Created by rthakur on 7/8/17.
 */
public class ClimbStairs {
    public static void main(String[] args) {
        ClimbStairs cs = new ClimbStairs();
        System.out.println(cs.climbStairs(3));
    }

    public int climbStairs(int n) {
        int[] memo = new int[n];

        return climbStairs(0, n, memo, "From initial");
    }

    private int climbStairs(int i, int n, int[] memo, String s) {
        System.out.println("I " + i + "\t  N " + n + " \t" + s);
        if (i > n) {
            System.out.println("here");
            return 0;
        }

        if (i == n) {
            System.out.println("I and N are equal now");
            return 1;
        }

        if (memo[i] > 0) {
            return memo[i];
        } else {
            memo[i] = climbStairs(i + 1, n, memo, "From one") + climbStairs(i + 2, n, memo, "From 2");
        }
        return memo[i];
    }

}