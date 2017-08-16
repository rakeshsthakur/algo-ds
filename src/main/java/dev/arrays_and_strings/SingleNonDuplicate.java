package dev.arrays_and_strings;

/**
 * Created by rthakur on 6/9/17.
 */
// might be wrong -- this is wrong
public class SingleNonDuplicate {
    public static int singleNonDuplicate(int[] nums) {
        return singleNonDuplicate(nums, nums.length / 2);
    }

    public static int singleNonDuplicate(int[] nums, int n) {
        if ((nums[n] != nums[n - 1]) || (nums[n] != nums[n + 1])) {
            return nums[n];
        } else {
            if ((nums[n] < nums[n - 1])) {
                return singleNonDuplicate(nums, n - 1 / 2);
            } else {
                return singleNonDuplicate(nums, n + 1 / 2);
            }
        }
    }
}