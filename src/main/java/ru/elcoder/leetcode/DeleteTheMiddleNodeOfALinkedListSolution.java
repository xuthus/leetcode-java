package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.ListNode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 2095,
        title = "Delete the Middle Node of a Linked List",
        url = "https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/"
)
public class DeleteTheMiddleNodeOfALinkedListSolution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode mid = middleNode(head);
        if (mid == null) {
            return null;
        }
        if (mid.next != null) {
            mid.next = mid.next.next;
        }
        return head;
    }

    private ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode mid = head;
        ListNode prev = null;
        while (fast != null) {
            fast = fast.next;
            if (fast == null) {
                break;
            }
            fast = fast.next;
            prev = mid;
            mid = mid.next;
        }
        return prev;
    }
}
