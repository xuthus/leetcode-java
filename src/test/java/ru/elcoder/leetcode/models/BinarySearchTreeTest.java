package ru.elcoder.leetcode.models;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 * Created by xuthus on 13.05.2017.
 */
public class BinarySearchTreeTest {

    public static final int ARRAY_SIZE = 16000;

    @Test
    public void testInsertAndCounts() {
        BinarySearchTree tree = new BinarySearchTree();

        int[] nums = new int[ARRAY_SIZE];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(10000);
        }
        long startAt = System.currentTimeMillis();
        for (int i = 0; i < nums.length; i++) {
            tree.insert(nums[i]);
        }
        System.out.println("Insert, ms: " + (System.currentTimeMillis() - startAt));

        for (int i = 0; i < 10000; i++) {
            int max = random.nextInt(10000);
            int cnt = 0;
            for (int j = 0; j < ARRAY_SIZE; j++)
                if (nums[j] < max)
                    cnt++;
            assertEquals(cnt, tree.countLessThan(max));
        }

    }

}