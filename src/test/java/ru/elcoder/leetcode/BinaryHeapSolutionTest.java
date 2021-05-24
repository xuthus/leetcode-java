package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.BinaryHeapSolution.*;

public class BinaryHeapSolutionTest {
    @Test
    public void test1() {
        final BinaryHeap heap = new BinaryHeap(10);
        assertTrue(heap.isEmpty());
        heap.offer(10);
        assertFalse(heap.isEmpty());
        assertEquals(10, heap.peek());
        heap.offer(5);
        assertEquals(10, heap.peek());
        heap.offer(15);
        assertEquals(15, heap.peek());
        heap.offer(25);
        assertEquals(25, heap.peek());
        heap.offer(47);
        assertEquals(47, heap.peek());
        heap.offer(4);
        assertEquals(47, heap.peek());

        assertEquals(47, heap.poll());
        assertEquals(25, heap.peek());
        assertEquals(25, heap.poll());
        assertEquals(15, heap.peek());
        assertEquals(15, heap.poll());
        assertEquals(10, heap.peek());
        assertEquals(10, heap.poll());
        assertEquals(5, heap.peek());
        assertEquals(5, heap.poll());
        assertEquals(4, heap.peek());
        assertEquals(4, heap.poll());
        assertTrue(heap.isEmpty());
    }

    @Test
    public void test2() {
        final BinaryHeap heap = new BinaryHeap(4);
        heap.pollAll(new int[] {3, 1, 4, 1, 5, 9, 2, 6});
        assertEquals(9, heap.poll());
        assertEquals(6, heap.poll());
        assertEquals(5, heap.poll());
        assertEquals(4, heap.poll());
        assertEquals(3, heap.poll());
        assertEquals(2, heap.poll());
        assertEquals(1, heap.poll());
        assertEquals(1, heap.poll());
        assertTrue(heap.isEmpty());
    }

    @Test
    public void test3() {
        final BinaryHeap heap = new BinaryHeap(4, BinaryHeap.MIN);
        heap.pollAll(new int[] {3, 1, 4, 1, 5, 9, 2, 6});
        assertEquals(1, heap.poll());
        assertEquals(1, heap.poll());
        assertEquals(2, heap.poll());
        assertEquals(3, heap.poll());
        assertEquals(4, heap.poll());
        assertEquals(5, heap.poll());
        assertEquals(6, heap.poll());
        assertEquals(9, heap.poll());
        assertTrue(heap.isEmpty());
    }
}
