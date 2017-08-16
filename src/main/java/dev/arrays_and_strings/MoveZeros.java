package dev.arrays_and_strings;

/**
 * Created by rthakur on 7/7/17.
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 */
public class MoveZeros {

    public static int[] moveZeros(int[] nums) {

        int i = 0;

        for (int n : nums)
            if (n != 0) nums[i++] = n;

        while (i < nums.length)
            nums[i++] = 0;

        return nums;
    }
}
