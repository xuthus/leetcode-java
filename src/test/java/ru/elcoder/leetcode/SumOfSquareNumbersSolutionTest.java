package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by xuthus on 02.07.2017.
 */
public class SumOfSquareNumbersSolutionTest {
    @Test
    public void judgeSquareSum() throws Exception {
        SumOfSquareNumbersSolution solution = new SumOfSquareNumbersSolution();

        assertTrue(solution.judgeSquareSum(5));
        assertFalse(solution.judgeSquareSum(3));
        assertTrue(solution.judgeSquareSum(17));
        assertTrue(solution.judgeSquareSum(18));
        assertTrue(solution.judgeSquareSum(1));
        assertTrue(solution.judgeSquareSum(2));
        assertTrue(solution.judgeSquareSum(100));
        assertTrue(solution.judgeSquareSum(1000));
        assertFalse(solution.judgeSquareSum(2147482647));
    }

}