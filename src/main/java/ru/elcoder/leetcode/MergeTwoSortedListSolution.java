package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.ListNode;

/**
 * Created by xuthus on 05.05.2017.
 */
public class MergeTwoSortedListSolution {
    /*
    Merge two sorted linked lists and return it as a new list.
    The new list should be made by splicing together the nodes of the first two lists.
    https://leetcode.com/problems/merge-two-sorted-lists
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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
