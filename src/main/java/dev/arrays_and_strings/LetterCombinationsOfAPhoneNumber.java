package dev.arrays_and_strings;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by rthakur on 7/12/17.
 */
public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNumber ln = new LetterCombinationsOfAPhoneNumber();
        System.out.println(ln.letterCombinations("23"));
    }

    public List<String> letterCombinations(String digits) {

        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        LinkedList<String> queue = new LinkedList<>();
        queue.add("");

        for (int i = 0; i < digits.length(); i++) {
            int index = Character.getNumericValue(digits.charAt(i));
            while (queue.peek().length() == i) {
                String current = queue.poll();
                for (char c : mapping[index].toCharArray()) {
                    queue.add(current + c);
                    System.out.println(current + c);
                }
            }
        }

        return queue;
    }
}
