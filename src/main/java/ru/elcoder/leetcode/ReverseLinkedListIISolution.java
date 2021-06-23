package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.ListNode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 92,
        title = "Reverse Linked List II",
        url = "https://leetcode.com/problems/reverse-linked-list-ii/"
)
public class ReverseLinkedListIISolution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // left and right are 0-based here, but 1-based in problem
        if (left == right) {
            return head;
        }
        ListNode node = head;
        ListNode prev = null;
        for (int i = 0; i < left; i++) {
            prev = node;
            node = node.next;
        }
        if (prev != null)
            prev.next = null;
        else
            head = null;
        ListNode tail = node;
        for (int i = left; i <= right; i++) {
            prev = tail;
            tail = tail.next;
        }
        prev.next = null;
        return join(join(head, reverse(node)), tail);
    }

    ListNode join(ListNode n1, ListNode n2) {
        if (n1 == null)
            return n2;
        if (n2 == null)
            return n1;
        ListNode node = n1;
        while (node.next != null)
            node = node.next;
        node.next = n2;
        return n1;
    }

    ListNode reverse(ListNode node) {
        ListNode prev = null;
        while (node != null) {
            ListNode tmp = node.next;
            node.next = prev;
            prev = node;
            node = tmp;
        }
        return prev;
    }
}
