package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsSubsequenceSolutionTest {

    @Test
    public void isSubsequence() {
        final IsSubsequenceSolution solution = new IsSubsequenceSolution();
        assertTrue(solution.isSubsequence("ace", "ace"));
        assertTrue(solution.isSubsequence("ace", "abcde"));
        assertFalse(solution.isSubsequence("axc", "ahbgdc"));
    }
}