package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class NonOverlappingIntervalsSolutionTest {

    @Test
    public void eraseOverlapIntervals() {
        final NonOverlappingIntervalsSolution solution = new NonOverlappingIntervalsSolution();
        assertEquals(1, solution.eraseOverlapIntervals(new int[][]{
                arrayOf(1, 2),
                arrayOf(2, 3),
                arrayOf(3, 4),
                arrayOf(1, 3)
        }));
        assertEquals(2, solution.eraseOverlapIntervals(new int[][]{
                arrayOf(1, 2),
                arrayOf(1, 2),
                arrayOf(1, 2)
        }));
        assertEquals(0, solution.eraseOverlapIntervals(new int[][]{
                arrayOf(1, 2),
                arrayOf(2, 3)
        }));
        // [[1,100],[11,22],[1,11],[2,12]]
        assertEquals(2, solution.eraseOverlapIntervals(new int[][]{
                arrayOf(1, 100),
                arrayOf(11, 22),
                arrayOf(1, 11),
                arrayOf(2, 12)
        }));
    }
}
