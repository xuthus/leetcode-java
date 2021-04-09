package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.repeatChar;

public class LongestPalindromicSubstringSolutionTest {

    @Test
    public void longestPalindrome1() {
        final LongestPalindromicSubstringSolution solution = new LongestPalindromicSubstringSolution();
        assertEquals("aba", solution.longestPalindrome("babad"));
    }

    @Test
    public void longestPalindrome2() {
        final LongestPalindromicSubstringSolution solution = new LongestPalindromicSubstringSolution();
        assertEquals("bb", solution.longestPalindrome("cbbd"));
    }

    @Test
    public void longestPalindrome3() {
        final LongestPalindromicSubstringSolution solution = new LongestPalindromicSubstringSolution();
        assertEquals("a", solution.longestPalindrome("a"));
    }

    @Test
    public void longestPalindrome4() {
        final LongestPalindromicSubstringSolution solution = new LongestPalindromicSubstringSolution();
        assertEquals("a", solution.longestPalindrome("ac"));
    }

    @Test
    public void longestPalindrome5() {
        final LongestPalindromicSubstringSolution solution = new LongestPalindromicSubstringSolution();
        assertEquals(repeatChar('x', 5000), solution.longestPalindrome(repeatChar('x', 5000) + "y"));
    }
}
