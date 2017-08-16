package dev.util;

/**
 * Created by rthakur on 6/11/17.
 */
public class ArraysUtil {


    public static void printArray(int[] input) {
        for (int i : input) {
            System.out.println(i);
        }
    }


    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}



