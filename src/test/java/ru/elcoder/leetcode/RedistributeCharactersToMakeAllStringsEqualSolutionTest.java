package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class RedistributeCharactersToMakeAllStringsEqualSolutionTest {

    @Test
    public void makeEqual() {
        RedistributeCharactersToMakeAllStringsEqualSolution solution = new RedistributeCharactersToMakeAllStringsEqualSolution();
        assertTrue(solution.makeEqual(arrayOf("abc", "aabc", "cb")));
        assertFalse(solution.makeEqual(arrayOf("abd", "aabc", "cb")));
    }
}