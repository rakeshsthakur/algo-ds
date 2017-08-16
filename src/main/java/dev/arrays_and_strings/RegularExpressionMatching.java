package dev.arrays_and_strings;

/**
 * Created by rthakur on 7/14/17.
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * <p>
 * The matching should cover the entire input string (not partial).
 * <p>
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 * <p>
 * Some examples:
 * isMatch("aa","a") ? false
 * isMatch("aa","aa") ? true
 * isMatch("aaa","aa") ? false
 * isMatch("aa", "a*") ? true
 * isMatch("aa", ".*") ? true
 * isMatch("ab", ".*") ? true
 * isMatch("aab", "c*a*b") ? true
 */
public class RegularExpressionMatching {


    public static void main(String[] args) {

        RegularExpressionMatching rg = new RegularExpressionMatching();
        System.out.println(rg.isMatch("aa", ".*"));
    }

    // ref https://discuss.leetcode.com/topic/6183/my-concise-recursive-and-dp-solutions-with-full-explanation-in-c
    public boolean isMatch(String s, String p) {

//        Integer.parseInt("");
//        Integer.valueOf("");
        if (p.isEmpty()) return s.isEmpty();

        if (p.length() > 1 && '*' == p.charAt(1))
            return (isMatch(s, p.substring(2)) || !s.isEmpty() && (s.charAt(0) == p.charAt(0) || '.' == p.charAt(0) && isMatch(s.substring(1), p)));
        else
            return !s.isEmpty() && (s.charAt(0) == p.charAt(0) || '.' == p.charAt(0)) && isMatch(s.substring(1), p.substring(1));

    }


}
