package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class GraphValidTreeSolutionTest {

    @Test
    public void validTree() {
        final GraphValidTreeSolution solution = new GraphValidTreeSolution();
        assertTrue(solution.validTree(5, new int[][]{
                arrayOf(0, 1),
                arrayOf(0, 2),
                arrayOf(0, 3),
                arrayOf(1, 4)
        }));
        assertFalse(solution.validTree(5, new int[][]{
                arrayOf(0, 1),
                arrayOf(1, 2),
                arrayOf(2, 3),
                arrayOf(1, 3),
                arrayOf(1, 4)
        }));
        assertFalse(solution.validTree(4, new int[][]{
                arrayOf(2, 3),
                arrayOf(0, 1),
                arrayOf(1, 2),
                arrayOf(0, 3)
        }));
        assertTrue(solution.validTree(4, new int[][]{
                arrayOf(0, 1),
                arrayOf(1, 2),
                arrayOf(2, 3)
        }));
        assertTrue(solution.validTree(1, new int[][]{
        }));
        assertFalse(solution.validTree(2, new int[][]{
        }));
        assertFalse(solution.validTree(3, new int[][]{
                arrayOf(0, 1)
        }));
    }
}
