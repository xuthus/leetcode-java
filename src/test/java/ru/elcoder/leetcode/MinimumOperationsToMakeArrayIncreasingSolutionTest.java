package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class MinimumOperationsToMakeArrayIncreasingSolutionTest {

    @Test
    public void minOperations() {
        MinimumOperationsToMakeArrayIncreasingSolution solution = new MinimumOperationsToMakeArrayIncreasingSolution();
        assertEquals(0, solution.minOperations(arrayOf(1, 2, 3)));
        assertEquals(1, solution.minOperations(arrayOf(1, 2, 2)));
        assertEquals(1, solution.minOperations(arrayOf(1, 1, 3)));
        assertEquals(3, solution.minOperations(arrayOf(1, 1, 1)));
    }
}