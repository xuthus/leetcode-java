package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class BackspaceStringCompareSolutionTest {

    @Test
    public void backspaceCompare() {
        final BackspaceStringCompareSolution solution = new BackspaceStringCompareSolution();
        assertTrue(solution.backspaceCompare("a", "a"));
        assertTrue(solution.backspaceCompare("a", "ab#"));
        assertTrue(solution.backspaceCompare("ac#", "ab#"));
        assertTrue(solution.backspaceCompare("ac##", "a#b#"));
    }
}
