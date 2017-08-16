package dev.arrays_and_strings;

/**
 * Created by rthakur on 6/29/17.
 * [
 * [1,   3,  5,  7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]
 * ]
 * <p>
 * IDEA : converting a n*m matrix to an array - > matrix[x][y] -> a[x*m+y]
 * <p>
 * array to matrix(n*m) - > a[x] -> matrix[x/m][x%m];
 */
public class SearchA2DMartrix {

    public static boolean search(int[][] matrix, int target) {

        int row = matrix.length;
        int column = matrix[0].length;
        int left = 0, right = row * column - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int midVal = matrix[mid / column][mid % column];

            if (midVal == target) {
                return true;
            } else if (midVal < target) {
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(search(new int[][]{new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9}}, 2));
    }
}
