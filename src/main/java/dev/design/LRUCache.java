package dev.design;

import dev.linkedlist.DoubleLinkedListNode;

import java.util.Hashtable;

/**
 * Created by rthakur on 7/24/17.
 */
public class LRUCache {

    private int count;
    private int capacity;

    private DoubleLinkedList dList;
    private Hashtable<Integer, DoubleLinkedListNode> cache = new Hashtable<>();

    public LRUCache(int capacity) {
        this.count = 0;
        this.capacity = capacity;
        dList = new DoubleLinkedList();
    }

    public int get(int key) {
        DoubleLinkedListNode node = cache.get(key);
        if (node == null) {
            return -1; // does not exist.
        }

        // should be moved to head as this was recently used.
        dList.moveToHead(node);
        return node.value;
    }


    public void put(int key, int value) {
        DoubleLinkedListNode node = cache.get(key);

        if (node == null) {
            DoubleLinkedListNode newNode = new DoubleLinkedListNode(key, value);
//            newNode.key = key;
//            newNode.value = value;

            cache.put(key, newNode);
            dList.addNode(newNode);
            count++;

            if (count > capacity) {
                // pop tail
                DoubleLinkedListNode tail = dList.popTail();
                cache.remove(tail.key);
                count--;
            }
        } else {
            // update value
            node.value = value;
            dList.moveToHead(node);
        }
    }
}
