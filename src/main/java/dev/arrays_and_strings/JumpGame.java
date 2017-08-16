package dev.arrays_and_strings;

/**
 * Created by rthakur on 7/31/17.
 * https://leetcode.com/problems/jump-game/
 */
public class JumpGame {

    public static boolean canjump(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        if (nums.length == 1) return true;

        int lastpos = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i++) {
            if (i + nums[i] >= lastpos)
                lastpos = i;
        }

        return lastpos == 0;
    }

}
