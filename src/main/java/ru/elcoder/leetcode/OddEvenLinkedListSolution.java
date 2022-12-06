package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.ListNode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 328,
        title = "Odd Even Linked List",
        url = "https://leetcode.com/problems/odd-even-linked-list/description/"
)
public class OddEvenLinkedListSolution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode startOdd = null;
        ListNode startEven = null;
        ListNode odd = null;
        ListNode even = null;
        boolean oddity = true;
        while (head != null) {
            if (oddity) {
                if (startOdd == null) {
                    startOdd = new ListNode(head.val);
                    odd = startOdd;
                } else {
                    odd.next = new ListNode(head.val);
                    odd = odd.next;
                }
            } else {
                if (startEven == null) {
                    startEven = new ListNode(head.val);
                    even = startEven;
                } else {
                    even.next = new ListNode(head.val);
                    even = even.next;
                }
            }
            oddity = !oddity;
            head = head.next;
        }
        odd.next = startEven;
        return startOdd;
    }
}
