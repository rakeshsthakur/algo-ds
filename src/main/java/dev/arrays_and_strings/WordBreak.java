package dev.arrays_and_strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rthakur on 7/18/17.
 * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words,
 * determine if s can be segmented into a space-separated sequence of one or more dictionary words.
 * You may assume the dictionary does not contain duplicate words.
 * <p>
 * For example, given
 * s = "leetcode",
 * dict = ["leet", "code"].
 * <p>
 * Return true because "leetcode" can be segmented as "leet code".
 */
public class WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {

        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = i - 1; j >= 0; j--) {
//                System.out.println("j: " + j + " and dp[j] " + dp[j] );
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    System.out.println("i: " + i + " j : " + j);
                    break;
                }
            }
//            System.out.println("----------------------------");
        }

        return dp[s.length()];
    }

    public static void main(String[] args) {
//
//        for(int i =0; i<10; i++){
//            for(int j =0 ; j<10 ; j++) {
//                System.out.println(j);
//                if (j == 5)
//                    break;
//            }
//        }
//        System.out.println("String".substring(0,1));
        List<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("aaa");
//        list.add("leet");
//        list.add("code");
//        System.out.println(wordBreak("leetcode", list));
        System.out.println(wordBreak("aaaaaaa", list));
        System.out.println("aaaaaaa".substring(0, 7));
    }

}
