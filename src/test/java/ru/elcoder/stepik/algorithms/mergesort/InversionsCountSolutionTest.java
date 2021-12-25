package ru.elcoder.stepik.algorithms.mergesort;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class InversionsCountSolutionTest {

    @Test
    public void mergeSort() {
        int[] ints = arrayOf(1, 2, 3);
        final int count = InversionsCountSolution.mergeSort(ints, 0, 2);
        assertEquals(0, count);
        assertArrayEquals(arrayOf(1, 2, 3), ints);
    }

    @Test
    public void merge() {
    }
}
