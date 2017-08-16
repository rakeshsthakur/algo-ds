package dev.arrays_and_strings;

/**
 * Created by rthakur on 6/16/17.
 */
public class LongestCommonPrexfix {

    public static String getLongestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];
        String currentLongestPrefix = strs[0];
        for (String s : strs) {

            while (s.indexOf(currentLongestPrefix) != 0 && currentLongestPrefix.length() > 0) {
                int currentLongestPrefixLen = currentLongestPrefix.length();
                currentLongestPrefix = currentLongestPrefix.substring(0, currentLongestPrefix.length() - 1);
            }
        }

        System.out.println(currentLongestPrefix);
        return currentLongestPrefix;


    }


    public static void main(String[] args) {
        getLongestCommonPrefix(new String[]{"a", "b"});
    }
}
