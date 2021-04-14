package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

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
}