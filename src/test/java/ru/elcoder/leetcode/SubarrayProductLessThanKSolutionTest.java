package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class SubarrayProductLessThanKSolutionTest {

    @Test
    public void numSubarrayProductLessThanK() {
        final SubarrayProductLessThanKSolution solution = new SubarrayProductLessThanKSolution();
        assertEquals(8, solution.numSubarrayProductLessThanK(arrayOf(10, 5, 2, 6), 100));
    }
}
