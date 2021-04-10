package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.ListNode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 141,
        title = "Linked List Cycle",
        url = "https://leetcode.com/problems/linked-list-cycle/"
)
public class LinkedListCycleSolution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) {
                return true;
            }
            if (p2 == null) {
                return false;
            }
            if (p2.next == p1) {
                return true;
            }
        }
        return false;
    }
}
