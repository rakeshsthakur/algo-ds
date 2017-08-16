package dev.arrays_and_strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by rthakur on 7/25/17.
 */
public class WordLadder {

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> sdf = new HashSet<>(wordList);
        Set<String> beginSet = new HashSet<>(), endSet = new HashSet<>();

        int len = 1;
        Set<String> visited = new HashSet<>();

        beginSet.add(beginWord);
        endSet.add(endWord);

        while (!beginSet.isEmpty() && !endSet.isEmpty()) {
//            System.out.println(beginSet.toString());
//            if (beginSet.size() > endSet.size()) {
//                Set<String> set = beginSet;
//                beginSet = endSet;
//                endSet = set;
//            }
            Set<String> temp = new HashSet<>();
//            System.out.println(beginSet.toString());
            for (String word : beginSet) {
//                System.out.println(word);
                char[] chs = word.toCharArray();

                for (int i = 0; i < chs.length; i++) {
                    for (char c = 'a'; c <= 'z'; c++) {
                        char old = chs[i];
                        chs[i] = c;
                        String newWord = String.valueOf(chs);
                        if (endSet.contains(newWord) && wordList.contains(newWord)) {
                            System.out.println(endSet);
                            System.out.println(newWord);
                            return len + 1;
                        }

                        if (!visited.contains(newWord) && wordList.contains(newWord)) {
                            temp.add(newWord);
                            visited.add(newWord);
                        }
                        chs[i] = old;

                    }
                }
            }
            beginSet = temp;

            len++;
        }

        return 0;
    }


    public static void main(String[] args) {

        System.out.println(ladderLength("hit", "cog", new ArrayList<String>() {{
            add("hot");
            add("dot");
            add("dog");
            add("lot");
            add("log");
//            add("cog");
        }}));
    }
}
