package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class LongestConsecutiveSequenceSolutionTest {

    @Test
    public void longestConsecutive() {
        final LongestConsecutiveSequenceSolution solution = new LongestConsecutiveSequenceSolution();
        assertEquals(4, solution.longestConsecutive(arrayOf(1, 2, 3, 4)));
        assertEquals(4, solution.longestConsecutive(arrayOf(400, 1, 200, 2, 3, 4)));
    }
}
