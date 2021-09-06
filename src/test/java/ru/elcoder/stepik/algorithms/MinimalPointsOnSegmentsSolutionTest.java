package ru.elcoder.stepik.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimalPointsOnSegmentsSolutionTest {

    @Test
    public void minimalPoints1() {
        final MinimalPointsOnSegmentsSolution solution = new MinimalPointsOnSegmentsSolution();
        final int[] points = solution.minimalPoints(new int[][]{
                new int[]{1, 3},
                new int[]{2, 5},
                new int[]{3, 6}
        });
        assertEquals(1, points.length);
        assertEquals(3, points[0]);
    }

    @Test
    public void minimalPoints2() {
        final MinimalPointsOnSegmentsSolution solution = new MinimalPointsOnSegmentsSolution();
        final int[] points = solution.minimalPoints(new int[][]{
                new int[]{1, 3},
                new int[]{2, 5},
                new int[]{3, 6},
                new int[]{4, 7}
        });
        assertEquals(2, points.length);
        assertEquals(3, points[0]);
        assertEquals(7, points[1]);
    }
}
