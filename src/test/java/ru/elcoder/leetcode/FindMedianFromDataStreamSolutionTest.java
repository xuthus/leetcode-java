package ru.elcoder.leetcode;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static ru.elcoder.leetcode.FindMedianFromDataStreamSolution.*;

public class FindMedianFromDataStreamSolutionTest {

    @Test
    public void testMedian1() {
        final MedianFinder finder = new MedianFinder();
        finder.addNum(1);
        finder.addNum(2);
        assertEquals(1.5, finder.findMedian());
    }

    @Test
    public void testMedian2() {
        final MedianFinder finder = new MedianFinder();
        finder.addNum(1);
        finder.addNum(2);
        finder.addNum(3);
        assertEquals(2.0, finder.findMedian());
    }

    @Test
    public void testMedian3() {
        final MedianFinder finder = new MedianFinder();
        finder.addNum(1);
        finder.addNum(2);
        finder.addNum(3);
        finder.addNum(4);
        assertEquals(2.5, finder.findMedian());
    }
}
