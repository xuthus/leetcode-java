package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class KClosestPointsToOriginSolutionTest {

    @Test
    public void kClosest() {
        final KClosestPointsToOriginSolution solution = new KClosestPointsToOriginSolution();
        int[][] points = solution.kClosest(new int[][]{
                        arrayOf(1, 3),
                        arrayOf(-2, -2)
                },
                1);
        assertEquals(1, points.length);
        assertArrayEquals(arrayOf(-2, -2), points[0]);

        points = solution.kClosest(new int[][]{
                        arrayOf(3, 3),
                        arrayOf(5, -1),
                        arrayOf(-2, 4)
                },
                2);
        assertEquals(2, points.length);
        assertArrayEquals(arrayOf(-2, 4), points[0]);
        assertArrayEquals(arrayOf(3, 3), points[1]);
    }
}
