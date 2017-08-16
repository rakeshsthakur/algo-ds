package dev.arrays_and_strings;

/**
 * Created by rthakur on 7/11/17.
 * Given a string, write a function to check if it is a permutation of
 * a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
 * permutation is a rearrangement of letters. The palindrome does not need to be limited to just
 * dictionary words.
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat'; "atc o eta·; etc.)
 */
public class PermutationOfPalindorme {

    public static boolean isPermutationOfPalindrome(String s) {
        s = s.toLowerCase();
        int[] memo = new int[26];
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c))
                memo[c - 'a']++;
        }
        int oddCount = 0;
        for (int i : memo) {
            if (i % 2 == 1) {
                oddCount++;
            } else {
                oddCount--;
            }

            if (oddCount > 1) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPermutationOfPalindrome("Tact Coa"));
    }
}
