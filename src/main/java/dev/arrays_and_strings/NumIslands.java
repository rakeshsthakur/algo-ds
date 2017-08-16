package dev.arrays_and_strings;

/**
 * Created by rthakur on 7/31/17.
 * https://leetcode.com/problems/number-of-islands/description/
 * <p>
 * help full to derive the row and colum nums for neighbours
 * <p>
 * (i-1, j-1) ,  (i-1, j) ,   (i-1, j+1)
 * (i, j-1)   ,  (i,j)    ,   (i, j+1)
 * (i+1,j-1)  ,  (i+1, j) ,   (i+1, j+1)
 */
public class NumIslands {

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;

        if (grid[0].length == 0)
            return 1;

        int n = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                if (grid[i][j] == '1' && !visited[i][j]) {
                    n++;
                    dfsHelper(grid, visited, i, j);
                }
        return n;
    }

    private static void dfsHelper(char[][] grid, boolean[][] visited, int i, int j) {
        int[] rowNumber = new int[]{-1, 0, 0, 1}; // just the vertical and horizontal neighbours no diagonal
        //int[] rowNumber = new int[] {-1,-1,-1,0,0,1,1,1}; -- ref included diagonal
        int[] colNumber = new int[]{0, -1, 1, 0}; // just the vertical and horizontal neighbours no diagonal
//        int[] colNumber =new int[] {-1,0,1,-1,1,-1,0,1}; //-- ref included diagonal
        visited[i][j] = true;
        for (int k = 0; k < 4; k++) {
            if (canVisit(grid, visited, i + rowNumber[k], j + colNumber[k])) {

                dfsHelper(grid, visited, i + rowNumber[k], j + colNumber[k]);
            }
        }

    }

    private static boolean canVisit(char[][] grid, boolean[][] visited, int i, int j) {
        return i >= 0 && j >= 0 && grid.length > i && grid[0].length > j && !visited[i][j] && grid[i][j] == '1';
    }


    public static void main(String[] args) {
        System.out.println(numIslands(new char[][]{
                new char[]{'1', '1', '1', '1', '0'},
                new char[]{'1', '1', '0', '1', '0'},
                new char[]{'1', '1', '0', '0', '0'},
                new char[]{'0', '0', '0', '0', '0'}
        }));
    }
}
