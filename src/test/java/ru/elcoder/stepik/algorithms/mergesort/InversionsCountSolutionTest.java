package ru.elcoder.stepik.algorithms.mergesort;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class InversionsCountSolutionTest {

    @Test
    public void mergeSort1() {
        int[] ints = arrayOf(1, 2, 3);
        final long count = InversionsCountSolution.mergeSort(ints, 0, 2);
        assertEquals(0, count);
        assertArrayEquals(arrayOf(1, 2, 3), ints);
    }

    @Test
    public void mergeSort2() {
        int[] ints = arrayOf(1, 3, 2);
        final long count = InversionsCountSolution.mergeSort(ints, 0, 2);
        assertEquals(1, count);
        assertArrayEquals(arrayOf(1, 2, 3), ints);
    }

    @Test
    public void mergeSort21() {
        int[] ints = arrayOf(2, 3, 1);
        final long count = InversionsCountSolution.mergeSort(ints, 0, 2);
        assertEquals(2, count);
        assertArrayEquals(arrayOf(1, 2, 3), ints);
    }

    @Test
    public void mergeSort3() {
        int[] ints = arrayOf(3, 2, 1);
        final long count = InversionsCountSolution.mergeSort(ints, 0, 2);
        assertEquals(3, count);
        assertArrayEquals(arrayOf(1, 2, 3), ints);
    }

    @Test
    public void mergeSort4() {
        int[] ints = arrayOf(4, 3, 2, 1);
        final long count = InversionsCountSolution.mergeSort(ints, 0, 3);
        assertEquals(3 + 2 + 1, count);
        assertArrayEquals(arrayOf(1, 2, 3, 4), ints);
    }

    @Test
    public void mergeSort5() {
        int[] ints = arrayOf(5, 6, 7, 4, 3, 2, 1);
        final long count = InversionsCountSolution.mergeSort(ints, 0, 6);
        assertEquals(6 + 5 + 4 + 3, count);
        assertArrayEquals(arrayOf(1, 2, 3, 4, 5, 6, 7), ints);
    }

    @Test
    public void mergeSort6() {
        int[] ints = arrayOf(2, 3, 9, 2, 9);
        final long count = InversionsCountSolution.mergeSort(ints, 0, ints.length - 1);
        assertEquals(2, count);
        assertArrayEquals(arrayOf(2, 2, 3, 9, 9), ints);
    }

    @Test
    public void mergeSort7() {
        int[] ints = arrayOf(7, 6, 5, 4, 3, 2, 1);
        final long count = InversionsCountSolution.mergeSort(ints, 0, 6);
        assertEquals(21, count);
        assertArrayEquals(arrayOf(1, 2, 3, 4, 5, 6, 7), ints);
    }

    @Test
    public void mergeSort8() {
        int[] ints = arrayOf(1, 3, 4, 5, 6, 2);
        final long count = InversionsCountSolution.mergeSort(ints, 0, ints.length - 1);
        assertEquals(4, count);
        assertArrayEquals(arrayOf(1, 2, 3, 4, 5, 6), ints);
    }

    @Test
    public void mergeSort9() {
        int[] ints = arrayOf(1, 2, 3, 5, 4);
        final long count = InversionsCountSolution.mergeSort(ints, 0, ints.length - 1);
        assertEquals(1, count);
        assertArrayEquals(arrayOf(1, 2, 3, 4, 5), ints);
    }

    @Test
    public void mergeSort11() {
        int[] ints = arrayOf(10, 8, 6, 2, 4, 5);
        final long count = InversionsCountSolution.mergeSort(ints, 0, ints.length - 1);
        assertEquals(12, count);
        assertArrayEquals(arrayOf(2, 4, 5, 6, 8, 10), ints);
    }

    @Test
    public void mergeSort12() {
        int[] ints = arrayOf(1, 9, 8, 1, 4, 1);
        final long count = InversionsCountSolution.mergeSort(ints, 0, ints.length - 1);
        assertEquals(8, count);
        assertArrayEquals(arrayOf(1, 1, 1, 4, 8, 9), ints);
    }

    @Test
    public void mergeSort13() {
        int[] ints = arrayOf(6, 5, 8, 6, 0, 4);
        final long count = InversionsCountSolution.mergeSort(ints, 0, ints.length - 1);
        assertEquals(10, count);
        assertArrayEquals(arrayOf(0, 4, 5, 6, 6, 8), ints);
    }

    @Test
    public void merge() {
    }
}
