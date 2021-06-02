package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class MaxAreaOfIslandSolutionTest {

    @Test
    public void maxAreaOfIsland1() {
        final MaxAreaOfIslandSolution solution = new MaxAreaOfIslandSolution();
        assertEquals(
                4,
                solution.maxAreaOfIsland(new int[][]{
                        arrayOf(1, 1, 0, 0, 0),
                        arrayOf(1, 1, 0, 0, 0),
                        arrayOf(0, 0, 0, 1, 1),
                        arrayOf(0, 0, 0, 1, 1)
                })
        );
    }

    @Test
    public void maxAreaOfIsland2() {
        final MaxAreaOfIslandSolution solution = new MaxAreaOfIslandSolution();
        assertEquals(
                6,
                solution.maxAreaOfIsland(new int[][]{
                        arrayOf(0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
                        arrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
                        arrayOf(0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0),
                        arrayOf(0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0),
                        arrayOf(0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0),
                        arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0),
                        arrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
                        arrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0)
                })
        );
    }

    @Test
    public void maxAreaOfIsland3() {
        final MaxAreaOfIslandSolution solution = new MaxAreaOfIslandSolution();
        assertEquals(
                0,
                solution.maxAreaOfIsland(new int[][]{
                        arrayOf(0, 0, 0, 0, 0, 0, 0)
                })
        );
    }
}
