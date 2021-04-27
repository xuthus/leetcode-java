package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class RotateMatrixSolutionTest {

    @Test
    public void rotate2() {
        final RotateMatrixSolution solution = new RotateMatrixSolution();
        final int[][] matrix = {
                arrayOf(5, 1),
                arrayOf(2, 4)
        };
        solution.rotate(matrix);
        assertArrayEquals(arrayOf(2, 5), matrix[0]);
        assertArrayEquals(arrayOf(4, 1), matrix[1]);
    }

    @Test
    public void rotate2_4() {
        final RotateMatrixSolution solution = new RotateMatrixSolution();
        final int[][] matrix = {
                arrayOf(0, 0, 0, 0),
                arrayOf(0, 5, 1, 0),
                arrayOf(0, 2, 4, 0),
                arrayOf(0, 0, 0, 0)
        };
        solution.rotate(matrix);
        assertArrayEquals(arrayOf(0, 0, 0, 0), matrix[0]);
        assertArrayEquals(arrayOf(0, 2, 5, 0), matrix[1]);
        assertArrayEquals(arrayOf(0, 4, 1, 0), matrix[2]);
        assertArrayEquals(arrayOf(0, 0, 0, 0), matrix[3]);
    }

    @Test
    public void rotate4() {
        final RotateMatrixSolution solution = new RotateMatrixSolution();
        final int[][] matrix = {
                arrayOf(5, 1, 9, 11),
                arrayOf(2, 4, 8, 10),
                arrayOf(13, 3, 6, 7),
                arrayOf(15, 14, 12, 16)
        };
        solution.rotate(matrix);
        assertArrayEquals(arrayOf(15, 13, 2, 5), matrix[0]);
        assertArrayEquals(arrayOf(14, 3, 4, 1), matrix[1]);
        assertArrayEquals(arrayOf(12, 6, 8, 9), matrix[2]);
        assertArrayEquals(arrayOf(16, 7, 10, 11), matrix[3]);
    }

    @Test
    public void testRotateRectangle3() {
        final RotateMatrixSolution solution = new RotateMatrixSolution();
        final int[][] matrix = {
                arrayOf(1, 2, 3),
                arrayOf(4, 5, 6),
                arrayOf(7, 8, 9)
        };
        solution.rotate(matrix, 0);
        assertArrayEquals(arrayOf(7, 4, 1), matrix[0]);
    }

    @Test
    public void testRotateRectangle4() {
        final RotateMatrixSolution solution = new RotateMatrixSolution();
        final int[][] matrix = {
                arrayOf(5, 1, 9, 11),
                arrayOf(2, 4, 8, 10),
                arrayOf(13, 3, 6, 7),
                arrayOf(15, 14, 12, 16)
        };
        solution.rotate(matrix, 0);
        assertArrayEquals(arrayOf(15, 13, 2, 5), matrix[0]);
    }
}