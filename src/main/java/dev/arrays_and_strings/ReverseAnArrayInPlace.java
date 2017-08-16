package dev.arrays_and_strings;

import java.util.Arrays;

/**
 * Created by rthakur on 7/15/17.
 */
public class ReverseAnArrayInPlace {
    public static int[] reverse(int nums[]) {


        int left = 0, right = nums.length - 1;
        int tmp;
        while (left < right) {
            tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }

        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3, 4, 5})));
    }
}
