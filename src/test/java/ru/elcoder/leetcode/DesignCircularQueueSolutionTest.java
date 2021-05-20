package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static ru.elcoder.leetcode.DesignCircularQueueSolution.MyCircularQueue;

public class DesignCircularQueueSolutionTest {

    @Test
    public void test1() {
        final MyCircularQueue queue = new MyCircularQueue(3);
        assertFalse(queue.deQueue());
        assertEquals(-1, queue.Front());
        assertEquals(-1, queue.Rear());
        assertTrue(queue.isEmpty());
        assertFalse(queue.isFull());
        assertTrue(queue.enQueue(1));
        assertEquals(1, queue.Front());
        assertEquals(1, queue.Rear());
        assertFalse(queue.isEmpty());
        assertFalse(queue.isFull());
        assertTrue(queue.enQueue(2));
        assertTrue(queue.enQueue(3));
        assertFalse(queue.enQueue(4));
        assertTrue(queue.isFull());
        assertFalse(queue.isEmpty());
        assertEquals(1, queue.Front());
        assertEquals(3, queue.Rear());
        assertTrue(queue.deQueue());
        assertEquals(2, queue.Front());
        assertEquals(3, queue.Rear());
        assertFalse(queue.isFull());
        assertFalse(queue.isEmpty());

        assertTrue(queue.enQueue(4));
        assertEquals(2, queue.Front());
        assertEquals(4, queue.Rear());
        assertTrue(queue.isFull());
        assertFalse(queue.isEmpty());
        assertTrue(queue.deQueue());
        assertTrue(queue.deQueue());
        assertTrue(queue.deQueue());
        assertFalse(queue.deQueue());
        assertFalse(queue.isFull());
        assertTrue(queue.isEmpty());
    }

}
