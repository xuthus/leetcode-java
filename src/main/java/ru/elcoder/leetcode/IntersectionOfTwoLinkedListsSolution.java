package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.ListNode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 160,
        title = "Intersection of Two Linked Lists",
        url = "https://leetcode.com/problems/intersection-of-two-linked-lists/"
)
public class IntersectionOfTwoLinkedListsSolution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int lenA = 1;
        ListNode node1 = headA;
        while (node1.next != null) {
            node1 = node1.next;
            lenA++;
        }
        int lenB = 1;
        ListNode node2 = headB;
        while (node2.next != null) {
            node2 = node2.next;
            lenB++;
        }
        if (node2 != node1) {
            return null; // no intersection
        }
        // make headA contain pointer to longer list
        if (lenA < lenB) {
            node1 = headA;
            headA = headB;
            headB = node1;
        }
        node1 = headA;
        if (lenA != lenB) {
            for (int i = 0; i < Math.abs(lenA - lenB); i++) {
                node1 = node1.next;
            }
        }
        node2 = headB;
        while (node2 != node1) {
            node1 = node1.next;
            node2 = node2.next;
        }
        return node1;
    }
}
