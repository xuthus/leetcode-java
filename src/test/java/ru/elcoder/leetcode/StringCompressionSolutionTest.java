package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCompressionSolutionTest {

    @Test
    public void compress1() {
        StringCompressionSolution solution = new StringCompressionSolution();
        char[] chars = "aa".toCharArray();
        assertEquals(2, solution.compress(chars));
        assertEquals('a', chars[0]);
        assertEquals('2', chars[1]);
    }

    @Test
    public void compress2() {
        StringCompressionSolution solution = new StringCompressionSolution();
        char[] chars = "aabbb".toCharArray();
        assertEquals(4, solution.compress(chars));
        assertEquals('a', chars[0]);
        assertEquals('2', chars[1]);
        assertEquals('b', chars[2]);
        assertEquals('3', chars[3]);
    }

    @Test
    public void compress3() {
        StringCompressionSolution solution = new StringCompressionSolution();
        char[] chars = "aabbbcdd".toCharArray();
        assertEquals(7, solution.compress(chars));
        assertEquals('a', chars[0]);
        assertEquals('2', chars[1]);
        assertEquals('b', chars[2]);
        assertEquals('3', chars[3]);
        assertEquals('c', chars[4]);
        assertEquals('d', chars[5]);
        assertEquals('2', chars[6]);
    }
}