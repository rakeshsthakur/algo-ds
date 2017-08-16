package dev.linkedlist;

/**
 * Created by rthakur on 7/22/17.
 */
class Node {

    int val;
    Node next;
    Node prev;
//    private  cur;


    public Node(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }

}

public class DoubleLinkedList {

    public Node head;

    public DoubleLinkedList() {
        head = null;
    }

    public static void main(String[] args) {


        DoubleLinkedList dll = new DoubleLinkedList();
        dll.add(new Node(4));
        dll.add(new Node(3));
        dll.add(new Node(2));
        dll.add(new Node(1));

        Node newNode = new Node(0);
        Node extra = dll.add(newNode);
        dll.print(extra);
//        DoubleLinkedList node = new DoubleLinkedList(1);
//
//        newHead = node.add(new DoubleLinkedList(0));
//
//        node.print();
    }

    public Node add(Node node) {
//        DoubleLinkedList head = this;
        //node.next = this;

//        this.prev = node;
//        return node;
//        this = node;
//        head = node;
//        this = head;
        if (head == null) {
            head = node;
            return head;
        }

        Node newNode = node;
        newNode.prev = null;
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

        return head;
    }

    public void print(Node node) {
        Node cur = node;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
}
