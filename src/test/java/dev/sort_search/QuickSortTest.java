package dev.sort_search;

import org.junit.Test;

/**
 * Created by rthakur on 4/17/17.
 */
public class QuickSortTest {
    @Test
    public void sort() throws Exception {
        int[] input = {1, 2, 3, 4};
        int[] output = {1, 2, 3, 4};
        for (int i : QuickSort.sort(input))
            System.out.printf(i + " ");
//        System.out.println(QuickSort.sort(input));
    }

}