package ru.elcoder.codesignal;

import ru.elcoder.leetcode.models.ListNode;

public class AddTwoHugeNumbersSolution {
    ListNode addTwoHugeNumbers(ListNode a, ListNode b) {
        a = reverse(a);
        b = reverse(b);
        int overflow = 0;
        ListNode r = null;
        while (a != null || b != null) {
            int sum = overflow;
            if (a != null) {
                sum += a.val;
                a = a.next;
            }
            if (b != null) {
                sum += b.val;
                b = b.next;
            }
            overflow = sum / 10;
            sum = sum % 10;
            ListNode node = new ListNode(sum);
            node.next = r;
            r = node;
        }
        if (overflow > 0) {
            ListNode node = new ListNode(overflow);
            node.next = r;
            r = node;
        }
        return r;
    }

    private ListNode reverse(ListNode n) {
        ListNode r = null;
        while (n != null) {
            ListNode node = new ListNode(n.val);
            node.next = r;
            r = node;
            n = n.next;
        }
        return r;
    }
}
