package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.ListNode;

/**
 * Created by xuthus on 01.05.2017.
 */
public class PalindromLinkedListSolution {
    /*
    Given a singly linked list, determine if it is a palindrome.
    Follow up:
    Could you do it in O(n) time and O(1) space?
    https://leetcode.com/problems/palindrome-linked-list/
    */
    public boolean isPalindrome(ListNode head) {
        if (head == null)
            return true;
        // copy to array
        ListNode node = head;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        int[] items = new int[length];
        node = head;
        length = 0;
        while (node != null) {
            items[length++] = node.val;
            node = node.next;
        }
        // check if array is palindrome
        for (int i = 0; i < length / 2; i++)
            if (items[i] != items[length - i - 1])
                return false;
        return true;
    }
}
