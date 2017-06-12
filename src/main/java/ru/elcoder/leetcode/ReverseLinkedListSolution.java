package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.ListNode;

/**
 * Created by xuthus on 01.05.2017.
 */
public class ReverseLinkedListSolution {
    /*
    Reverse a singly linked list.
    Hint:
    A linked list can be reversed either iteratively or recursively. Could you implement both?
    https://leetcode.com/problems/reverse-linked-list/
    */

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode t = null;
        ListNode tail = head;
        ListNode prev = head;
        while (tail.next != null) {
            t = tail.next;
            tail.next = prev;
            prev = tail;
            tail = t;
        }
        tail.next = prev;
        head.next = null;
        return tail;
    }

}
