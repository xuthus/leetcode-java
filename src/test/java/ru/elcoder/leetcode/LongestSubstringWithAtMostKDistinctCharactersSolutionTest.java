package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithAtMostKDistinctCharactersSolutionTest {

    @Test
    public void lengthOfLongestSubstringKDistinct() {
        final LongestSubstringWithAtMostKDistinctCharactersSolution solution = new LongestSubstringWithAtMostKDistinctCharactersSolution();
        assertEquals(3, solution.lengthOfLongestSubstringKDistinct("aabcd", 2));
        assertEquals(6, solution.lengthOfLongestSubstringKDistinct("aabcdcdcd", 2));
    }
}
