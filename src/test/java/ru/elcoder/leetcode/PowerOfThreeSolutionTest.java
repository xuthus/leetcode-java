package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by xuthus on 07.07.2017.
 */
public class PowerOfThreeSolutionTest {
    @Test
    public void isPowerOfThree() throws Exception {
        PowerOfThreeSolution solution = new PowerOfThreeSolution();

        assertTrue(solution.isPowerOfThree(3));
        assertTrue(solution.isPowerOfThree(243));
        assertTrue(solution.isPowerOfThree(129140163));
        assertTrue(solution.isPowerOfThree(1162261467));
        assertFalse(solution.isPowerOfThree(10));
        assertFalse(solution.isPowerOfThree(10000));
        assertFalse(solution.isPowerOfThree(100000000));
        assertFalse(solution.isPowerOfThree(-3));
        assertFalse(solution.isPowerOfThree(-27));
    }

    @Test
    public void isPowerOfThreeIdeal() throws Exception {
        PowerOfThreeSolution solution = new PowerOfThreeSolution();

        assertTrue(solution.isPowerOfThreeIdeal(3));
        assertTrue(solution.isPowerOfThreeIdeal(243));
        assertTrue(solution.isPowerOfThreeIdeal(129140163));
        assertTrue(solution.isPowerOfThreeIdeal(1162261467));
        assertFalse(solution.isPowerOfThreeIdeal(10));
        assertFalse(solution.isPowerOfThreeIdeal(10000));
        assertFalse(solution.isPowerOfThreeIdeal(100000000));
        assertFalse(solution.isPowerOfThreeIdeal(-3));
        assertFalse(solution.isPowerOfThreeIdeal(-27));
    }

}