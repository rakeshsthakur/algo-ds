package dev.arrays_and_strings;

import java.util.Arrays;

/**
 * Created by rthakur on 4/16/17.
 */
public class CheckPermutation {

    public static boolean isPermutationViaSort(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        return sort(s1).equals(sort(s2));

    }

    private static String sort(String s1) {
        char[] content = s1.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }


    public static boolean isPermutation(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }
        int[] letters = new int[128];

        for (int letter : s1.toCharArray()) {
            letters[letter]++;
        }

        for (int letter : s2.toCharArray()) {
            letters[letter]--;
            if (letters[letter] < 0) {
                return false;
            }

        }
        return true;
    }
}
