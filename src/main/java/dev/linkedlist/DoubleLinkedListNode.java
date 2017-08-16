package dev.linkedlist;

/**
 * Created by rthakur on 7/24/17.
 */
public class DoubleLinkedListNode {
    public int key;
    public int value;
    public DoubleLinkedListNode pre;
    public DoubleLinkedListNode post;


    public DoubleLinkedListNode(int key, int value) {
        this.value = value;
        this.key = key;
    }
}
