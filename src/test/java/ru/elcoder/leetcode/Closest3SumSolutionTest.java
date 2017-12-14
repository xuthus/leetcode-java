package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class Closest3SumSolutionTest {

    @Test
    public void threeSumClosest() throws Exception {
        Closest3SumSolution solution = new Closest3SumSolution();

        assertEquals(0, solution.threeSumClosest(arrayOf(-11, -7, -3, 4, 5, 6, 9, 11), 0));
        assertEquals(0, solution.threeSumClosest(arrayOf(-24, -18, -11, -7, -3, 4, 5, 6, 9, 11, 23), 0));
        assertEquals(0, solution.threeSumClosest(arrayOf(-55, -24, -18, -11, -7, -3, 4, 5, 6, 9, 11, 23, 33), 0));

        assertEquals(2, solution.threeSumClosest(arrayOf(1, 1, 0, 4, 5, 6, 7, 8, 9, 10), 3));
        assertEquals(2, solution.threeSumClosest(arrayOf(1, 1, 0, 4), 2));
        assertEquals(5, solution.threeSumClosest(arrayOf(1, 1, 0, 4), 5));
        assertEquals(6, solution.threeSumClosest(arrayOf(1, 1, 0, 4), 6));
        assertEquals(6, solution.threeSumClosest(arrayOf(1, 1, 0, 4), 8));
        assertEquals(2, solution.threeSumClosest(arrayOf(1, 1, 0, 4), -1));
        assertEquals(2, solution.threeSumClosest(arrayOf(1, 1, 0, 4, 5, 6, 7, 8, 9, 10), -1));
        assertEquals(10, solution.threeSumClosest(arrayOf(1, 1, 0, 4, 5, 6, 7, 8, 9, 10), 10));
        assertEquals(20, solution.threeSumClosest(arrayOf(1, 1, 0, 4, 5, 6, 7, 8, 9, 10), 20));
        assertEquals(27, solution.threeSumClosest(arrayOf(1, 1, 0, 4, 5, 6, 7, 8, 9, 10), 30));
        assertEquals(82, solution.threeSumClosest(arrayOf(1, 2, 4, 8, 16, 32, 64, 128), 82));
        assertEquals(13, solution.threeSumClosest(arrayOf(1, 2, 5, 10, 11), 12));
        assertEquals(2, solution.threeSumClosest(arrayOf(-1, 0, 1, 1, 55), 3));
    }


    @Test
    public void findClosest() {
        //int[] nums, int from, int to, int number

        Closest3SumSolution solution = new Closest3SumSolution();

        assertEquals(1, solution.findClosest(arrayOf(-1, 0, 1, 1, 55), 3, 4, 2));

        assertEquals(1, solution.findClosest(arrayOf(1, 5, 7), 0, 2, 2));
        assertEquals(1, solution.findClosest(arrayOf(1, 2, 3), 0, 2, 1));
        assertEquals(2, solution.findClosest(arrayOf(1, 2, 3), 0, 2, 2));
        assertEquals(3, solution.findClosest(arrayOf(1, 2, 3), 0, 2, 3));
        assertEquals(3, solution.findClosest(arrayOf(1, 2, 3), 0, 2, 4));
        assertEquals(1, solution.findClosest(arrayOf(1, 2, 3), 0, 2, -1));

        assertEquals(1, solution.findClosest(arrayOf(1, 2), 0, 1, 0));
        assertEquals(1, solution.findClosest(arrayOf(1, 2), 0, 1, -1));
        assertEquals(1, solution.findClosest(arrayOf(1, 2), 0, 1, 1));
        assertEquals(2, solution.findClosest(arrayOf(1, 2), 0, 1, 2));
        assertEquals(2, solution.findClosest(arrayOf(1, 2), 0, 1, 3));
        assertEquals(2, solution.findClosest(arrayOf(0, 1, 2), 1, 2, 3));
        assertEquals(1, solution.findClosest(arrayOf(0, 1, 2), 1, 2, -3));

        assertEquals(1, solution.findClosest(arrayOf(1), 0, 0, 3));
        assertEquals(1, solution.findClosest(arrayOf(1), 0, 0, -3));
        assertEquals(1, solution.findClosest(arrayOf(1), 0, 0, 1));

        assertEquals(1, solution.findClosest(arrayOf(-1, 0, 1, 1, 55), 2, 4, 4));
    }

}