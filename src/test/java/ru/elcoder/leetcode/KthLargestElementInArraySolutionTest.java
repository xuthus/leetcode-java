package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class KthLargestElementInArraySolutionTest {

    @Test
    public void findKthLargest() {
        KthLargestElementInArraySolution solution = new KthLargestElementInArraySolution();

        assertEquals(4, solution.findKthLargest(arrayOf(1, 2, 3, 4, 5), 2));
        assertEquals(4, solution.findKthLargest(arrayOf(1, 2, 3, 4, 5, 3, 2, 1), 2));
        assertEquals(5, solution.findKthLargest(arrayOf(1, 2, 3, 4, 5, 3, 2, 1), 1));
        assertEquals(1, solution.findKthLargest(arrayOf(1), 1));
    }

}