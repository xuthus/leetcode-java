package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class SearchInRotatedSortedArraySolutionTest {

    @Test
    public void search() {
        final SearchInRotatedSortedArraySolution solution = new SearchInRotatedSortedArraySolution();
        assertEquals(1, solution.search(arrayOf(3, 1), 1));
    }
}
