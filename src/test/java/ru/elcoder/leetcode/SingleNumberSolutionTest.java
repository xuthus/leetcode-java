package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xuthus on 03.05.2017.
 */
public class SingleNumberSolutionTest {

    @Test
    public void testSingleNumber() throws Exception {
        SingleNumberSolution solution = new SingleNumberSolution();

        assertEquals(1, solution.singleNumber(new int[]{1, 2, 3, 4, 4, 3, 2}));
        assertEquals(1, solution.singleNumber(new int[]{1}));
        assertEquals(-3, solution.singleNumber(new int[]{-1, -2, -1, -2, -3}));
    }
}