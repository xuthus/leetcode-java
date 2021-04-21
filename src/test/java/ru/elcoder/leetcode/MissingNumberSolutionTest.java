package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class MissingNumberSolutionTest {

    @Test
    public void missingNumber() {
        final MissingNumberSolution solution = new MissingNumberSolution();
        assertEquals(0, solution.missingNumber(arrayOf(1, 2, 3)));
        assertEquals(2, solution.missingNumber(arrayOf(1, 0, 3)));
        assertEquals(3, solution.missingNumber(arrayOf(1, 0, 2)));
    }
}