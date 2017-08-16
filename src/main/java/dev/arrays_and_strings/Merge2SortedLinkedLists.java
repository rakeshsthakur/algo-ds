package dev.arrays_and_strings;

/**
 * Created by rthakur on 7/9/17.
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */
public class Merge2SortedLinkedLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            System.out.println("here from l1 less than l2 l1.val " + l1.val + " l2.val " + l2.val);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
//            System.out.println("here2");
            System.out.println("here 2 l1.val " + l1.val + " l2.val " + l2.val);
            return l2;
        }
    }

    public static void main(String[] args) {
//        Merge2SortedLinkedLists target = new Merge2SortedLinkedLists();
        // l1 - {1->2->3-4}
        // l2 - {2, 5}
        ListNode l1 = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
//        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        two.next = three;
//        three.next = four;
//        four.next = five;
        l1.next = two;
        ListNode l2 = new ListNode(2);
        l2.next = five;
//        printLinkedList(l1);
//        System.out.println("Printing l2");
//        printLinkedList(l2);
        printLinkedList(mergeTwoLists(l1, l2));
//        mergeTwoLists(l1, l2);
    }

    public static void printLinkedList(ListNode input) {
        while (input != null) {
            System.out.println(input.val);
            input = input.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
