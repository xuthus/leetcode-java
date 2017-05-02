package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by xuthus on 27.04.2017.
 */
public class TwoSumsSolutionTest {
    @Test
    public void twoSum() throws Exception {
        TwoSumsSolution solution = new TwoSumsSolution();

        assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{2, 7, 11, 5}, 9));
        assertArrayEquals(new int[]{2, 3}, solution.twoSum(new int[]{1, 4, 2, 7, 11, 5}, 9));
        assertArrayEquals(new int[]{0, 3}, solution.twoSum(new int[]{1, 4, 2, 7, 11, 5}, 8));
        assertArrayEquals(new int[]{1, 4}, solution.twoSum(new int[]{1, 4, 2, 7, 11, 5}, 15));
        assertArrayEquals(new int[]{}, solution.twoSum(new int[]{1, 4, 2, 7, 11, 5}, 20));
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{1, 4}, 5));
        assertArrayEquals(new int[]{}, solution.twoSum(new int[]{1}, 5));
        assertArrayEquals(new int[]{}, solution.twoSum(new int[]{}, 5));
        assertArrayEquals(new int[]{0, 2}, solution.twoSum(new int[]{-3, 4, 3, 90}, 0));
    }

}