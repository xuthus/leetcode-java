package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleAreaSolutionTest {
    @Test
    public void computeArea() throws Exception {
        RectangleAreaSolution solution = new RectangleAreaSolution();

        assertEquals(7, solution.computeArea(0, 0, 2, 2, 1, 1, 3, 3));
        assertEquals(5, solution.computeArea(0, 0, 2, 2, 2, 2, 3, 3));
        assertEquals(2, solution.computeArea(-1500000001, 0, -1500000000, 1, 1500000000, 0, 1500000001, 1));
    }

    @Test
    public void intersectArea() throws Exception {
        RectangleAreaSolution solution = new RectangleAreaSolution();

        assertEquals(1, solution.intersectArea(0, 0, 2, 2, 1, 1, 3, 3));
        assertEquals(1, solution.intersectArea(0, 0, 2, 2, 1, 1, 2, 2));
        assertEquals(1, solution.intersectArea(1, 1, 2, 2, 0, 0, 2, 2));
        assertEquals(0, solution.intersectArea(0, 0, 2, 2, 2, 2, 3, 3));
        assertEquals(0, solution.intersectArea(2, 2, 3, 3, 0, 0, 2, 2));
        assertEquals(0, solution.intersectArea(0, 0, 2, 2, 3, 3, 4, 4));
    }

    @Test
    public void intersect() throws Exception {
        RectangleAreaSolution solution = new RectangleAreaSolution();

        assertEquals(1, solution.intersect(1, 4, 3, 6));
        assertEquals(1, solution.intersect(3, 6, 1, 4));
        assertEquals(2, solution.intersect(1, 6, 2, 4));
        assertEquals(2, solution.intersect(2, 4, 1, 6));
        assertEquals(-1, solution.intersect(2, 4, 5, 6));
        assertEquals(-1, solution.intersect(5, 6, 2, 4));
    }

}