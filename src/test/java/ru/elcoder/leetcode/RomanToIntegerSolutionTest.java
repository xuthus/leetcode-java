package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by xuthus on 01.05.2017.
 */
public class RomanToIntegerSolutionTest {

    @Test
    public void testRomanToInt() throws Exception {
        RomanToIntegerSolution solution = new RomanToIntegerSolution();

        assertEquals(1, solution.romanToInt("I"));
        assertEquals(2, solution.romanToInt("II"));
        assertEquals(3, solution.romanToInt("III"));
        assertEquals(4, solution.romanToInt("IV"));
        assertEquals(4, solution.romanToInt("IIII"));
        assertEquals(9, solution.romanToInt("IX"));
        assertEquals(11, solution.romanToInt("XI"));
        assertEquals(1954, solution.romanToInt("MCMLIV"));
        assertEquals(1990, solution.romanToInt("MCMXC"));
    }
}