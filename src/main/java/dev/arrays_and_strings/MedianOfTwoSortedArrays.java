package dev.arrays_and_strings;

/**
 * Created by rthakur on 7/13/17.
 * //TODO: was not able to understand even after spending about 2 hours.
 * also seems like a good solution https://discuss.leetcode.com/topic/4996/share-my-o-log-min-m-n-solution-with-explanation/2
 */
public class MedianOfTwoSortedArrays {


    public static double findMedianSortedArray(int[] nums1, int[] nums2) {

        int l = (nums1.length + nums2.length + 1) / 2;
        int r = (nums1.length + nums2.length + 2) / 2;

        return (helper(nums1, 0, nums2, 0, l) + helper(nums1, 0, nums2, 0, r)) / 2;
    }

    private static double helper(int[] nums1, int nums1Start, int[] nums2, int nums2Start, int k) {

        if (nums1Start > nums1.length - 1)
            return nums2[nums2Start + k - 1];
        if (nums2Start > nums2.length - 1)
            return nums1[nums1Start + k - 1];

        if (k == 1)
            return Math.min(nums1[nums1Start], nums2[nums2Start]);
        int nums1Mid = Integer.MAX_VALUE, nums2Mid = Integer.MAX_VALUE;

        if (nums1Start + k / 2 - 1 < nums1.length)
            nums1Mid = nums1[nums1Start + k / 2 - 1];
        if (nums2Start + k / 2 - 1 < nums2.length)
            nums2Mid = nums2[nums2Start + k / 2 - 1];

        if (nums1Mid < nums2Mid)
            return helper(nums1, nums1Start + k / 2, nums2, nums2Start, k - k / 2);
        else
            return helper(nums1, nums1Start, nums2, nums2Start + k / 2, k - k / 2);
    }


    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println((a[a.length / 2] + a[a.length / 2 - 1]) / 2);
//        System.out.println(findMedianSortedArray(new int[]{1}, new int[]{3, 4}));
    }
}
