package dev.arrays_and_strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rthakur on 4/30/17.
 */
public class MajorityElement {


    public static int majorityElement(int[] nums) {

        int[] memo2;

        Map<Integer, Integer> memo = new HashMap<>();

        int length = nums.length;
        for (Integer i : nums) {
            if (memo.containsKey(i)) {
                Integer inc = memo.get(i);
                ++inc;
                if (inc > (length / 2)) {
                    return i;
                }
                memo.put(i, inc);
            } else {
                memo.put(i, 1);
            }

        }

        return nums[0];
    }


    public static int majorityElement2(int[] nums) {
        int major = nums[0], count = 1;

        for (int i = 1; i < nums.length; i++) {
//            System.out.println(count);
            System.out.println("major " + major + "\t" + "number " + nums[i] + "\t" + "Count " + count);
            if (count == 0) {
                major = nums[i];
                count++;
            } else if (major == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return major;
    }

    public static void main(String[] args) {
        System.out.println("Result " + majorityElement2(new int[]{10, 9, 9, 9, 10}));

//        "Rakesh".contains
    }
}
