package dev.arrays_and_strings;

import dev.util.ArraysUtil;

/**
 * Created by rthakur on 7/6/17.
 */
public class SetMatrixZeroes {

    public static void setZeroes(int[][] matrix) {

        int col0 = 1, rows = matrix.length, columns = matrix[0].length;


        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) col0 = 0;

            for (int j = 1; j < columns; j++) {

                if (matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;

                    ArraysUtil.printMatrix(matrix);
                    System.out.println(i + " " + j);
                }

            }
        }


        for (int i = rows - 1; i >= 0; i--) {
            for (int j = columns - 1; j >= 1; j--) {

                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
//                    ArraysUtil.printMatrix(matrix);
//                    System.out.println("\n");
                    matrix[i][j] = 0;
                }
            }
            if (col0 == 0) matrix[i][0] = 0;

        }
    }


    public static void main(String[] args) {

        System.out.println(2 ^ 2 ^ 3 ^ 3 ^ 0);
        int[][] matrix = {new int[]{1, 1, 1}, new int[]{0, 1, 2}};
//        setZeroes(matrix);

//       ArraysUtil.printMatrix(matrix);

    }
}
