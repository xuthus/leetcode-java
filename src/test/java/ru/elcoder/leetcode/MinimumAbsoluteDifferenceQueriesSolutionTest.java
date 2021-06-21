package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class MinimumAbsoluteDifferenceQueriesSolutionTest {

    @Test
    public void minDifference() {
        final MinimumAbsoluteDifferenceQueriesSolution solution = new MinimumAbsoluteDifferenceQueriesSolution();
        assertArrayEquals(arrayOf(1), solution.minDifference(
                arrayOf(1, 2, 3, 4, 5),
                new int[][]{
                        arrayOf(0, 1)
                }
        ));
        assertArrayEquals(arrayOf(1), solution.minDifference(
                arrayOf(1, 2, 3, 4, 5),
                new int[][]{
                        arrayOf(0, 2)
                }
        ));
        assertArrayEquals(arrayOf(2), solution.minDifference(
                arrayOf(1, 20, 30, 40, 42),
                new int[][]{
                        arrayOf(0, 4)
                }
        ));
        assertArrayEquals(arrayOf(1), solution.minDifference(
                arrayOf(10, 70, 10, 70, 10, 70, 10, 70, 11),
                new int[][]{
                        arrayOf(0, 8)
                }
        ));
        assertArrayEquals(arrayOf(60), solution.minDifference(
                arrayOf(10, 70, 10, 70, 10, 70, 10, 70, 11),
                new int[][]{
                        arrayOf(1, 7)
                }
        ));
    }
}
