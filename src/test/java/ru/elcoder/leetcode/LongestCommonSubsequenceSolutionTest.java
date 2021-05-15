package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonSubsequenceSolutionTest {

    @Test
    public void longestCommonSubsequence() {
        LongestCommonSubsequenceSolution solution = new LongestCommonSubsequenceSolution();
        assertEquals(3, solution.longestCommonSubsequence("abc", "abcde"));
        assertEquals(3, solution.longestCommonSubsequence("ace", "abcde"));
        assertEquals(3, solution.longestCommonSubsequence("abeeec", "abcde"));
        assertEquals(1, solution.longestCommonSubsequence("a", "abcde"));
    }
}