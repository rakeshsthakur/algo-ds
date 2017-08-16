package dev.arrays_and_strings;

/**
 * Created by rthakur on 7/7/17.
 */
public class FirstUniqueChar {

    public static int process(String s) {
        int[] memo = new int[128];

        for (char c : s.toCharArray()) {
            memo[c]++;
//            if(memo[c]>1) break;
            // if(memo[c-'a']>1)  return s.indexOf(c);
        }


        for (int i = 0; i < s.length(); i++) {
            if (memo[s.charAt(i)] == 1) return i;
        }
        // if (n==1) return s.indexOf(n+'a');


        return -1;
    }

    public static void main(String[] args) {
        process("leetcode");
    }

}
