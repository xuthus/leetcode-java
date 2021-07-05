package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class NextPermutationSolutionTest {

    @Test
    public void nextPermutation() {
        final NextPermutationSolution solution = new NextPermutationSolution();
        int[] nums = arrayOf(1, 2, 3);
        solution.nextPermutation(nums);
        assertArrayEquals(arrayOf(1, 3, 2), nums);
        nums = arrayOf(2, 3, 1);
        solution.nextPermutation(nums);
        assertArrayEquals(arrayOf(3, 1, 2), nums);
        nums = arrayOf(1, 1, 1);
        solution.nextPermutation(nums);
        assertArrayEquals(arrayOf(1, 1, 1), nums);
        nums = arrayOf(1);
        solution.nextPermutation(nums);
        assertArrayEquals(arrayOf(1), nums);
        nums = arrayOf(3, 2, 1);
        solution.nextPermutation(nums);
        assertArrayEquals(arrayOf(1, 2, 3), nums);
    }
}
