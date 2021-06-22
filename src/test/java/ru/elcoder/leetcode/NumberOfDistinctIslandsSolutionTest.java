package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class NumberOfDistinctIslandsSolutionTest {

    @Test
    public void numDistinctIslands1() {
        final NumberOfDistinctIslandsSolution solution = new NumberOfDistinctIslandsSolution();
        assertEquals(1, solution.numDistinctIslands(new int[][]{
                arrayOf(1, 1, 0, 0, 0),
                arrayOf(1, 1, 0, 0, 0),
                arrayOf(0, 0, 0, 1, 1),
                arrayOf(0, 0, 0, 1, 1)
        }));
    }

    @Test
    public void numDistinctIslands2() {
        final NumberOfDistinctIslandsSolution solution = new NumberOfDistinctIslandsSolution();
        assertEquals(3, solution.numDistinctIslands(new int[][]{
                arrayOf(1, 1, 0, 1, 1),
                arrayOf(1, 0, 0, 0, 0),
                arrayOf(0, 0, 0, 0, 1),
                arrayOf(1, 1, 0, 1, 1)
        }));
    }

    @Test
    public void numDistinctIslands3() {
        final NumberOfDistinctIslandsSolution solution = new NumberOfDistinctIslandsSolution();
        assertEquals(1, solution.numDistinctIslands(new int[][]{
                arrayOf(1, 0, 0, 0, 1),
                arrayOf(0, 0, 0, 0, 0),
                arrayOf(0, 0, 1, 0, 1),
                arrayOf(0, 1, 0, 1, 0)
        }));
    }

    @Test
    public void numDistinctIslands4() {
        final NumberOfDistinctIslandsSolution solution = new NumberOfDistinctIslandsSolution();
        assertEquals(0, solution.numDistinctIslands(new int[][]{
                arrayOf(0, 0, 0, 0, 0),
                arrayOf(0, 0, 0, 0, 0),
                arrayOf(0, 0, 0, 0, 0),
                arrayOf(0, 0, 0, 0, 0)
        }));
    }

    @Test
    public void numDistinctIslands5() {
        final NumberOfDistinctIslandsSolution solution = new NumberOfDistinctIslandsSolution();
        assertEquals(1, solution.numDistinctIslands(new int[][]{
                arrayOf(1, 1, 1),
                arrayOf(1, 1, 1)
        }));
    }

    @Test
    public void numDistinctIslands6() {
        final NumberOfDistinctIslandsSolution solution = new NumberOfDistinctIslandsSolution();
        assertEquals(1, solution.numDistinctIslands(new int[][]{
                arrayOf(1)
        }));
    }

    @Test
    public void numDistinctIslands7() {
        final NumberOfDistinctIslandsSolution solution = new NumberOfDistinctIslandsSolution();
        assertEquals(0, solution.numDistinctIslands(new int[][]{
                arrayOf(0)
        }));
    }
}
