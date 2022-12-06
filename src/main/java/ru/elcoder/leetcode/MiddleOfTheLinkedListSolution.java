package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.ListNode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 876,
        title = "Middle of the Linked List",
        url = "https://leetcode.com/problems/middle-of-the-linked-list/description/"
)
public class MiddleOfTheLinkedListSolution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode mid = head;
        while (fast != null) {
            fast = fast.next;
            if (fast == null) {
                break;
            }
            fast = fast.next;
            mid = mid.next;
        }
        return mid;
    }
}
