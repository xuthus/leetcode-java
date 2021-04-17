package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class LongestIncreasingSubsequenceSolutionTest {

    @Test
    public void lengthOfLIS0() {
        final LongestIncreasingSubsequenceSolution solution = new LongestIncreasingSubsequenceSolution();
        assertEquals(4, solution.lengthOfLIS(arrayOf(1, 2, 10, 4, 5)));
    }

    @Test
    public void lengthOfLIS1() {
        final LongestIncreasingSubsequenceSolution solution = new LongestIncreasingSubsequenceSolution();
        assertEquals(4, solution.lengthOfLIS(arrayOf(10, 9, 2, 5, 3, 7, 101, 18)));
    }

    @Test
    public void lengthOfLIS2() {
        final LongestIncreasingSubsequenceSolution solution = new LongestIncreasingSubsequenceSolution();
        assertEquals(4, solution.lengthOfLIS(arrayOf(0, 1, 0, 3, 2, 3)));
    }

    @Test
    public void lengthOfLIS3() {
        final LongestIncreasingSubsequenceSolution solution = new LongestIncreasingSubsequenceSolution();
        assertEquals(1, solution.lengthOfLIS(arrayOf(7, 7, 7, 7, 7, 7, 7)));
    }
}