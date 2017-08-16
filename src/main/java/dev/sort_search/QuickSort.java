package dev.sort_search;

import java.util.Arrays;

/**
 * Created by rthakur on 4/16/17.
 */
public class QuickSort {

    public static int[] sort(int[] array) {

        quickSort(array, 0, array.length - 1);
        return array;
    }

    private static void quickSort(int[] array, int left, int right) {

        int index = partition(array, left, right);

        if (left < index - 1) {
            quickSort(array, left, index - 1);
        }
        if (index < right) {
            quickSort(array, index, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[(left + right) / 2];

        while (left <= right) {
            while (array[left] < pivot) left++;
            while (array[right] > pivot) right--;

            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(sort(new int[]{2, 1, 4, 6, 4})));
    }
}
