package dev.arrays_and_strings;

import java.util.PriorityQueue;

/**
 * Created by rthakur on 7/19/17.
 */
public class FindKMinimumElementsInAnArray {

    public static int[] find(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int n : nums) {
            queue.offer(n);
        }

        int count = 0;
        for (int n : queue)
            if (count++ < k) {
                System.out.println(n);
            } else
                break;
        return null;
    }

    public static void main(String[] args) {
        find(new int[]{1, 2, 5, 6, 0, -1}, 2);
    }
}
