package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class InsertIntervalSolutionTest {

    @Test
    public void insert() {
        final InsertIntervalSolution solution = new InsertIntervalSolution();
        final int[][] result = solution.insert(new int[][]{
                arrayOf(1, 2),
                arrayOf(7, 9)
        }, arrayOf(4, 5));
        assertEquals(3, result.length);
        assertArrayEquals(arrayOf(1, 2), result[0]);
        assertArrayEquals(arrayOf(4, 5), result[1]);
        assertArrayEquals(arrayOf(7, 9), result[2]);
    }

    @Test
    public void insert2() {
        final InsertIntervalSolution solution = new InsertIntervalSolution();
        final int[][] result = solution.insert(new int[][]{
                arrayOf(1, 5),
                arrayOf(7, 9)
        }, arrayOf(4, 5));
        assertEquals(2, result.length);
        assertArrayEquals(arrayOf(1, 5), result[0]);
        assertArrayEquals(arrayOf(7, 9), result[1]);
    }

    @Test
    public void insert3() {
        final InsertIntervalSolution solution = new InsertIntervalSolution();
        final int[][] result = solution.insert(new int[][]{
                arrayOf(1, 5),
                arrayOf(7, 9)
        }, arrayOf(2, 12));
        assertEquals(1, result.length);
        assertArrayEquals(arrayOf(1, 12), result[0]);
    }

    @Test
    public void insert4() {
        final InsertIntervalSolution solution = new InsertIntervalSolution();
        final int[][] result = solution.insert(new int[][]{
                arrayOf(1, 2),
                arrayOf(3, 5),
                arrayOf(6, 7),
                arrayOf(8, 10),
                arrayOf(12, 16)
        }, arrayOf(4, 8));
        assertEquals(3, result.length);
        assertArrayEquals(arrayOf(1, 2), result[0]);
        assertArrayEquals(arrayOf(3, 10), result[1]);
        assertArrayEquals(arrayOf(12, 16), result[2]);
    }
}
