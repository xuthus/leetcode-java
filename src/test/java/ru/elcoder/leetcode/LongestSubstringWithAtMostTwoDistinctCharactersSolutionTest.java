package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithAtMostTwoDistinctCharactersSolutionTest {

    @Test
    public void lengthOfLongestSubstringTwoDistinct() {
        final LongestSubstringWithAtMostTwoDistinctCharactersSolution solution = new LongestSubstringWithAtMostTwoDistinctCharactersSolution();
        assertEquals(1, solution.lengthOfLongestSubstringTwoDistinct("a"));
        assertEquals(2, solution.lengthOfLongestSubstringTwoDistinct("aa"));
        assertEquals(2, solution.lengthOfLongestSubstringTwoDistinct("ab"));
        assertEquals(2, solution.lengthOfLongestSubstringTwoDistinct("abc"));
        assertEquals(5, solution.lengthOfLongestSubstringTwoDistinct("abaabc"));
    }
}
