package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongerContiguousSegmentsOfOnesThanZerosSolutionTest {

    @Test
    public void checkZeroOnes() {
        final LongerContiguousSegmentsOfOnesThanZerosSolution solution = new LongerContiguousSegmentsOfOnesThanZerosSolution();
        assertTrue(solution.checkZeroOnes("1101"));
        assertFalse(solution.checkZeroOnes("111000"));
        assertFalse(solution.checkZeroOnes("110100010"));
    }
}
