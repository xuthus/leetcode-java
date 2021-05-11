package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class FindMinimumInRotatedSortedArraySolutionTest {

    @Test
    public void findMin() {
        final FindMinimumInRotatedSortedArraySolution solution = new FindMinimumInRotatedSortedArraySolution();
        assertEquals(1, solution.findMin(arrayOf(3, 4, 1, 2)));
        assertEquals(1, solution.findMin(arrayOf(3, 4, 1)));
        assertEquals(1, solution.findMin(arrayOf(3, 1, 2)));
        assertEquals(1, solution.findMin(arrayOf(7,8,9,10,1,2,3,4,5,6)));
        assertEquals(1, solution.findMin(arrayOf(7,8,9,10,1,2,3,4,5)));
        assertEquals(1, solution.findMin(arrayOf(7,8,9,10,1,2,3,4)));
        assertEquals(1, solution.findMin(arrayOf(8,9,10,1,2,3,4,5,6)));
    }
}
