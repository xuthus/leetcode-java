package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ShortestPalindromeSolutionTest {

    @Test
    public void shortestPalindrome1() {
        final ShortestPalindromeSolution solution = new ShortestPalindromeSolution();
        assertEquals("", solution.shortestPalindrome(""));
    }

    @Test
    public void shortestPalindrome2() {
        final ShortestPalindromeSolution solution = new ShortestPalindromeSolution();
        assertEquals("a", solution.shortestPalindrome("a"));
    }

    @Test
    public void shortestPalindrome3() {
        final ShortestPalindromeSolution solution = new ShortestPalindromeSolution();
        assertEquals("aa", solution.shortestPalindrome("aa"));
    }

    @Test
    public void shortestPalindrome4() {
        final ShortestPalindromeSolution solution = new ShortestPalindromeSolution();
        assertEquals("aba", solution.shortestPalindrome("aba"));
    }

    @Test
    public void shortestPalindrome5() {
        final ShortestPalindromeSolution solution = new ShortestPalindromeSolution();
        assertEquals("cbabc", solution.shortestPalindrome("abc"));
    }

    @Test
    public void shortestPalindrome6() {
        final ShortestPalindromeSolution solution = new ShortestPalindromeSolution();
        assertEquals("cbabc", solution.shortestPalindrome("babc"));
    }

    @Test
    public void shortestPalindrome7() {
        final ShortestPalindromeSolution solution = new ShortestPalindromeSolution();
        assertEquals("cbabc", solution.shortestPalindrome("babc"));
    }

    @Test
    public void shortestPalindrome8() {
        final ShortestPalindromeSolution solution = new ShortestPalindromeSolution();
        assertEquals("ababbabbbabbaba", solution.shortestPalindrome("babbbabbaba"));
    }

    @Test
    public void isPalindrome() {
        final ShortestPalindromeSolution solution = new ShortestPalindromeSolution();
        assertTrue(solution.isPalindrome("babbbabbaba", 0, 6, new Boolean[100]));
        assertTrue(solution.isPalindrome("aba", 0, 2, new Boolean[100]));
        assertTrue(solution.isPalindrome("baba", 1, 3, new Boolean[100]));
        assertTrue(solution.isPalindrome("abba", 0, 3, new Boolean[100]));
        assertTrue(solution.isPalindrome("abbac", 0, 3, new Boolean[100]));
        assertTrue(solution.isPalindrome("abbac", 1, 2, new Boolean[100]));
        assertFalse(solution.isPalindrome("abbac", 1, 3, new Boolean[100]));
        assertFalse(solution.isPalindrome("abbac", 0, 4, new Boolean[100]));
    }

    @Test
    public void reversed() {
        final ShortestPalindromeSolution solution = new ShortestPalindromeSolution();
        assertEquals("abc", solution.reversed("111cba", 3, 5));
        assertEquals("", solution.reversed("111cba", 6, 5));
    }
}
