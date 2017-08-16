package dev.arrays_and_strings;

/**
 * Created by rthakur on 6/29/17.
 * [
 * [1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]
 * ]
 */
public class SearchA2DMatrixII {

    public static void main(String[] args) {
        SearchA2DMatrixII target = new SearchA2DMatrixII();
        System.out.println(target.searchMatrix(new int[][]{new int[]{1, 5}, new int[]{2, 6}}, 6));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
//        System.out.println(matrix.length + " " + matrix[0].length);
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1)
            return false;

        int row = 0;
        int column = matrix[0].length - 1;

        while (column >= 0 && row <= matrix.length - 1) {
            if (target == matrix[row][column]) {
                return true;
            } else if (target < matrix[row][column]) {
                column--;
            } else
                row++;
        }

        return false;
    }
}
