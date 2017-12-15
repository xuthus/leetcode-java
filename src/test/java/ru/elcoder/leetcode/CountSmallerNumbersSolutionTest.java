package ru.elcoder.leetcode;

import org.junit.Test;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by xuthus on 05.05.2017.
 */
public class CountSmallerNumbersSolutionTest {

    public static void main(String[] args) {
        CountSmallerNumbersSolution solution = new CountSmallerNumbersSolution();
        int[] nums = new int[32000];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(10000);
        }

        long startAt = System.currentTimeMillis();
        List<Integer> integers = solution.countSmallerEasyAndSlow(nums);
//        System.out.println("countSmallerEasyAndSlow(), ms: " + (System.currentTimeMillis() - startAt));

        startAt = System.currentTimeMillis();
        List<Integer> integers2 = solution.countSmallerWithBST(nums);
//        System.out.println("countSmallerWithBST(), ms: " + (System.currentTimeMillis() - startAt));
    }

    @Test
    public void testCountSmaller() throws Exception {
        CountSmallerNumbersSolution solution = new CountSmallerNumbersSolution();

        assertArrayEquals(new Integer[]{2, 1, 1, 0}, solution.countSmallerEasyAndSlow(new int[]{5, 2, 6, 1}).toArray(new Integer[0]));
        assertArrayEquals(new Integer[]{2, 1, 1, 0}, solution.countSmallerWithBST(new int[]{5, 2, 6, 1}).toArray(new Integer[0]));
    }
}