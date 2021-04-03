package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class PlusOneSolutionTest {

    @Test
    public void plusOne() {
        final PlusOneSolution solution = new PlusOneSolution();
        assertArrayEquals(arrayOf(1, 2), solution.plusOne(arrayOf(1, 1)));
        assertArrayEquals(arrayOf(1), solution.plusOne(arrayOf(0)));
        assertArrayEquals(arrayOf(1, 0), solution.plusOne(arrayOf(9)));
        assertArrayEquals(arrayOf(1, 0, 0, 0, 0), solution.plusOne(arrayOf(9, 9, 9, 9)));
        assertArrayEquals(arrayOf(9, 0, 0, 0), solution.plusOne(arrayOf(8, 9, 9, 9)));
    }
}