package dev.arrays_and_strings;

import dev.util.ArraysUtil;

/**
 * Created by rthakur on 6/11/17.
 */
public class Merge2SortedArrays {


    public static void merge(int A[], int m, int B[], int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[k--] = A[i--];
//                System.out.println(k);
//                System.out.println("iiiii : " + i);
            } else
                A[k--] = B[j--];

            ArraysUtil.printArray(A);
            System.out.println("**********************************");
        }
        while (j >= 0)
            A[k--] = B[j--];
    }

    public static void main(String[] args) {
        merge(new int[]{2, 3, 6, 0, 0, 0}, 3, new int[]{1, 2, 4}, 3);
    }
}
