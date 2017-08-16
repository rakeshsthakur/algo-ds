package dev.arrays_and_strings;

/**
 * Created by rthakur on 7/28/17.
 */
public class MaxSubArray {

    public static int maxSubArray(int[] nums) {

        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);

        }

        return maxSoFar;

    }


    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{2, -8, 3, -2, 4, -10}));
    }
}
