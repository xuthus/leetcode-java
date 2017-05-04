package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xuthus on 04.05.2017.
 */
public class RemoveDuplicatesSolutionTest {

    @Test
    public void testRemoveDuplicates() throws Exception {
        RemoveDuplicatesSolution solution = new RemoveDuplicatesSolution();

        int[] nums = {1, 1, 2};
        assertEquals(2, solution.removeDuplicates(nums));
        assertEquals(1, nums[0]);
        assertEquals(2, nums[1]);

        nums = new int[]{1, 3, 3, 3, 4, 5, 5, 6};
        assertEquals(5, solution.removeDuplicates(nums));
        assertEquals(1, nums[0]);
        assertEquals(3, nums[1]);
        assertEquals(4, nums[2]);
        assertEquals(5, nums[3]);
        assertEquals(6, nums[4]);

        nums = new int[]{1};
        assertEquals(1, solution.removeDuplicates(nums));
        assertEquals(1, nums[0]);

        nums = new int[]{};
        assertEquals(0, solution.removeDuplicates(nums));
    }
}