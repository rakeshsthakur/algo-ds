package dev.arrays_and_strings;

import java.util.PriorityQueue;

/**
 * Created by rthakur on 6/28/17.
 */
public class FindKthLargest {

    public static int findKthLargestWithPQ(int[] nums, int k) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int n : nums) {
            queue.add(n);


            if (queue.size() > k)
                queue.poll();

        }
        return queue.peek();
    }

    public static void main(String[] args) {
        FindKthLargest f = new FindKthLargest();
        System.out.println(f.findKthLargest(new int[]{7, 2, 4, 1, 8}, 2));
    }

    public int findKthLargest(int[] nums, int k) {
        k = nums.length - k;
        int lo = 0;
        int hi = nums.length - 1;

        while (lo < hi) {
            int j = partition(nums, lo, hi);
            System.out.println("j = " + j);
            if (j < k) {
                lo = j + 1;
            } else if (j > k) {
                hi = j - 1;
            } else {
                break;
            }
        }

        return nums[k];
    }

    private int partition(int[] nums, int lo, int hi) {
        int i = lo;
        int j = hi;
        while (true) {
            while (i < hi && nums[++i] < nums[lo]) ;
            System.out.println(i + " " + j);
            while (j > lo && nums[lo] < nums[--j]) ;
            System.out.println(i + " " + j);
            if (i >= j) {
                break;
            }

        }
        if (lo != j)
            swap(nums, lo, j);
        return j;
    }

    private void swap(int[] nums, int lo, int j) {
        System.out.println("swapping " + lo + " with " + j);
        int tmp = nums[lo];
        nums[lo] = nums[j];
        nums[j] = tmp;
    }
}
