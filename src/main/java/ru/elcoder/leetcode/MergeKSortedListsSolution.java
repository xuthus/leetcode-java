package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.ListNode;

/**
 * Created by xuthus on 14.05.2017.
 */
public class MergeKSortedListsSolution {
    /*
    Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
    https://leetcode.com/problems/merge-k-sorted-lists/
     */

    /*
      Divide and rule.
      Complexity O(logM*N) - M - lists count, N - list size
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null)
            return null;
        if (lists.length < 2)
            return lists.length == 0 ? null : lists[0];
        int middle = lists.length / 2 - 1;
        return mergeTwoLists(mergeSubLists(lists, 0, middle), mergeSubLists(lists, middle + 1, lists.length - 1));
    }

    private ListNode mergeSubLists(ListNode[] lists, int from, int to) {
        if (to == from)
            return lists[from];
        if ((to - from) == 1)
            return mergeTwoLists(lists[from], lists[to]);
        int middle = from + (to - from) / 2;
        return mergeTwoLists(mergeSubLists(lists, from, middle), mergeSubLists(lists, middle + 1, to));
    }

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
