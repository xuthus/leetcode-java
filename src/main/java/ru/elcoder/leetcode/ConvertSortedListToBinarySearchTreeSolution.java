package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.ListNode;
import ru.elcoder.leetcode.models.TreeNode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 109,
        title = "Convert Sorted List to Binary Search Tree",
        url = "https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/"
)
public class ConvertSortedListToBinarySearchTreeSolution {
public TreeNode sortedListToBST(ListNode head) {
    return head == null ? null : newTreeNode(head, null);
}

private TreeNode newTreeNode(ListNode head, ListNode toExcl) {
    ListNode mid = findMiddle(head, toExcl);
    return new TreeNode(mid.val,
            mid == head ? null : newTreeNode(head, mid),
            mid.next == toExcl ? null : newTreeNode(mid.next, toExcl)
    );
}

private ListNode findMiddle(ListNode head, ListNode toExcl) {
    ListNode p = head;
    while (p != toExcl && p != null && p.next != toExcl) {
        head = head.next;
        p = p.next;
        if (p != null) {
            p = p.next;
        }
    }
    return head;
}
}
