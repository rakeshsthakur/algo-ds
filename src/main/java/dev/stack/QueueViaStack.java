package dev.stack;

import java.util.Stack;

/**
 * Created by rthakur on 4/16/17.
 */
public class QueueViaStack<T> {
    Stack<T> stackNew, stackOld;

    public QueueViaStack() {
        stackNew = new Stack<T>();
        stackOld = new Stack<T>();
    }

    public void add(T input) {
        stackNew.push(input);
    }

    public int size() {
        return stackNew.size() + stackOld.size();
    }

    public T peek() {
        shitStacks();
        return stackOld.peek();
    }

    private void shitStacks() {
        if (stackOld.isEmpty()) {
            while (!stackNew.isEmpty()) {
                stackOld.push(stackNew.pop());
            }
        }
    }

    public T remove() {
        shitStacks();
        return stackOld.peek();
    }

}
