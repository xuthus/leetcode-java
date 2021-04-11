package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PerfectSquaresSolutionTest {

    @Test
    public void numSquares1() {
        final PerfectSquaresSolution solution = new PerfectSquaresSolution();
        assertEquals(1, solution.numSquares(1));
    }

    @Test
    public void numSquares2() {
        final PerfectSquaresSolution solution = new PerfectSquaresSolution();
        assertEquals(2, solution.numSquares(2));
    }

    @Test
    public void numSquares3() {
        final PerfectSquaresSolution solution = new PerfectSquaresSolution();
        assertEquals(3, solution.numSquares(3));
    }

    @Test
    public void numSquares4() {
        final PerfectSquaresSolution solution = new PerfectSquaresSolution();
        assertEquals(1, solution.numSquares(4));
    }

    @Test
    public void numSquares12() {
        final PerfectSquaresSolution solution = new PerfectSquaresSolution();
        assertEquals(3, solution.numSquares(12));  // 4+4+4
    }

    @Test
    public void numSquares13() {
        final PerfectSquaresSolution solution = new PerfectSquaresSolution();
        assertEquals(2, solution.numSquares(13));
    }

    @Test
    public void numSquares98() {
        final PerfectSquaresSolution solution = new PerfectSquaresSolution();
        assertEquals(2, solution.numSquares(98));
    }

    @Test
    public void numSquares196() {
        final PerfectSquaresSolution solution = new PerfectSquaresSolution();
        assertEquals(1, solution.numSquares(196));
    }

    @Test
    public void numSquares9998() {
        final PerfectSquaresSolution solution = new PerfectSquaresSolution();
        assertEquals(3, solution.numSquares(9998));
    }

    @Test
    public void numSquaresLoadTest() {
        final PerfectSquaresSolution solution = new PerfectSquaresSolution();
        int max = 0;
        for (int i = 0; i < 1000; i++) {
            max = Math.max(max, solution.numSquares(i));
        }
        assertEquals(4, max);
    }
}
