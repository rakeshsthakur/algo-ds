package dev.arrays_and_strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rthakur on 8/7/17.
 * Given n = 4.
 * Print 2,4,9,16
 */
public class PerfectSquaresUptoN {


    public static List<Integer> getSqauare(int n) {
        List<Integer> results = new ArrayList<>();
        int i = n;
        while (i > 0) {
            int j = i;
            int result = 0;
            while (j > 0) {
                result += i;
                j--;
            }
            results.add(result);
            i--;
        }
        return results;
    }


    public static void main(String[] args) {
        System.out.println(getSqauare(4).toString());
    }
}
