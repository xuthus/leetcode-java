package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class MaximumProductSubarraySolutionTest {

    @Test
    public void maxProduct() {
        final MaximumProductSubarraySolution solution = new MaximumProductSubarraySolution();
        assertEquals(200, solution.maxProduct(arrayOf(100, -1, 200)));
        assertEquals(100, solution.maxProduct(arrayOf(100)));
        assertEquals(20000, solution.maxProduct(arrayOf(100, 200)));
        assertEquals(20000, solution.maxProduct(arrayOf(-100, -200)));
        assertEquals(200, solution.maxProduct(arrayOf(-100, 200)));
        assertEquals(200, solution.maxProduct(arrayOf(100, 0, 200)));
    }
}
