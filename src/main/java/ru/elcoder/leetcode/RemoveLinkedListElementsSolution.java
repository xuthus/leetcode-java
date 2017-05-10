package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.ListNode;

/**
 * Created by xuthus on 05.05.2017.
 */
public class RemoveLinkedListElementsSolution {
    /*
    Remove all elements from a linked list of integers that have value val.

    Example
    Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
    Return: 1 --> 2 --> 3 --> 4 --> 5
    https://leetcode.com/problems/remove-linked-list-elements
     */
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;
        ListNode result = null;
        while (head != null && head.val == val)
            head = head.next;
        result = head;
        if (result == null)
            return null;

        ListNode next = head.next;
        while (next != null) {
            while (next != null && next.val == val)
                next = next.next;
            head.next = next;
            head = next;
            if (next != null)
                next = next.next;
        }
        if (head != null)
            head.next = null;
        return result;
    }
}
