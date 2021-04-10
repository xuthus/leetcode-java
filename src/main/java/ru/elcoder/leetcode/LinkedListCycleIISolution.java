package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.ListNode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 142,
        title = "Linked List Cycle II",
        url = "https://leetcode.com/problems/linked-list-cycle-ii/"
)
public class LinkedListCycleIISolution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p2 == null) {
                return null;
            }
            if (p1 == p2 || p2.next == p1) {
                if (p2.next == p1) {
                    p2 = p2.next;
                }
                p1 = head;
                while (p1 != p2 && p2.next != p1) {
                    p2 = p2.next;
                    p1 = p1.next;
                }
                return p1;
            }
        }
        return null;
    }
}
