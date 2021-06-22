package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZigZagConversionSolutionTest {

    @Test
    public void convert() {
        final ZigZagConversionSolution solution = new ZigZagConversionSolution();
        assertEquals("hello", solution.convert("hello", 1));
        assertEquals("a", solution.convert("a", 1));
        assertEquals("a", solution.convert("a", 10));
        assertEquals("abc", solution.convert("abc", 10));
        assertEquals("hloel", solution.convert("hello", 2));
        assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3));
        assertEquals("PINALSIGYAHRPI", solution.convert("PAYPALISHIRING", 4));
    }
}
