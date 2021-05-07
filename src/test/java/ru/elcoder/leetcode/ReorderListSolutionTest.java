package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.ListNode;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class ReorderListSolutionTest {

    @Test
    public void reorderList() {
        final ReorderListSolution solution = new ReorderListSolution();
        ListNode head = ListNode.fromArray(1, 2);
        solution.reorderList(head);
        assertArrayEquals(arrayOf(1, 2), head.toArray());

        head = ListNode.fromArray(1);
        solution.reorderList(head);
        assertArrayEquals(arrayOf(1), head.toArray());

        head = ListNode.fromArray(1, 2, 3, 4, 5);
        solution.reorderList(head);
        assertArrayEquals(arrayOf(1, 5, 2, 4, 3), head.toArray());
    }
}