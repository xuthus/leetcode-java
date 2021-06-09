package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckIfWordEqualsSummationOfTwoWordsSolutionTest {

    @Test
    public void isSumEqual() {
        final CheckIfWordEqualsSummationOfTwoWordsSolution solution = new CheckIfWordEqualsSummationOfTwoWordsSolution();
        assertTrue(solution.isSumEqual("acb", "cba", "cdb"));
        assertTrue(solution.isSumEqual("aaa", "a", "aaaaaa"));
        assertFalse(solution.isSumEqual("aaa", "a", "aab"));
    }
}
