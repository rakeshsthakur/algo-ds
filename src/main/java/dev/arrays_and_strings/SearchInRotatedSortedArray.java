package dev.arrays_and_strings;

/**
 * Created by rthakur on 7/14/17.
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * <p>
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * <p>
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * <p>
 * You may assume no duplicate exists in the array.
 */
public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;

            if (nums[mid] == target)
                return mid;


            if (nums[left] <= nums[mid]) {
                if (target < nums[mid] && target >= nums[left])
                    right = mid - 1;
                else
                    left = mid + 1;

            } else {
                if (target > nums[mid] && target <= nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }

        }

        return -1;

    }
}
