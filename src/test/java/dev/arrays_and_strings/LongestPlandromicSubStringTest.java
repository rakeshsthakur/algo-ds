package dev.arrays_and_strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rthakur on 6/1/17.
 */
public class LongestPlandromicSubStringTest {


    @Test
    public void test() {

////        System.out.println("abc".substring(0,2));
        assertEquals("", LongestPlandromicSubString.longestPalindrome(""));
        assertEquals("a", LongestPlandromicSubString.longestPalindrome("a"));
//        assertEquals("aba", LongestPlandromicSubString.longestPalindrome("abaccc"));
        assertEquals("bb", LongestPlandromicSubString.longestPalindrome("cbbd"));
//        assertEquals("ababa", LongestPlandromicSubString.longestPalindrome("ababad"));
//
////        System.out.println("abc".substring(0,2));
//        assertEquals("", LongestPlandromicSubString.longestPalindrome2(""));
//        assertEquals("a", LongestPlandromicSubString.longestPalindrome2("a"));
//        assertEquals("aba", LongestPlandromicSubString.longestPalindrome2("abacc"));
//        assertEquals("bb", LongestPlandromicSubString.longestPalindrome2("cbbd"));
//        assertEquals("ababa", LongestPlandromicSubString.longestPalindrome2("ababad"));


    }

}