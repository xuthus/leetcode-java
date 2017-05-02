package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by xuthus on 01.05.2017.
 */
public class IntegerToRomanSolutionTest {

    @Test
    public void testIntToRoman() throws Exception {
        IntegerToRomanSolution solution = new IntegerToRomanSolution();

        assertEquals("I", solution.intToRoman(1));
        assertEquals("II", solution.intToRoman(2));
        assertEquals("IV", solution.intToRoman(4));
        assertEquals("VII", solution.intToRoman(7));
        assertEquals("IX", solution.intToRoman(9));
        assertEquals("XII", solution.intToRoman(12));
        assertEquals("XIV", solution.intToRoman(14));
        assertEquals("XIX", solution.intToRoman(19));
        assertEquals("XXIV", solution.intToRoman(24));
        assertEquals("XXIV", solution.intToRoman(24));
        assertEquals("MCMXC", solution.intToRoman(1990));
        assertEquals("MMMDCCCLXXXVIII", solution.intToRoman(3888));
        assertEquals("MMMCMXCIX", solution.intToRoman(3999));
    }
}