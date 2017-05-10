package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by xuthus on 05.05.2017.
 */
public class MoveZeroesSolutionTest {

    @Test
    public void testMoveZeroes() throws Exception {
        MoveZeroesSolution solution = new MoveZeroesSolution();

        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);

        nums = new int[]{0, 1, 0, 0, 0, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 0, 0, 0, 0, 0}, nums);

        nums = new int[]{0, 0, 0, 0, 0, 0};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0}, nums);

        nums = new int[]{};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{}, nums);
    }
}