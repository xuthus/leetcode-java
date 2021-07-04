package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivideTwoIntegersSolutionTest {

    @Test
    public void divide() {
        DivideTwoIntegersSolution solution = new DivideTwoIntegersSolution();
        assertEquals(1, solution.divide(-1, -1));
        assertEquals(-1, solution.divide(-10, 10));
        assertEquals(Integer.MIN_VALUE, solution.divide(Integer.MIN_VALUE, 1));
        assertEquals(Integer.MAX_VALUE, solution.divide(Integer.MIN_VALUE, -1));
    }
}