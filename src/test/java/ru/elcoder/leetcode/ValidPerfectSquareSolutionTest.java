package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by xuthus on 02.07.2017.
 */
public class ValidPerfectSquareSolutionTest {
    @Test
    public void isPerfectSquare() throws Exception {
        ValidPerfectSquareSolution solution = new ValidPerfectSquareSolution();

        assertTrue(solution.isPerfectSquare(16));
        assertTrue(solution.isPerfectSquare(64));
        assertTrue(solution.isPerfectSquare(65536));
        assertTrue(solution.isPerfectSquare(1));
        assertTrue(solution.isPerfectSquare(0));
        assertFalse(solution.isPerfectSquare(2));
        assertFalse(solution.isPerfectSquare(7));
        assertFalse(solution.isPerfectSquare(63));
        assertFalse(solution.isPerfectSquare(2147395600 - 1));
        assertTrue(solution.isPerfectSquare(2147395600));
        assertFalse(solution.isPerfectSquare(Integer.MAX_VALUE));
    }

}