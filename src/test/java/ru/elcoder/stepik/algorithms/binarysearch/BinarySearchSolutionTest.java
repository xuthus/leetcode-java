package ru.elcoder.stepik.algorithms.binarysearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchSolutionTest {

    @Test
    public void binarySearch1() {
        final int[] nums = {4};
        assertEquals(1, BinarySearchSolution.binarySearch(nums, 4));
    }

    @Test
    public void binarySearch2() {
        final int[] nums = {1, 5, 8, 12, 13};
        assertEquals(3, BinarySearchSolution.binarySearch(nums, 8));
        assertEquals(1, BinarySearchSolution.binarySearch(nums, 1));
        assertEquals(-1, BinarySearchSolution.binarySearch(nums, 23));
        assertEquals(1, BinarySearchSolution.binarySearch(nums, 1));
        assertEquals(-1, BinarySearchSolution.binarySearch(nums, 11));
        assertEquals(-1, BinarySearchSolution.binarySearch(nums, 0));
    }
}
