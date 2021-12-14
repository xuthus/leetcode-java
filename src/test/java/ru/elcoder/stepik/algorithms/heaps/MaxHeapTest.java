package ru.elcoder.stepik.algorithms.heaps;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class MaxHeapTest {

    @Test
    public void scenario1() {
        final MaxHeap heap = new MaxHeap();
        heap.insert(100);
        assertEquals(100, heap.extractMax());
        assertEquals(0, heap.size());
    }

    @Test
    public void scenario2() {
        final MaxHeap heap = new MaxHeap();
        heap.insert(100);
        heap.insert(200);
        assertEquals(200, heap.extractMax());
        assertEquals(1, heap.size());
    }

    @Test
    public void scenario3() {
        final MaxHeap heap = new MaxHeap();
        heap.insert(100);
        heap.insert(300);
        heap.insert(200);
        assertEquals(300, heap.extractMax());
        assertEquals(2, heap.size());
    }

    @Test
    public void scenario4() {
        final MaxHeap heap = new MaxHeap();
        heap.insert(100);
        heap.insert(300);
        heap.insert(200);
        heap.insert(400);
        assertEquals(400, heap.extractMax());
        assertEquals(300, heap.extractMax());
        assertEquals(200, heap.extractMax());
        assertEquals(1, heap.size());
    }

    @Test
    public void scenario5() {
        final MaxHeap heap = new MaxHeap();
        heap.insert(100);
        heap.insert(300);
        heap.insert(200);
        heap.insert(400);
        assertEquals(400, heap.extractMax());
        heap.insert(250);
        assertEquals(300, heap.extractMax());
        assertEquals(250, heap.extractMax());
        assertEquals(200, heap.extractMax());
        assertEquals(100, heap.extractMax());
        assertEquals(0, heap.size());
    }

    @Test
    public void scenario6() {
        final MaxHeap heap = new MaxHeap();
        heap.insert(200);
        heap.insert(10);
        assertEquals(200, heap.extractMax());
        heap.insert(5);
        heap.insert(500);
        assertEquals(500, heap.extractMax());
        assertEquals(2, heap.size());
    }

    @Test
    public void scenario7() {
        final MaxHeap heap = new MaxHeap();
        heap.insert(200);
        heap.insert(10);
        heap.insert(5);
        heap.insert(500);
        assertEquals(500, heap.extractMax());
        assertEquals(200, heap.extractMax());
        assertEquals(10, heap.extractMax());
        assertEquals(5, heap.extractMax());
        assertEquals(0, heap.size());
    }

    @Test
    public void scenario8() {
        final MaxHeap heap = new MaxHeap();
        for (int i = 1; i <= 100000; i++) {
            heap.insert(i);
        }
        for (int i = 100000; i >= 1; i--) {
            assertEquals(i, heap.extractMax());
        }
    }

    @Test
    public void inputScenario() {
        final MaxHeap heap = new MaxHeap();
        final Optional<Integer> result = heap.executeCommand("Insert 200");
        assertFalse(result.isPresent());
        heap.executeCommand("Insert 10");
        heap.executeCommand("insert 5");
        heap.executeCommand("insert 500");
        assertEquals(new Integer(500), heap.executeCommand("ExtractMax").get());
        assertEquals(new Integer(200), heap.executeCommand("ExtractMax").get());
        assertEquals(new Integer(10), heap.executeCommand("extractMax").get());
        assertEquals(new Integer(5), heap.executeCommand("extractMax").get());
        assertEquals(0, heap.size());
    }
}
