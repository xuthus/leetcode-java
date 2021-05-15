package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromicSubstringsSolutionTest {

    @Test
    public void countSubstrings() {
        PalindromicSubstringsSolution solution = new PalindromicSubstringsSolution();
        assertEquals(1, solution.countSubstrings("a"));
        assertEquals(2, solution.countSubstrings("ab"));
        assertEquals(4, solution.countSubstrings("aba"));
    }
}