package dev.sort_search;

/**
 * Created by rthakur on 4/16/17.
 */
class QuickSearch {

    public static int quickSearch(int[] array, int input) {
        return quickSearch(array, input, 0, array.length - 1);
    }

    private static int quickSearch(int[] array, int input, int low, int high) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (input > array[mid]) {
            return quickSearch(array, input, mid + 1, high);
        } else if (input < array[mid]) {
            return quickSearch(array, input, low, mid - 1);
        } else {
            return mid;
        }
    }
}
