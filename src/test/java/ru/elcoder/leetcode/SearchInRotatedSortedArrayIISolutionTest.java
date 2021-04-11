package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class SearchInRotatedSortedArrayIISolutionTest {
    @Test
    public void search1() {
        final SearchInRotatedSortedArrayIISolution solution = new SearchInRotatedSortedArrayIISolution();
        assertTrue(solution.search(arrayOf(2, 5, 6, 0, 0, 1, 2), 0));
    }

    @Test
    public void search2() {
        final SearchInRotatedSortedArrayIISolution solution = new SearchInRotatedSortedArrayIISolution();
        assertFalse(solution.search(arrayOf(2, 5, 6, 0, 0, 1, 2), 3));
    }

    @Test
    public void search3() {
        final SearchInRotatedSortedArrayIISolution solution = new SearchInRotatedSortedArrayIISolution();
        assertFalse(solution.search(arrayOf(2, 5, 6, 0, 0, 1, 2), 30));
    }

    @Test
    public void search4() {
        final SearchInRotatedSortedArrayIISolution solution = new SearchInRotatedSortedArrayIISolution();
        assertFalse(solution.search(arrayOf(2, 5, 6, 0, 0, 1, 2), -30));
    }

    @Test
    public void search5() {
        final SearchInRotatedSortedArrayIISolution solution = new SearchInRotatedSortedArrayIISolution();
        assertFalse(solution.search(arrayOf(2, 5), 3));
    }

    @Test
    public void search6() {
        final SearchInRotatedSortedArrayIISolution solution = new SearchInRotatedSortedArrayIISolution();
        assertTrue(solution.search(arrayOf(2, 5), 5));
    }

    @Test
    public void search7() {
        final SearchInRotatedSortedArrayIISolution solution = new SearchInRotatedSortedArrayIISolution();
        assertTrue(solution.search(arrayOf(2, 5), 2));
    }

    @Test
    public void search8() {
        final SearchInRotatedSortedArrayIISolution solution = new SearchInRotatedSortedArrayIISolution();
        assertTrue(solution.search(arrayOf(2), 2));
    }

    @Test
    public void search9() {
        final SearchInRotatedSortedArrayIISolution solution = new SearchInRotatedSortedArrayIISolution();
        assertFalse(solution.search(arrayOf(2), 5));
    }

    @Test
    public void search10() {
        final SearchInRotatedSortedArrayIISolution solution = new SearchInRotatedSortedArrayIISolution();
        assertTrue(solution.search(arrayOf(1, 0, 1, 1, 1), 0));
    }

    @Test
    public void search11() {
        final SearchInRotatedSortedArrayIISolution solution = new SearchInRotatedSortedArrayIISolution();
        assertTrue(solution.search(arrayOf(1, 1, 0, 1, 1, 1), 0));
    }

    @Test
    public void search12() {
        final SearchInRotatedSortedArrayIISolution solution = new SearchInRotatedSortedArrayIISolution();
        assertTrue(solution.search(arrayOf(1, 1, 0, 1, 1), 0));
    }

    @Test
    public void search13() {
        final SearchInRotatedSortedArrayIISolution solution = new SearchInRotatedSortedArrayIISolution();
        assertTrue(solution.search(arrayOf(1, 0, 1, 1, 1), 1));
    }

    @Test
    public void search14() {
        final SearchInRotatedSortedArrayIISolution solution = new SearchInRotatedSortedArrayIISolution();
        assertTrue(solution.search(arrayOf(0, 1, 0, 0, 0), 1));
    }

    @Test
    public void search15() {
        final SearchInRotatedSortedArrayIISolution solution = new SearchInRotatedSortedArrayIISolution();
        assertTrue(solution.search(arrayOf(5, 1, 3), 3));
    }

}
