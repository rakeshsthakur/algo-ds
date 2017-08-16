package dev.arrays_and_strings;

import java.util.Arrays;

/**
 * Created by rthakur on 6/19/17.
 */
public class ProductOfArraysExceptSelf {

    public static int[] getProductOfArraysExceptSelfNSquare(int[] nums) {
        int tmp = 1;
        int[] result = new int[nums.length];
        int index = 0;
        for (int i : nums) {
            for (int j : nums) {
                tmp *= j;
            }
            result[index] = tmp / i;
            tmp = 1;
            index++;
        }
        return result;
    }

    public static int[] getProductOfArraysExceptSelf(int[] nums) {
        int len = nums.length;

        int runningPrefix = 1;
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            result[i] = runningPrefix;
            runningPrefix *= nums[i];
        }

        int runningPostFix = 1;
        System.out.println(Arrays.toString(result));
        for (int i = len - 1; i >= 0; i--) {
//            System.out.println("running post fix is " + runningPostFix);
            result[i] *= runningPostFix;
            runningPostFix *= nums[i];
        }

        return result;

    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(getProductOfArraysExceptSelf(new int[]{1, 2, 3, 4})));
    }
}
