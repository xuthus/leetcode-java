package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.ListNode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 83,
        title = "Remove Duplicates from Sorted List",
        url = "https://leetcode.com/problems/remove-duplicates-from-sorted-list/"
)
public class RemoveDuplicatesFromSortedListSolution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        while (p != null && p.next != null) {
            if (p.next.val == p.val) {
                p.next = p.next.next;
                continue;
            }
            p = p.next;
        }
        return head;
    }
}
