package ru.elcoder.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;
import static ru.elcoder.leetcode.utils.Utils.toIntArray;

public class FourSumSolutionTest {

    @Test
    public void fourSum1() {
        final FourSumSolution solution = new FourSumSolution();
        final List<List<Integer>> nums = solution.fourSum(arrayOf(1, 2, 3, 4), 10);
        assertEquals(1, nums.size());
        assertArrayEquals(arrayOf(1, 2, 3, 4), toIntArray(nums.get(0)));
    }

    @Test
    public void fourSum2() {
        final FourSumSolution solution = new FourSumSolution();
        final List<List<Integer>> nums = solution.fourSum(arrayOf(2, 2, 2, 2, 2, 2, 2), 8);
        assertEquals(1, nums.size());
        assertArrayEquals(arrayOf(2, 2, 2, 2), toIntArray(nums.get(0)));
    }
}
