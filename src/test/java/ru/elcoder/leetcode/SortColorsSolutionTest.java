package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class SortColorsSolutionTest {

    @Test
    public void sortColors1() {
        final SortColorsSolution solution = new SortColorsSolution();
        final int[] nums = arrayOf(2, 0, 2, 1, 1, 0);
        solution.sortColors(nums);
        assertArrayEquals(arrayOf(0, 0, 1, 1, 2, 2), nums);
    }

    @Test
    public void sortColors2() {
        final SortColorsSolution solution = new SortColorsSolution();
        final int[] nums = arrayOf(2, 0, 1);
        solution.sortColors(nums);
        assertArrayEquals(arrayOf(0, 1, 2), nums);
    }

    @Test
    public void sortColors3() {
        final SortColorsSolution solution = new SortColorsSolution();
        final int[] nums = arrayOf(0);
        solution.sortColors(nums);
        assertArrayEquals(arrayOf(0), nums);
    }

    @Test
    public void sortColors4() {
        final SortColorsSolution solution = new SortColorsSolution();
        final int[] nums = arrayOf(1);
        solution.sortColors(nums);
        assertArrayEquals(arrayOf(1), nums);
    }
}
