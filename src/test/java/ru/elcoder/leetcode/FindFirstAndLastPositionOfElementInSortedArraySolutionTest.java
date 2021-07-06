package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class FindFirstAndLastPositionOfElementInSortedArraySolutionTest {

    @Test
    public void searchRange1() {
        final FindFirstAndLastPositionOfElementInSortedArraySolution solution = new FindFirstAndLastPositionOfElementInSortedArraySolution();
        final int[] range = solution.searchRange(arrayOf(1, 2, 3, 4), 3);
        assertEquals(2, range[0]);
        assertEquals(2, range[1]);
    }

    @Test
    public void searchRange2() {
        final FindFirstAndLastPositionOfElementInSortedArraySolution solution = new FindFirstAndLastPositionOfElementInSortedArraySolution();
        final int[] range = solution.searchRange(arrayOf(1, 2, 3, 3, 4), 3);
        assertEquals(2, range[0]);
        assertEquals(3, range[1]);
    }

    @Test
    public void searchRange3() {
        final FindFirstAndLastPositionOfElementInSortedArraySolution solution = new FindFirstAndLastPositionOfElementInSortedArraySolution();
        final int[] range = solution.searchRange(arrayOf(1, 2, 3, 3, 3, 4), 3);
        assertEquals(2, range[0]);
        assertEquals(4, range[1]);
    }

    @Test
    public void searchRange4() {
        final FindFirstAndLastPositionOfElementInSortedArraySolution solution = new FindFirstAndLastPositionOfElementInSortedArraySolution();
        final int[] range = solution.searchRange(arrayOf(1, 2, 3, 3, 3), 3);
        assertEquals(2, range[0]);
        assertEquals(4, range[1]);
    }

    @Test
    public void searchRange5() {
        final FindFirstAndLastPositionOfElementInSortedArraySolution solution = new FindFirstAndLastPositionOfElementInSortedArraySolution();
        final int[] range = solution.searchRange(arrayOf(3, 3, 3), 3);
        assertEquals(0, range[0]);
        assertEquals(2, range[1]);
    }

    @Test
    public void searchRange6() {
        final FindFirstAndLastPositionOfElementInSortedArraySolution solution = new FindFirstAndLastPositionOfElementInSortedArraySolution();
        final int[] range = solution.searchRange(arrayOf(3), 3);
        assertEquals(0, range[0]);
        assertEquals(0, range[1]);
    }

    @Test
    public void searchRange7() {
        final FindFirstAndLastPositionOfElementInSortedArraySolution solution = new FindFirstAndLastPositionOfElementInSortedArraySolution();
        final int[] range = solution.searchRange(arrayOf(3), 2);
        assertEquals(-1, range[0]);
        assertEquals(-1, range[1]);
    }
}
