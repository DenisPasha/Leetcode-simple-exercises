package org.example.leetCode75Exercises.reverseLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
//    Given the head of a singly linked list, reverse the list, and return the reversed list.
    public static void main(String[] args) {

        ListNode node = new ListNode(1,new ListNode(2 ,new ListNode(3 ,new ListNode(4,new ListNode(5)))));
        ListNode reversed = reverseList(node);

    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
