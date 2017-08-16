package dev.arrays_and_strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rthakur on 7/12/17.
 */
public class FindMinimumInSortedRotatedArray {

    public static int process(int nums[]) {

        int start = 0, end = nums.length - 1;

        while (start < end) {
            if (nums[start] < nums[end])
                return nums[start];

            int mid = (start + end) / 2;

            if (nums[start] <= nums[mid])
                start = mid + 1;
            else
                end = mid;
        }
        return nums[start];
    }


    public static void main(String[] args) {
//        System.out.println(process(new int[] {5,6,1,2,3,4}));

        List<List<Integer>> list = new ArrayList<>();
        System.out.println();
//        list.get(0).add
//        List<Integer> a = new ArrayList<>();
//        a.add(2);
//        list.add(a);
//        List<Integer> b = new ArrayList<>();
//        b.add(3);
//        list.add(b);
//        for(List<Integer> z : list)
//            System.out.println(z);
    }
}
