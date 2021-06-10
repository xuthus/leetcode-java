package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubstringsOfSizeThreeWithDistinctCharactersSolutionTest {

    @Test
    public void countGoodSubstrings() {
        final SubstringsOfSizeThreeWithDistinctCharactersSolution solution = new SubstringsOfSizeThreeWithDistinctCharactersSolution();
        assertEquals(3, solution.countGoodSubstrings("hexad"));
        assertEquals(1, solution.countGoodSubstrings("hex"));
        assertEquals(1, solution.countGoodSubstrings("hexx"));
        assertEquals(1, solution.countGoodSubstrings("hhexx"));
        assertEquals(1, solution.countGoodSubstrings("hhex"));
        assertEquals(0, solution.countGoodSubstrings("hhe"));
        assertEquals(0, solution.countGoodSubstrings("he"));
        assertEquals(0, solution.countGoodSubstrings(""));
    }
}
