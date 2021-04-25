package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.ListNode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 19,
        title = "Remove Nth Node From End of List",
        url = "https://leetcode.com/problems/remove-nth-node-from-end-of-list/"
)
public class RemoveNthNodeFromEndOfListSolution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p2 = head;
        ListNode p1 = head;
        for (int i = 0; i < n; i++)
            p2 = p2.next;
        if (p2 == null) {
            return p1.next;
        }
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        if (n == 1)
            p1.next = null;
        else {
            p1.next = p1.next.next;
        }
        return head;
    }
}
