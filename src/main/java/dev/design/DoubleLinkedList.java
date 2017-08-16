package dev.design;

import dev.linkedlist.DoubleLinkedListNode;

/**
 * Created by rthakur on 7/24/17.
 */
public class DoubleLinkedList {

    private DoubleLinkedListNode head, tail;


    DoubleLinkedList() {
        head = new DoubleLinkedListNode(0, 0);
        head.pre = null;

        tail = new DoubleLinkedListNode(0, 0);
        tail.post = null;

        head.post = tail;
        tail.pre = head;
    }

    /**
     * Always add the new node right after head;
     */
    public void addNode(DoubleLinkedListNode node) {
        node.pre = head;
        node.post = head.post;
        head.post.pre = node;
        head.post = node;
    }


    public void removeNode(DoubleLinkedListNode node) {
        DoubleLinkedListNode pre = node.pre;
        DoubleLinkedListNode post = node.post;
        pre.post = post;
        post.pre = pre;
    }


    public void moveToHead(DoubleLinkedListNode node) {
        this.removeNode(node);
        this.addNode(node);
    }

    public DoubleLinkedListNode popTail() {
        DoubleLinkedListNode res = tail.pre;
        this.removeNode(res);
        return res;
    }

}
