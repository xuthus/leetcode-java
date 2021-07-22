package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class PushDominoesSolutionTest {

    @Test
    public void pushDominoes() {
        final PushDominoesSolution solution = new PushDominoesSolution();
        assertEquals("RR.L", solution.pushDominoes("RR.L"));
        assertEquals("LL.RR.LLRRLL..", solution.pushDominoes(".L.R...LR..L.."));
        assertEquals("LLLL", solution.pushDominoes("...L"));
        assertEquals("...R", solution.pushDominoes("...R"));
        assertEquals("...RRRR", solution.pushDominoes("...R..."));
        assertEquals("...R.L..", solution.pushDominoes("...R.L.."));
        assertEquals("RRRR.LLL", solution.pushDominoes("R..R.L.L"));
    }
}
