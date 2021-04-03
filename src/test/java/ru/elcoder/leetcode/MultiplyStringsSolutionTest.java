package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyStringsSolutionTest {

    @Test
    public void multiply() {
        final MultiplyStringsSolution solution = new MultiplyStringsSolution();
        assertEquals("100", solution.multiply("10", "10"));
        assertEquals("9", solution.multiply("9", "1"));
        assertEquals("1089", solution.multiply("99", "11"));
        assertEquals("1185921", solution.multiply("1089", "1089"));
        assertEquals("0", solution.multiply("1089", "0"));
        assertEquals("0", solution.multiply("0", "11"));
        assertEquals("0", solution.multiply("0", "111044332"));
    }
}