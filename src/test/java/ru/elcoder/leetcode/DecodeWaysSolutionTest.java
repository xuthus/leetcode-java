package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeWaysSolutionTest {

    @Test
    public void numDecodings() {
        final DecodeWaysSolution solution = new DecodeWaysSolution();
        assertEquals(1, solution.numDecodings("3"));
        assertEquals(2, solution.numDecodings("21"));
    }
}
