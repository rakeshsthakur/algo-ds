package dev.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by rthakur on 4/10/17.
 */
public class StackOfPlates {
    Integer maxStackSize = 1;
    List<Stack<Integer>> stacks = new ArrayList<>(maxStackSize);
    int currentIndex = 0;

    public StackOfPlates() {
        stacks.add(new Stack<>());
    }

    public void push(Integer integer) {
        if (stacks.get(currentIndex).size() >= maxStackSize) {
            stacks.add(new Stack<>());
            currentIndex++;
        }
        stacks.get(currentIndex).push(integer);
    }


    public Integer pop() {
        if (stacks.get(currentIndex).isEmpty()) {
            if (stacks.size() >= 1) {

                if (currentIndex == 0) {
                    return null;
//                    throw new Exception("No more stacks left to pop");
                }
                currentIndex--;
                return stacks.get(currentIndex).pop();
            }
        } else {
            return stacks.get(currentIndex).pop();
        }
        return Integer.MAX_VALUE;
    }
}
