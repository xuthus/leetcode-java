package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sergey Yanzin (xuthus@yandex.ru) on 04.09.2017.
 */
public class MaximumSubarraySolutionTest {

    @Test
    public void maxSubArray() throws Exception {
        MaximumSubarraySolution solution = new MaximumSubarraySolution();

        assertEquals(-1, solution.maxSubArray(new int[]{-2, -1}));
        assertEquals(1917, solution.maxSubArray(new int[]{1917}));
        assertEquals(1917, solution.maxSubArray(new int[]{-1, 1917}));
        assertEquals(1918, solution.maxSubArray(new int[]{2, -1, 1917}));
        assertEquals(1917, solution.maxSubArray(new int[]{1917, -1}));
        assertEquals(1918, solution.maxSubArray(new int[]{1917, -1, 2}));
        assertEquals(6, solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(9, solution.maxSubArray(new int[]{1, 2, 3, -1, -1, 5, -2}));
        assertEquals(9, solution.maxSubArray(new int[]{4, -3, -2, 1, 2, 3, -1, -1, 5, -2}));
    }

    @Test
    public void maxSubArrayNaive() throws Exception {
        MaximumSubarraySolution solution = new MaximumSubarraySolution();

        assertEquals(-1, solution.maxSubArrayNaive(new int[]{-2, -1}));
        assertEquals(1917, solution.maxSubArrayNaive(new int[]{1917}));
        assertEquals(1917, solution.maxSubArrayNaive(new int[]{-1, 1917}));
        assertEquals(1918, solution.maxSubArrayNaive(new int[]{2, -1, 1917}));
        assertEquals(1917, solution.maxSubArrayNaive(new int[]{1917, -1}));
        assertEquals(1918, solution.maxSubArrayNaive(new int[]{1917, -1, 2}));
        assertEquals(6, solution.maxSubArrayNaive(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(9, solution.maxSubArrayNaive(new int[]{1, 2, 3, -1, -1, 5, -2}));
        assertEquals(9, solution.maxSubArrayNaive(new int[]{4, -3, -2, 1, 2, 3, -1, -1, 5, -2}));
    }
}