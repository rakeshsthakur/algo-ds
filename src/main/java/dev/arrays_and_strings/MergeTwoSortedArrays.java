package dev.arrays_and_strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by rthakur on 7/18/17.
 */
public class MergeTwoSortedArrays {

    public static int[] merge(int[] nums1, int[] nums2) {
        int l1 = nums1.length - 1;
        int l2 = nums2.length - 1;
        int resultLength = nums1.length + nums2.length;
        int[] result = new int[resultLength];

        while (resultLength > 0) {
            result[--resultLength] = (l2 < 0 || (l1 >= 0 && nums1[l1] >= nums2[l2])) ? nums1[l1--] : nums2[l2--];
        }

        return result;
    }

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer t1, Integer t2) {
                return t2 - t1;
            }
        });

        pq.add(1);
        pq.add(10);
        pq.add(-2);
        System.out.println(pq.peek());
        System.out.println(Arrays.toString(merge(new int[]{1, 2, 3, 4}, new int[]{4, 5, 6, 7, 8})));
    }
}
