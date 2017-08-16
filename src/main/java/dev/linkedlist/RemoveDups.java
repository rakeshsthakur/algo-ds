package dev.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by rthakur on 4/18/17.
 */
public class RemoveDups<T> {
    Set<T> memo;

    RemoveDups() {
        memo = new HashSet<T>();
    }

    public void removeDups(LinkedList<T> node) {
        while (node != null) {
            if (memo.contains(node.data)) {
                System.out.println("Found Duplicate " + node.data);
            } else {
                memo.add(node.data);
            }
            node = node.next;
        }
    }
}
