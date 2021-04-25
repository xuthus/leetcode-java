package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.ListNode;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class RemoveNthNodeFromEndOfListSolutionTest {

    @Test
    public void removeNthFromEnd() {
        final RemoveNthNodeFromEndOfListSolution solution = new RemoveNthNodeFromEndOfListSolution();
        final ListNode listNode = solution.removeNthFromEnd(new ListNode(1), 1);
        assertNull(listNode);
    }

    @Test
    public void removeNthFromEnd2() {
        final RemoveNthNodeFromEndOfListSolution solution = new RemoveNthNodeFromEndOfListSolution();
        final ListNode listNode = solution.removeNthFromEnd(ListNode.fromArray(1, 2, 3), 1);
        assertArrayEquals(arrayOf(1, 2), listNode.toArray());
    }

    @Test
    public void removeNthFromEnd3() {
        final RemoveNthNodeFromEndOfListSolution solution = new RemoveNthNodeFromEndOfListSolution();
        final ListNode listNode = solution.removeNthFromEnd(ListNode.fromArray(1, 2, 3), 2);
        assertArrayEquals(arrayOf(1, 3), listNode.toArray());
    }

    @Test
    public void removeNthFromEnd4() {
        final RemoveNthNodeFromEndOfListSolution solution = new RemoveNthNodeFromEndOfListSolution();
        final ListNode listNode = solution.removeNthFromEnd(ListNode.fromArray(1, 2, 3), 3);
        assertArrayEquals(arrayOf(2, 3), listNode.toArray());
    }
}