package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class SetMatrixZeroesSolutionTest {

    @Test
    public void setZeroes1() {
        final SetMatrixZeroesSolution solution = new SetMatrixZeroesSolution();
        final int[][] matrix = {
                new int[]{1, 1, 1},
                new int[]{1, 0, 1},
                new int[]{1, 1, 1}
        };
        solution.setZeroesSpaceNM(matrix);
        assertArrayEquals(arrayOf(1, 0, 1), matrix[0]);
        assertArrayEquals(arrayOf(0, 0, 0), matrix[1]);
        assertArrayEquals(arrayOf(1, 0, 1), matrix[2]);
    }

    @Test
    public void setZeroes2() {
        final SetMatrixZeroesSolution solution = new SetMatrixZeroesSolution();
        final int[][] matrix = {
                new int[]{0, 1, 2, 0},
                new int[]{3, 4, 5, 2},
                new int[]{1, 3, 1, 5}
        };
        solution.setZeroesSpaceNM(matrix);
        assertArrayEquals(arrayOf(0, 0, 0, 0), matrix[0]);
        assertArrayEquals(arrayOf(0, 4, 5, 0), matrix[1]);
        assertArrayEquals(arrayOf(0, 3, 1, 0), matrix[2]);
    }

    @Test
    public void setZeroes3() {
        final SetMatrixZeroesSolution solution = new SetMatrixZeroesSolution();
        final int[][] matrix = {
                new int[]{1, 1, 1},
                new int[]{1, 0, 1},
                new int[]{1, 1, 1}
        };
        solution.setZeroesSpace1(matrix);
        assertArrayEquals(arrayOf(1, 0, 1), matrix[0]);
        assertArrayEquals(arrayOf(0, 0, 0), matrix[1]);
        assertArrayEquals(arrayOf(1, 0, 1), matrix[2]);
    }

    @Test
    public void setZeroes4() {
        final SetMatrixZeroesSolution solution = new SetMatrixZeroesSolution();
        final int[][] matrix = {
                new int[]{0, 1, 2, 0},
                new int[]{3, 4, 5, 2},
                new int[]{1, 3, 1, 5}
        };
        solution.setZeroesSpace1(matrix);
        assertArrayEquals(arrayOf(0, 0, 0, 0), matrix[0]);
        assertArrayEquals(arrayOf(0, 4, 5, 0), matrix[1]);
        assertArrayEquals(arrayOf(0, 3, 1, 0), matrix[2]);
    }

    @Test
    public void setZeroes5() {
        final SetMatrixZeroesSolution solution = new SetMatrixZeroesSolution();
        final int[][] matrix = {
                new int[]{0}
        };
        solution.setZeroesSpace1(matrix);
        assertArrayEquals(arrayOf(0), matrix[0]);
    }

    @Test
    public void setZeroes6() {
        final SetMatrixZeroesSolution solution = new SetMatrixZeroesSolution();
        final int[][] matrix = {
                new int[]{7}
        };
        solution.setZeroesSpace1(matrix);
        assertArrayEquals(arrayOf(7), matrix[0]);
    }

    @Test
    public void setZeroes7() {
        final SetMatrixZeroesSolution solution = new SetMatrixZeroesSolution();
        final int[][] matrix = {
                new int[]{7},
                new int[]{0}
        };
        solution.setZeroesSpace1(matrix);
        assertArrayEquals(arrayOf(0), matrix[0]);
        assertArrayEquals(arrayOf(0), matrix[1]);
    }
}