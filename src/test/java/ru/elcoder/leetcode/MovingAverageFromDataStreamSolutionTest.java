package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.MovingAverageFromDataStreamSolution.*;

public class MovingAverageFromDataStreamSolutionTest {

    @Test
    public void test1() {
        final MovingAverage average = new MovingAverage(3);
        assertEquals(1.0, average.next(1), 0.00001);
        assertEquals(1.5, average.next(2), 0.00001);
        assertEquals(2.0, average.next(3), 0.00001);
        assertEquals(3.0, average.next(4), 0.00001);
        assertEquals(4.0, average.next(5), 0.00001);
    }

}
