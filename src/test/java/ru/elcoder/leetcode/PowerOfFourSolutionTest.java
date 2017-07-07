package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by xuthus on 07.07.2017.
 */
public class PowerOfFourSolutionTest {
    @Test
    public void isPowerOfFour() throws Exception {
        PowerOfFourSolution solution = new PowerOfFourSolution();

        assertTrue(solution.isPowerOfFour(16));
        assertTrue(solution.isPowerOfFour(1));
        assertTrue(solution.isPowerOfFour(4));
        assertTrue(solution.isPowerOfFour(256));
        assertTrue(solution.isPowerOfFour(256 * 1024 * 1024));
        assertFalse(solution.isPowerOfFour(256 * 1024 * 1024 - 1));
        assertFalse(solution.isPowerOfFour(-256 * 1024 * 1024 - 1));
        assertFalse(solution.isPowerOfFour(2));
        assertFalse(solution.isPowerOfFour(8));
        assertFalse(solution.isPowerOfFour(32));
        assertFalse(solution.isPowerOfFour(128));
        assertFalse(solution.isPowerOfFour(0));
    }

}