package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class LongestCommonPrefixTest {

    @Test
    public void example1() {
        final LongestCommonPrefix solution = new LongestCommonPrefix();
        assertEquals("fl", solution.longestCommonPrefix(arrayOf("flower", "flow", "flight")));
    }

    @Test
    public void example2() {
        final LongestCommonPrefix solution = new LongestCommonPrefix();
        assertEquals("", solution.longestCommonPrefix(arrayOf("dog", "racecar", "car")));
    }

    @Test
    public void borderCases() {
        final LongestCommonPrefix solution = new LongestCommonPrefix();
        assertEquals("", solution.longestCommonPrefix(arrayOf("", "", "car")));
    }

    @Test
    public void sameString() {
        final LongestCommonPrefix solution = new LongestCommonPrefix();
        assertEquals("a", solution.longestCommonPrefix(arrayOf("a", "a", "a")));
    }

}