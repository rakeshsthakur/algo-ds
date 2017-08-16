package dev.arrays_and_strings;

/**
 * Created by rthakur on 6/9/17.
 * // Given "abcabc" and "abc" ans: 2 , since "abc" appears twice in "abcabc"
 * // Given "ababa" and "aba" ans: 2 , since "aba" appears twice in "ababa"
 */
public class InstanceCount {


    public static int getInstance(String body, String target) {
        int result = 0;
        for (int i = 0; i < body.length(); i++) {
            if (i + target.length() <= body.length()) {
                if (body.substring(i, i + target.length()).equals(target)) {
                    result++;
                }
            }
        }

        return result;
    }


}
