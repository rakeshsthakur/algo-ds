package dev.stack;

import java.util.Stack;

public class BalancedBrackets {
    public static boolean isValid(String s) {
        // (', ')', '{', '}', '[' and ']'
        Stack<Character> memo = new Stack<>();

        for (char c : s.toCharArray()) {
            if (memo.size() > 0) {
                if (c == '}') {
                    if (memo.peek() == '{')
                        memo.pop();
                } else if (c == ')') {
                    if (memo.peek() == '(')
                        memo.pop();
                } else if (c == ']') {
                    if (memo.peek() == '[')
                        memo.pop();
                }
            }
            if (c == '{' || c == '(' || c == '[')
                memo.push(c);
        }
        return memo.size() == 0;

    }
}
