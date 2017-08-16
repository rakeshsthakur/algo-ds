package dev.arrays_and_strings;

import java.util.Stack;

/**
 * Created by rthakur on 7/18/17.
 */
public class BasicCalulator {
    public static void main(String[] args) {
        BasicCalulator bc = new BasicCalulator();
//        System.out.println(bc.calculate("2147483647"));
        System.out.println(bc.calculateII2("3+22*2/3"));
        System.out.println(bc.calculateII("3+22*2/3"));
    }

    /**
     * Implement a basic calculator to evaluate a simple expression string.
     * <p>
     * The expression string may contain open ( and closing parentheses ), the plus + or minus sign -, non-negative integers and empty spaces .
     * <p>
     * You may assume that the given expression is always valid.
     * <p>
     * Some examples:
     * "1 + 1" = 2
     * " 2-1 + 2 " = 3
     * "(1+(4+5+2)-3)+(6+8)" = 23
     * Note: Do not use the eval built-in library function.
     *
     * @param s
     * @return
     */
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int sign = 1; // 1 or -1 based on value.
        int number = 0;
        for (char c : s.toCharArray()) {

            if (Character.isDigit(c)) {
                number = number * 10 + c - '0';
            } else if (c == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * number;
                number = 0;
                result *= stack.pop();
                result += stack.pop();
            }

        }

        if (number != 0)
            result += number * sign;

        return result;
    }

    /**
     * Implement a basic calculator to evaluate a simple expression string.
     * <p>
     * The expression string contains only non-negative integers, +, -, *, / operators and empty spaces .
     * The integer division should truncate toward zero.
     * <p>
     * You may assume that the given expression is always valid.
     * <p>
     * Some examples:
     * "3+2*2" = 7
     * " 3/2 " = 1
     * " 3+5 / 2 " = 5
     * Note: Do not use the eval built-in library function.
     *
     * @param s
     * @return
     */
    public int calculateII(String s) {
        if (s == null || s.length() == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        int number = 0;
        int sign = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                number = number * 10 + c - '0';
//                continue; // will not work since we will be ignore last operation from s.length()-1
            }
            if (!Character.isDigit(c) && c != ' ' || i == s.length() - 1) {

                if (sign == '+') {
                    stack.push(number);
//                    System.out.println("Adding nubner: " + number);
                }
                if (sign == '-')
                    stack.push(-number);
                if (sign == '*')
                    stack.push(stack.pop() * number);
                if (sign == '/')
                    stack.push(stack.pop() / number);
                number = 0;
                sign = c;
            }
        }

        int result = 0;
        for (int i : stack)
            result += i;
        return result;
    }

    public int calculateII2(String s) {
        int len;
        if (s == null || (len = s.length()) == 0) return 0;
        Stack<Integer> stack = new Stack<Integer>();
        int num = 0;
        char sign = '+';
        for (int i = 0; i < len; i++) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + Character.getNumericValue(s.charAt(i));
            }
            if ((!Character.isDigit(s.charAt(i)) && ' ' != s.charAt(i) || i == len - 1)) {
                if (sign == '-') {
                    stack.push(-num);
                } else if (sign == '+') {
                    stack.push(num);
                } else if (sign == '*') {
                    stack.push(stack.pop() * num);
                } else if (sign == '/') {
                    stack.push(stack.pop() / num);
                }
                sign = s.charAt(i);
                num = 0;
            }
        }

        int re = 0;
        for (int i : stack) {
            re += i;
        }
        return re;
    }
}
