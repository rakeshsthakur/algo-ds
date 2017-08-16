package dev.arrays_and_strings;

/**
 * Created by rthakur on 7/12/17.
 */
public class IncreasingTripletSubSequence {

    // This only work for continous sub sequence;
    public static boolean increasingTriplet2(int[] nums) {

        for (int i = 0; i <= nums.length - 3; i++) {
            System.out.println(nums[i]);
            if (nums[i] < nums[i + 1])
                if (nums[i + 1] < nums[i + 2])
                    return true;
//            System.out.println(nums[i]< nums[i+1]);
        }

        return false;
    }

    public static boolean increasingTriplet(int[] nums) {
        int big = Integer.MAX_VALUE, small = Integer.MAX_VALUE;

        for (int n : nums) {
            System.out.println(n);
            if (small >= n) {
                small = n;
            } else if (big >= n) {
                big = n;
            } else return true;

        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{1, 2, 3}));
    }
}
