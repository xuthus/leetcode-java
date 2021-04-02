package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class SearchInsertPositionTest {

    @Test
    public void example1() {
        final SearchInsertPositionSolution solution = new SearchInsertPositionSolution();
        assertEquals(2, solution.searchInsert(arrayOf(1, 3, 5, 6), 5));
    }

    @Test
    public void example2() {
        final SearchInsertPositionSolution solution = new SearchInsertPositionSolution();
        assertEquals(1, solution.searchInsert(arrayOf(1, 3, 5, 6), 2));
    }

    @Test
    public void example3() {
        final SearchInsertPositionSolution solution = new SearchInsertPositionSolution();
        assertEquals(4, solution.searchInsert(arrayOf(1, 3, 5, 6), 7));
    }

    @Test
    public void example4() {
        final SearchInsertPositionSolution solution = new SearchInsertPositionSolution();
        assertEquals(0, solution.searchInsert(arrayOf(1, 3, 5, 6), 0));
    }

    @Test
    public void example5() {
        final SearchInsertPositionSolution solution = new SearchInsertPositionSolution();
        assertEquals(0, solution.searchInsert(arrayOf(1), 0));
    }
}