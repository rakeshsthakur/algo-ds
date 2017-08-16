package dev.arrays_and_strings;

import java.util.Arrays;

/**
 * Created by rthakur on 6/30/17.
 */
public class SortColors {

    public static int[] sort(int[] nums) {
        int begin = 0;
        int end = nums.length - 1;


        for (int i = 0; i <= end; i++) {
            while (nums[i] == 2 && i < end) {
                swap(nums, i, end--);
            }
            while (nums[i] == 0 && i > begin) {
                swap(nums, i, begin++);
            }

//            System.out.println(Arrays.toString(nums));
        }

        return nums;
    }

    private static void swap(int[] nums, int begin, int end) {
        int tmp = nums[end];
        nums[end] = nums[begin];
        nums[begin] = tmp;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{0, 1, 2, 0, 1})));
    }
}
