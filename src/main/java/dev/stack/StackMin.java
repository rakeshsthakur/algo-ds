package dev.stack;

import java.util.Stack;

/**
 * A stack that stores the min value that is present in the stack;
 * Created by rthakur on 4/9/17.
 */
class StackMin {

    Stack<Integer> minStack = new Stack<>();
    Stack<Integer> s2 = new Stack<Integer>();

    public static void main(String[] args) {
        StackMin sm = new StackMin();
        sm.push(4);
        sm.push(3);
        System.out.println(sm.min());
        sm.pop();
        System.out.println(sm.min());
        sm.push(-1);
        System.out.println(sm.min());

    }

    public Integer push(Integer integer) {

        if (integer < min()) {
            minStack.push(integer);
        }

        return s2.push(integer);
    }

    public synchronized Integer pop() {

        Integer value = s2.pop();
        if (value == min()) {
            minStack.pop();
        }
        return value;
    }

    int min() {
        if (minStack.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return minStack.peek();
        }
    }

}
