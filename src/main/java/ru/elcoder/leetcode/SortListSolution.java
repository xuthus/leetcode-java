package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.ListNode;

/**
 * Created by xuthus on 19.05.2017.
 */
public class SortListSolution {
    /*
    Sort a singly linked list in O(n log n) time using constant space complexity.

    https://leetcode.com/problems/sort-list/
     */

    // divide and conquer
    public ListNode sortList(ListNode head) {
        ListNode right = splitList(head);
        if (right == null)
            return head;
        right = sortList(right);
        head = sortList(head);
        return mergeTwoLists(head, right);
    }

    private ListNode splitList(ListNode head) {
        if (head == null || head.next == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = slow.next;
        slow.next = null;
        return fast;
    }

    // from Merge Two Sorted Lists solution
    @SuppressWarnings("Duplicates")
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null)
            return l1 == null ? l2 : l1;
        ListNode head = null;
        ListNode tail = null;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                if (tail != null)
                    tail.next = l1;
                else
                    head = l1;
                tail = l1;
                l1 = l1.next;
            } else {
                if (tail != null)
                    tail.next = l2;
                else
                    head = l2;
                tail = l2;
                l2 = l2.next;
            }
        }
        tail.next = l1 == null ? l2 : l1;
        return head;
    }
}
