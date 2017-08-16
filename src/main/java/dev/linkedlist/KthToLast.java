package dev.linkedlist;

/**
 * Created by rthakur on 4/18/17.
 */
public class KthToLast {

    public static LinkedList kthToLast(LinkedList node, int k) {
        LinkedList p1 = node;
        LinkedList p2 = node;

        for (int i = 0; i < k; i++) {
            if (p1 == null) return null;
            p1 = p1.next;
        }

        while (p1 != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        return p2;
    }
}
