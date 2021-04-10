package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.ListNode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LinkedListCycleSolutionTest {

    @Test
    public void hasCycle1() {
        final LinkedListCycleSolution solution = new LinkedListCycleSolution();
        final ListNode head = ListNode.fromArray(3, 2, 0, -4);
        head.last().next = head.next;
        assertTrue(solution.hasCycle(head));
    }

    @Test
    public void hasCycle2() {
        final LinkedListCycleSolution solution = new LinkedListCycleSolution();
        final ListNode head = ListNode.fromArray(0, 1);
        head.next.next = head;
        assertTrue(solution.hasCycle(head));
    }

    @Test
    public void hasCycle3() {
        final LinkedListCycleSolution solution = new LinkedListCycleSolution();
        final ListNode head = ListNode.fromArray(1);
        assertFalse(solution.hasCycle(head));
    }

    @Test
    public void hasCycle4() {
        final LinkedListCycleSolution solution = new LinkedListCycleSolution();
        final ListNode head = ListNode.fromArray(0, 1);
        assertFalse(solution.hasCycle(head));
    }

    @Test
    public void hasCycle5() {
        final LinkedListCycleSolution solution = new LinkedListCycleSolution();
        final ListNode head = ListNode.fromArray(0, 1, 2, 3, 4);
        assertFalse(solution.hasCycle(head));
    }
}
