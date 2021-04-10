package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LinkedListCycleIISolutionTest {

    @Test
    public void detectCycle1() {
        final LinkedListCycleIISolution solution = new LinkedListCycleIISolution();
        ListNode head = ListNode.fromArray(3, 2, 0, -4);
        ListNode loopStart = head.makeLoop(1);
        assertEquals(loopStart, solution.detectCycle(head));
    }

    @Test
    public void detectCycle1_Long() {
        final LinkedListCycleIISolution solution = new LinkedListCycleIISolution();
        ListNode head = ListNode.fromArray(3, 2, 0, -4, 7, 8, 3, 4, 1, 2, 7, 8, 0, 7, 6, 5);
        ListNode loopStart = head.makeLoop(5);
        assertEquals(loopStart, solution.detectCycle(head));
    }

    @Test
    public void detectCycleTLE() {
        final LinkedListCycleIISolution solution = new LinkedListCycleIISolution();
        ListNode head = ListNode.fromArray(-21, 10, 17, 8, 4, 26, 5, 35, 33, -7, -16, 27, -12, 6, 29, -12, 5, 9, 20, 14, 14, 2, 13, -24, 21, 23, -21, 5);
        ListNode loopStart = head.makeLoop(24);
        assertEquals(loopStart, solution.detectCycle(head));
    }

    @Test
    public void detectCycle2() {
        final LinkedListCycleIISolution solution = new LinkedListCycleIISolution();
        ListNode head = ListNode.fromArray(0, 1);
        ListNode loopStart = head.makeLoop(0);
        assertEquals(loopStart, solution.detectCycle(head));
    }

    @Test
    public void detectCycle3() {
        final LinkedListCycleIISolution solution = new LinkedListCycleIISolution();
        ListNode head = ListNode.fromArray(0, 1);
        assertNull(solution.detectCycle(head));
    }

    @Test
    public void detectCycle4() {
        final LinkedListCycleIISolution solution = new LinkedListCycleIISolution();
        ListNode head = ListNode.fromArray(0);
        ListNode loopStart = head.makeLoop(0);
        assertEquals(loopStart, solution.detectCycle(head));
    }

    @Test
    public void detectCycle5() {
        final LinkedListCycleIISolution solution = new LinkedListCycleIISolution();
        ListNode head = null;
        assertNull(solution.detectCycle(head));
    }
}
