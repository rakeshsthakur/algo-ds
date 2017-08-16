package dev.arrays_and_strings;

/**
 * Created by rthakur on 4/16/17.
 */
public class RotateMatrix {

    public static boolean rotateMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length != matrix.length) {
            return false;
        }
        int n = matrix.length;

        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;

            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                // left to top
                matrix[first][i] = matrix[last - offset][first];
                // bottom to left
                matrix[last - offset][first] = matrix[last][last - offset];

                // right to bottom
                matrix[last][last - offset] = matrix[i][last];
                // top to right
                matrix[i][last] = top;
            }
        }
        return true;

    }
}
