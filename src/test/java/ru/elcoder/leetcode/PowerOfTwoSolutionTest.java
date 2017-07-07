package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by xuthus on 07.07.2017.
 */
public class PowerOfTwoSolutionTest {
    @Test
    public void isPowerOfTwo() throws Exception {
        PowerOfTwoSolution solution = new PowerOfTwoSolution();

        assertTrue(solution.isPowerOfTwo(4));
        assertTrue(solution.isPowerOfTwo(2));
        assertTrue(solution.isPowerOfTwo(1));
        assertTrue(solution.isPowerOfTwo(16));
        assertTrue(solution.isPowerOfTwo(256 * 1024 * 1024));
        assertTrue(solution.isPowerOfTwo(2048));
        assertFalse(solution.isPowerOfTwo(-2048));
        assertFalse(solution.isPowerOfTwo(2048 + 1));
        assertFalse(solution.isPowerOfTwo(2048 - 1));

        assertTrue(solution.isPowerOfTwoIdeal(4));
        assertTrue(solution.isPowerOfTwoIdeal(2));
        assertTrue(solution.isPowerOfTwoIdeal(1));
        assertTrue(solution.isPowerOfTwoIdeal(16));
        assertTrue(solution.isPowerOfTwoIdeal(256 * 1024 * 1024));
        assertTrue(solution.isPowerOfTwoIdeal(2048));
        assertFalse(solution.isPowerOfTwoIdeal(-2048));
        assertFalse(solution.isPowerOfTwoIdeal(2048 + 1));
        assertFalse(solution.isPowerOfTwoIdeal(2048 - 1));
    }

}