package dev.arrays_and_strings;

import java.util.Arrays;

/**
 * Created by rthakur on 7/26/17.
 */
public class LongestIncreasingSubsequence {

    public static int longestIncreasingSubSequence(int[] nums) {

        int maxAns = 0;
        int[] dp = new int[nums.length];
        dp[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    max = Math.max(max, dp[j]);
                }
            }

            dp[i] = max + 1;
            maxAns = Math.max(dp[i], maxAns);
        }
        System.out.println(Arrays.toString(dp));
        return maxAns;
    }
    // Wont work for all ex:{10,9,2,5,3,4}
//    public static int longestIncreasingSubSequence(int[] nums){
//
//
//        int overAllMax = 0;
//
//
//        for(int i=0; i<nums.length;i++) {
//            int currentMax = nums[i];
//            int result = 1;
//            for (int j = i; j < nums.length; j++) {
//
//                int max = Math.max(currentMax, nums[j]);
//                if (max > currentMax) {
//                    System.out.println(max);
//                    currentMax = max;
//                    result++;
//                }
//            }
////            System.out.println(overAllMax);
//            overAllMax = Math.max(overAllMax, result);
//        }
//        return overAllMax;
//    }

    public static void main(String[] args) {
        System.out.println(longestIncreasingSubSequence(new int[]{10, 22, 9, 33, 21, 50, 41, 60, 80})); // --should be 6
        System.out.println(longestIncreasingSubSequence(new int[]{10, 9, 2, 5, 3, 7, 101, 18})); //-- should be 4
        System.out.println(longestIncreasingSubSequence(new int[]{10, 9, 2, 5, 3, 4})); //-- should be 3
    }
}
