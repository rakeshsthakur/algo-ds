package dev.arrays_and_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rthakur on 7/13/17.
 */
public class ThreeSum {

    public static List<List<Integer>> treeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int lo = i + 1, hi = nums.length - 1, target = -nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] + nums[i] == 0) {
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
//                        while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
//                        while (lo < hi && nums[hi] == nums[hi - 1]) hi--;
                        lo++;
                        hi--;
                    } else if (nums[lo] + nums[hi] < target) {
                        lo++;
                    } else {
                        hi--;
                    }
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
//        Pattern p = Pattern.compile("aa*");
//        System.out.println(p.matcher("aa").find());

        System.out.println(treeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
