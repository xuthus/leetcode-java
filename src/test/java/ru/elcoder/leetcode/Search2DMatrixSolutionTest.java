package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class Search2DMatrixSolutionTest {

    @Test
    public void searchMatrix() {
        final Search2DMatrixSolution solution = new Search2DMatrixSolution();
        assertTrue(solution.searchMatrix(new int[][]{
            arrayOf(1, 2)
        }, 1));
        assertTrue(solution.searchMatrix(new int[][]{
            arrayOf(1, 2)
        }, 2));
        assertFalse(solution.searchMatrix(new int[][]{
            arrayOf(1, 2),
            arrayOf(11, 12),
        }, 10));
        assertFalse(solution.searchMatrix(new int[][]{
            arrayOf(3, 4),
            arrayOf(11, 12),
        }, 20));
        assertFalse(solution.searchMatrix(new int[][]{
            arrayOf(3, 4),
            arrayOf(11, 12),
        }, 1));
        assertTrue(solution.searchMatrix(new int[][]{
            arrayOf(3, 4),
            arrayOf(11, 12),
        }, 3));
        assertTrue(solution.searchMatrix(new int[][]{
            arrayOf(3, 4),
            arrayOf(11, 12),
        }, 12));
    }
}
