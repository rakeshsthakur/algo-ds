package dev.arrays_and_strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PairSum {
//    private static final int MAX = 100000; // Max size of Hashmap

    static void printpairs(int arr[], int sum) {
        // Declares and initializes the whole array as false
//        boolean[] binmap = new boolean[MAX];
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; ++i) {

            int temp = sum - arr[i];

            // checking for condition
//            if (temp >= 0 && map.get(arr[i]) != null) {
//                System.out.println("Pair with given sum " +
//                        sum + " is (" + arr[i] +
//                        ", " + temp + ")");
//            }
            if (temp >= 0 && set.contains(arr[i])) {
                System.out.println("Pair with given sum " +
                        sum + " is (" + arr[i] +
                        ", " + temp + ")");
            }
//            binmap[arr[i]] = true;
            set.add(sum - arr[i]);
        }
    }

    // Main to test the above function
    public static void main(String[] args) {
        int A[] = {-1, 4, 45, 6, 10, 8};
        int n = 16;
        printpairs(A, n);
    }
}
