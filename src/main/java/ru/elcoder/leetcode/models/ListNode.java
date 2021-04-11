package ru.elcoder.leetcode.models;

/**
 * Created by xuthus on 01.05.2017.
 */

/**
 * singly linked list of integers
 */
public class ListNode {
    public int val;

    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode fromArray(int... items) {
        ListNode head = null;
        ListNode parent = null;
        for (int item : items) {
            ListNode node = new ListNode(item);
            if (parent == null)
                parent = head = node;
            else {
                parent.next = node;
                parent = node;
            }
        }
        return head;
    }

    public int[] toArray() {
        int length = 0;
        ListNode node = this;
        while (node != null) {
            length++;
            node = node.next;
        }
        int[] ints = new int[length];
        length = 0;
        node = this;
        while (node != null) {
            ints[length++] = node.val;
            node = node.next;
        }
        return ints;
    }

    @Override
    public String toString() {
        return new StringBuilder("{val = ").append(val).append(", next = ").append(next == null ? "null" : next.val).append("}").toString();
    }

    public ListNode last() {
        if (next == null) {
            return this;
        }
        return next.last();
    }

    public ListNode makeLoop(int pos) {
        final ListNode loopStart = nodeAt(pos);
        this.last().next = loopStart;
        return loopStart;
    }

    private ListNode nodeAt(int pos) {
        ListNode p = this;
        while (pos > 0) {
            p = p.next;
            pos--;
        }
        return p;
    }

    public void append(ListNode tail) {
        this.last().next = tail;
    }
}
