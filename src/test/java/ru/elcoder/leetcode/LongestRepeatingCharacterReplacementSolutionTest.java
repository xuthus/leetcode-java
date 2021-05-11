package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestRepeatingCharacterReplacementSolutionTest {

    @Test
    public void characterReplacement() {
        final LongestRepeatingCharacterReplacementSolution solution = new LongestRepeatingCharacterReplacementSolution();
        assertEquals(5, solution.characterReplacement("ABABBAA", 2));
        assertEquals(7, solution.characterReplacement("ABABBAAAA", 2));
        assertEquals(3, solution.characterReplacement("ABABABA", 1));

    }
}
