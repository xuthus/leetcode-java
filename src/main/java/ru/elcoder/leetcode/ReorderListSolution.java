package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.ListNode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 143,
        title = "Reorder List",
        url = "https://leetcode.com/problems/reorder-list/"
)
public class ReorderListSolution {
    public void reorderList(ListNode head) {
        ListNode second = cutSecondList(head);
        second = reverseList(second);
        mergeLists(head, second);
    }

    private ListNode cutSecondList(ListNode head) {
        if (head == null)
            return null;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next;
            head = head.next;
            fast = fast.next;
        }
        if (head == null)
            return null;
        ListNode result = head.next;
        head.next = null;
        return result;
    }

    private void mergeLists(ListNode a, ListNode b) {
        while (a != null) {
            if (b == null)
                break;
            ListNode tmp = b.next;
            b.next = a.next;
            a.next = b;
            a = a.next.next;
            b = tmp;
        }
    }

    private ListNode reverseList(ListNode list) {
        ListNode head = null;
        while (list != null) {
            ListNode prev = head;
            head = list;
            list = list.next;
            head.next = prev;
        }
        return head;
    }
}
