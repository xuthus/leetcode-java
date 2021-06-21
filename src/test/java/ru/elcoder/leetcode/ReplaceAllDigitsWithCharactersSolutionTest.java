package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceAllDigitsWithCharactersSolutionTest {

    @Test
    public void replaceDigits() {
        ReplaceAllDigitsWithCharactersSolution solution = new ReplaceAllDigitsWithCharactersSolution();
        assertEquals("ab", solution.replaceDigits("a1"));
        assertEquals("abc", solution.replaceDigits("a1c"));
        assertEquals("abcdef", solution.replaceDigits("a1c1e1"));
        assertEquals("abbdcfdhe", solution.replaceDigits("a1b2c3d4e"));
    }
}