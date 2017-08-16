package dev.arrays_and_strings;

/**
 * Created by rthakur on 6/1/17.
 */
public class LongestPlandromicSubString {
    static int maxLen;
    static int lo;

    public static String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return s;

        for (int i = 0; i < s.length() - 1; i++) {
            helper(s, i, i);
            helper(s, i, i + 1); //assume even length. -- what does this mean?
        }
        return s.substring(lo, maxLen + lo);
    }

    private static void helper(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }

        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }

    public static String getLongestPlandromicSubString(String input) {
        if (input.length() < 2) {
            return input;
        }
        String result = "";
        int currentMaxLength = 0;
        for (int i = 0; i < input.length(); i++) {

            if (isPalindrome(input, i - currentMaxLength - 1, i)) {

                result = input.substring(i - currentMaxLength - 1, i + 1);
                currentMaxLength = currentMaxLength + 2;

            } else if (isPalindrome(input, i - currentMaxLength, i)) {
                result = input.substring(i - currentMaxLength, i + 1);
                currentMaxLength = currentMaxLength + 1;
            }

        }


        return result;


    }

    private static boolean isPalindrome(String input, int begin, int end) {

        if (begin < 0) return false;
        while (begin < end) {
            if (input.charAt(begin++) != input.charAt(end--)) return false;
        }
        return true;
    }
}
