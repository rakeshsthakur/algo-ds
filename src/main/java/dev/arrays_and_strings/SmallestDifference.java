package dev.arrays_and_strings;

import java.util.Arrays;

/**
 * Created by rthakur on 7/28/17.
 */
public class SmallestDifference {

    /*
*input: {1, 3, 15, 11, 2}, {23, 127, 235, 19, 8}
Output: 3. That is, the pair (11, 8).
*/
    public static int smallestDifference(int[] nums1, int[] nums2) {

        Arrays.sort(nums1); // {1,2,3,11,15}
        Arrays.sort(nums2); // {8,19, 23, 127,235}
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            int diff = nums1[i] - nums2[j];
            if (diff >= 0) {
                int currentMin = Math.min(min, diff);
                if (currentMin != min) {
                    min = currentMin;
                }
            }
            if (nums1[i] < nums2[j])
                i++;
            else
                j++;
        }
        System.out.println(min);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        return min;
    }

    public static void main(String[] args) {
        System.out.println(smallestDifference(new int[]{1, 3, 15, 11, 2}, new int[]{23, 127, 235, 19, 8}));
    }
}
