package dev.arrays_and_strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rthakur on 7/28/17.
 * <p>
 * problem 16.2 from ctci6
 */
public class WordFrequencies {
    Map<String, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        WordFrequencies wf = new WordFrequencies();
        System.out.println(wf.getFreq(new String[]{"Rak", "Rak", "todo", "count"}, "Rk"));

    }

    public int getFreq(String[] book, String word) {

        if (memo.get(word) == null) {
            freqHelper(book);
        }

        return memo.getOrDefault(word, -1);
    }

    private void freqHelper(String[] book) {

        for (String s : book) {
            memo.put(s, memo.getOrDefault(s, 0) + 1);
        }
    }
}
