package dev.arrays_and_strings;

import java.util.Arrays;

/**
 * Created by rthakur on 7/20/17.
 */
public class SearchForARange {

    public static int[] searchRange(int[] nums, int target) {

        int i = 0, j = nums.length - 1;

        int[] result = new int[]{-1, -1};

        while (i < j) {
            int mid = (i + j) / 2;
            if (nums[mid] < target) i = mid + 1;
            else if (nums[mid] == target) j = mid;
            else if (nums[mid] > target) j = mid - 1;

        }

        if (nums[i] != target) return result;
        else result[0] = i;

        j = nums.length - 1;
        while (i < j) {
            System.out.println("i: " + i + " j: " + j);
            int mid = (i + j) / 2 + 1; // why?
            if (nums[mid] > target) j = mid - 1;
            else if (nums[mid] == target) i = mid;
            else if (nums[mid] < target) i = mid + 1;
        }
        result[1] = j;
        return result;

    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(searchRange(new int [] {5, 7, 7, 8, 8, 10}, 8)));
        System.out.println(Arrays.toString(searchRange(new int[]{10, 5, 7, 7, 8, 8}, 8)));
    }
}
