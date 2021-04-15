package ru.elcoder.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class MergeIntervalsSolutionTest {

    @Test
    public void mergeFailed1() {
        final MergeIntervalsSolution solution = new MergeIntervalsSolution();
        assertArrayEquals(arrayOf(1, 4, 5, 6), mergeArrays(solution.merge(
                new int[][]{
                        arrayOf(1, 4),
                        arrayOf(5, 6)
                }
        )));
    }

    @Test
    public void merge1() {
        final MergeIntervalsSolution solution = new MergeIntervalsSolution();
        assertArrayEquals(arrayOf(1, 6, 7, 10), mergeArrays(solution.merge(
                new int[][]{
                        arrayOf(1, 6),
                        arrayOf(7, 10)
                }
        )));
    }

    @Test
    public void merge2() {
        final MergeIntervalsSolution solution = new MergeIntervalsSolution();
        assertArrayEquals(arrayOf(1, 10), mergeArrays(solution.merge(
                new int[][]{
                        arrayOf(1, 8),
                        arrayOf(7, 10)
                }
        )));
    }

    @Test
    public void merge3() {
        final MergeIntervalsSolution solution = new MergeIntervalsSolution();
        assertArrayEquals(arrayOf(1, 10), mergeArrays(solution.merge(
                new int[][]{
                        arrayOf(1, 8),
                        arrayOf(3, 9),
                        arrayOf(7, 10)
                }
        )));
    }

    @Test
    public void merge4() {
        final MergeIntervalsSolution solution = new MergeIntervalsSolution();
        assertArrayEquals(arrayOf(1, 10, 12, 15), mergeArrays(solution.merge(
                new int[][]{
                        arrayOf(1, 8),
                        arrayOf(3, 9),
                        arrayOf(7, 10),
                        arrayOf(12, 15)
                }
        )));
    }

    @Test
    public void testMerge() {
        assertArrayEquals(arrayOf(1, 2, 3, 4, 5), mergeArrays(new int[][]{
                new int[] {1, 2, 3},
                new int[] {4, 5}
        }));
    }

    private int[] mergeArrays(int[][] arrays) {
        return Arrays.stream(arrays)
                .flatMapToInt(Arrays::stream)
                .toArray();
    }
}
