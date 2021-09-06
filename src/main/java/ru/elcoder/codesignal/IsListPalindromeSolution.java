package ru.elcoder.codesignal;

import ru.elcoder.leetcode.models.ListNode;

public class IsListPalindromeSolution {
    boolean isListPalindrome(ListNode l) {
        ListNode r = reverse(l);
        while (r != null) {
            if (r.val != l.val) {
                return false;
            }
            r = r.next;
            l = l.next;
        }
        return true;
    }

    private ListNode reverse(ListNode l) {
        ListNode r = null;
        while (l != null) {
            final ListNode node = new ListNode(l.val);
            node.next = r;
            r = node;
            l = l.next;
        }
        return r;
    }
}
