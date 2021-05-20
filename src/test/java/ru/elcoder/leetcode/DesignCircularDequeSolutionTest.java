package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.DesignCircularDequeSolution.*;

public class DesignCircularDequeSolutionTest {

    @Test
    public void test1() {
        final MyCircularDeque deque = new MyCircularDeque(3);
        assertTrue(deque.isEmpty());
        assertFalse(deque.isFull());

        assertEquals(-1, deque.getFront());
        assertEquals(-1, deque.getRear());
        assertFalse(deque.deleteFront());
        assertFalse(deque.deleteLast());

        assertTrue(deque.insertFront(1));
        assertFalse(deque.isEmpty());
        assertFalse(deque.isFull());
        assertEquals(1, deque.getFront());
        assertEquals(1, deque.getRear());

        assertTrue(deque.insertFront(2));
        assertFalse(deque.isEmpty());
        assertFalse(deque.isFull());
        assertEquals(2, deque.getFront());
        assertEquals(1, deque.getRear());

        assertTrue(deque.insertLast(3));
        assertFalse(deque.isEmpty());
        assertTrue(deque.isFull());
        assertEquals(2, deque.getFront());
        assertEquals(3, deque.getRear());

        assertFalse(deque.insertLast(4));
        assertFalse(deque.insertFront(5));
        assertFalse(deque.isEmpty());
        assertTrue(deque.isFull());
        assertEquals(2, deque.getFront());
        assertEquals(3, deque.getRear());

        assertTrue(deque.deleteFront());
        assertTrue(deque.deleteLast());
        assertFalse(deque.isEmpty());
        assertFalse(deque.isFull());
        assertEquals(1, deque.getFront());
        assertEquals(1, deque.getRear());

        assertTrue(deque.deleteLast());
        assertTrue(deque.isEmpty());
        assertFalse(deque.isFull());
    }
}
