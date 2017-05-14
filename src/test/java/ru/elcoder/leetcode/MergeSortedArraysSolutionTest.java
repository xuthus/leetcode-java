package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by xuthus on 14.05.2017.
 */
public class MergeSortedArraysSolutionTest {

    public static void main(String[] args) {
        int n = 2, m = 3;
        System.out.println(n > m ? --n : --m);
        System.out.println(n);
        System.out.println(m);
    }

    @Test
    public void testMerge() throws Exception {
        MergeSortedArraysSolution solution = new MergeSortedArraysSolution();
        int[] nums1 = newIntArray(8, 1, 3, 5);
        int[] nums2 = newIntArray(5, 2, 4, 6, 8, 9);

        solution.merge(nums1, 3, nums2, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 8, 9}, nums1);
    }

    private int[] newIntArray(int size, int... values) {
        int[] ints = new int[size];
        for (int i = 0; i < values.length; i++)
            ints[i] = values[i];
        return ints;
    }
}