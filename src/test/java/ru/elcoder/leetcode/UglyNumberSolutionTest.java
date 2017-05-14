package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by xuthus on 15.05.2017.
 */
public class UglyNumberSolutionTest {

    @Test
    public void testIsUgly() throws Exception {
        UglyNumberSolution solution = new UglyNumberSolution();

        assertTrue(solution.isUgly(1));
        assertTrue(solution.isUgly(2));
        assertTrue(solution.isUgly(3));
        assertTrue(solution.isUgly(3 * 2 * 2 * 5));
        assertFalse(solution.isUgly(3 * 2 * 2 * 7));
        assertFalse(solution.isUgly(11));
    }
}