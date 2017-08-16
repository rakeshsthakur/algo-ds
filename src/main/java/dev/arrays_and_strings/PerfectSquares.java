package dev.arrays_and_strings;

import java.util.Arrays;

/**
 * Created by rthakur on 7/31/17.
 * https://leetcode.com/problems/perfect-squares/description/
 * <p>
 * <p>
 * dp[0] = 0;
 * dp[1] = dp[0] +1;
 * dp[2] = dp[1] +1;
 * dp[3] = dp[2] +1;
 */
public class PerfectSquares {

    public static int numSquares(int n) {
        int res = 0;
        int dp[] = new int[n + 1]; // for zero;

        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;
        int min = 0;
        for (int i = 1; i <= n; i++) {
            int j = 1;
            while (i - j * j >= 0) {
                min = Math.min(min, dp[i - j * j]) + 1;
                j++;
            }
            dp[i] = min;
        }

        return dp[n];

    }


    public static void main(String[] args) {
        System.out.println(numSquares(3));
    }
}
