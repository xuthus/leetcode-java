package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.ListNode;

/**
 * Created by xuthus on 01.05.2017.
 */
public class PalindromLinkedListSolutionV2 {
    /*
    Given a singly linked list, determine if it is a palindrome.
    Follow up:
    Could you do it in O(n) time and O(1) space?
    https://leetcode.com/problems/palindrome-linked-list/
    */
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        ListNode node = head;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        int middle = length / 2;
        node = head;
        while (middle-- > 0) {
            node = node.next;
        }
        if (length % 2 == 1)
            node = node.next;

        ListNode tail = reverseList(node);

        ListNode revNode = tail;
        node = head;
        while (revNode != null) {
            if (revNode.val != node.val)
                return false;
            node = node.next;
            revNode = revNode.next;
        }
        return true;
    }

    private ListNode reverseList(ListNode head) {
        ListNode t = null;
        ListNode tail = head;
        ListNode prev = head;
        while (tail.next != null) {
            t = tail.next;
            tail.next = prev;
            prev = tail;
            tail = t;
        }
        tail.next = prev;
        head.next = null;
        return tail;
    }
}
