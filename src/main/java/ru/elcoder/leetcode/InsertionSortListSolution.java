package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.ListNode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 147,
        title = "Insertion Sort List",
        url = "https://leetcode.com/problems/insertion-sort-list/"
)
public class InsertionSortListSolution {
    /*
    It seems like any optimizations will not be insertion sort by definition. So only O(M^2) possible.
     */
    public ListNode insertionSortList(ListNode head) {
        ListNode sorted = null;
        while (head != null) {
            sorted = insertNode(sorted, head.val);
            head = head.next;
        }
        return sorted;
    }

    private ListNode insertNode(ListNode sorted, int val) {
        if (sorted == null) {
            return new ListNode(val);
        }
        if (sorted.val > val) {
            return new ListNode(val, sorted);
        }
        ListNode p = sorted;
        while (p.next != null) {
            if (p.next.val > val) {
                break;
            }
            p = p.next;
        }
        p.next = new ListNode(val, p.next);
        return sorted;
    }
}
