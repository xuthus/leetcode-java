package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xuthus on 04.05.2017.
 */
public class RemoveElementSolutionTest {

    @Test
    public void testRemoveElement() throws Exception {
        RemoveElementSolution solution = new RemoveElementSolution();

        int[] nums = {3, 2, 2, 3};
        assertEquals(2, solution.removeElement(nums, 3));
        assertEquals(2, nums[0]);
        assertEquals(2, nums[1]);

        nums = new int[]{1};
        assertEquals(1, solution.removeElement(nums, 3));
        assertEquals(1, nums[0]);

        nums = new int[]{1};
        assertEquals(0, solution.removeElement(nums, 1));

        nums = new int[]{};
        assertEquals(0, solution.removeElement(nums, 1));
    }
}