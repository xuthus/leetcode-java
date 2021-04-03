package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLastWordSolutionTest {

    @Test
    public void lengthOfLastWord() {
        final LengthOfLastWordSolution solution = new LengthOfLastWordSolution();
        assertEquals(5, solution.lengthOfLastWord("Hello world"));
        assertEquals(5, solution.lengthOfLastWord("Hello world  "));
        assertEquals(5, solution.lengthOfLastWord("Hello   world  "));
        assertEquals(5, solution.lengthOfLastWord("  Hello   world  "));
        assertEquals(5, solution.lengthOfLastWord("     world  "));
        assertEquals(5, solution.lengthOfLastWord("world  "));
        assertEquals(5, solution.lengthOfLastWord(" world"));
        assertEquals(5, solution.lengthOfLastWord("world"));
        assertEquals(0, solution.lengthOfLastWord(""));
        assertEquals(0, solution.lengthOfLastWord("  "));
    }
}