package dev.linkedlist;

/**
 * Created by rthakur on 4/18/17.
 */
public class LinkedList<T> {
    T data;
    LinkedList next;
    LinkedList last;
    int length = 0;

    public LinkedList(T input) {
        data = input;
        next = null;
    }

    public LinkedList() {

    }

    public void add(T input) {
        LinkedList<T> newNode = new LinkedList<T>(input);
        LinkedList<T> head = this;
        if (head == null) {
            head = newNode;
        }
        while (head.next != null) {
            head = head.next;
        }
        head.next = newNode;
        last = newNode;
        ++length;
    }

    /**
     * Returns null if list is empty.
     *
     * @return
     */
    public LinkedList getLast() {
        return last;
    }

    public int length() {
        return length;
    }
}
