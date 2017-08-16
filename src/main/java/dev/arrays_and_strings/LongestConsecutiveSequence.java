package dev.arrays_and_strings;

import java.util.HashMap;

/**
 * Created by rthakur on 7/24/17.
 */
public class LongestConsecutiveSequence {

    public static int longestConsecutiveSequence(int[] nums) {

        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            if (!map.containsKey(n)) {
                int left = map.getOrDefault(n - 1, 0);
                int right = map.getOrDefault(n + 1, 0);

                int sum = left + right + 1;

                res = Math.max(sum, res);
                map.put(n, sum);
                map.put(n - left, sum);
                map.put(n + right, sum);
            }
        }

        map.forEach((k, v) -> System.out.println("Key " + k + " val " + v));
        return res;

    }


    public static void main(String[] args) {
        System.out.println(longestConsecutiveSequence(new int[]{100, 4, 200, 1, 3, 2})); // -- ans 4
//        System.out.println(longestConsecutiveSequence(new int [] {1, 2, 3}));
//        System.out.println(longestConsecutiveSequence(new int [] {1, 3, 2}));

    }
}
