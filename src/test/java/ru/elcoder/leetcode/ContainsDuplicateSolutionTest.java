package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class ContainsDuplicateSolutionTest {

    @Test
    public void containsDuplicate1() {
        final ContainsDuplicateSolution solution = new ContainsDuplicateSolution();
        assertTrue(solution.containsDuplicate(arrayOf(1, 2, 3, 1)));
    }

    @Test
    public void containsDuplicate2() {
        final ContainsDuplicateSolution solution = new ContainsDuplicateSolution();
        assertFalse(solution.containsDuplicate(arrayOf(1, 2, 3, 4)));
    }

    @Test
    public void containsDuplicate3() {
        final ContainsDuplicateSolution solution = new ContainsDuplicateSolution();
        assertTrue(solution.containsDuplicate(arrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)));
    }
}