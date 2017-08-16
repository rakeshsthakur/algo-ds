package dev.arrays_and_strings;

import java.util.Arrays;

/**
 * Created by rthakur on 7/19/17.
 * Rotate an array of n elements to the right by k steps.
 * <p>
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */
public class RotateArray {
    public static void rotate2(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int[] nums, int k) {
//        int i = 0;
//        int j = nums.length-k;
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[(i + k) % nums.length] = nums[i];
        }
//        while(i < nums.length && j <nums.length){
//            int temp  = nums[i];
//            nums[i] = nums[j];
//            nums[j] = temp;
//            i++;
//            j++;
//        }
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        System.out.println((4 + 3) % 5);
        rotate(new int[]{1, 2, 3, 4, 5}, 2);
    }

    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;


        while (i < j) {
            if (Character.isLetterOrDigit(s.charAt(i)) && (Character.isLetterOrDigit(s.charAt(j)))) {
                if (s.charAt(i) != s.charAt(j))
                    return false;
                i++;
                j--;
            } else {
                if (!Character.isLetterOrDigit(s.charAt(i)))
                    i++;
                else
                    j--;
            }
        }
        return true;
    }
}
