package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by xuthus on 27.04.2017.
 */
public class ValidNumberTest {

    @Test
    public void testIsReal() throws Exception {
        ValidNumberSolution solution = new ValidNumberSolution();
        assertTrue(solution.isReal("1"));
        assertTrue(solution.isReal("100"));
        assertTrue(solution.isReal("-100"));
        assertTrue(solution.isReal("+100"));

        assertTrue(solution.isReal("3.14"));
        assertTrue(solution.isReal(".14"));
        assertFalse(solution.isReal("3.14.15"));
        assertTrue(solution.isReal("3."));

        assertFalse(solution.isReal(null));
        assertFalse(solution.isReal(""));
        assertFalse(solution.isReal("+100s"));
        assertFalse(solution.isReal("+1000000000000000000000000000000000000000000000000000")); // may be wrong
    }

    @Test
    public void testIsInteger() throws Exception {
        ValidNumberSolution solution = new ValidNumberSolution();

        assertTrue(solution.isSignedInteger("1", false));
        assertTrue(solution.isSignedInteger("100", false));
        assertTrue(solution.isSignedInteger("-100", false));
        assertTrue(solution.isSignedInteger("+100", false));

        assertFalse(solution.isSignedInteger(null, false));
        assertFalse(solution.isSignedInteger("", false));
        assertFalse(solution.isSignedInteger("+100s", false));
        assertFalse(solution.isSignedInteger("1000000000000000000000000000000000000000000000000000", false));
    }


    @Test
    public void testIsNumberOK() throws Exception {
        ValidNumberSolution solution = new ValidNumberSolution();
        assertFalse(solution.isNumber(""));
        assertFalse(solution.isNumber(" "));
        assertFalse(solution.isNumber(null));
        assertTrue(solution.isNumber("1"));
        assertTrue(solution.isNumber("100"));
        assertTrue(solution.isNumber(" 100"));
        assertTrue(solution.isNumber(" 100 "));
        assertTrue(solution.isNumber("100 "));
        assertTrue(solution.isNumber("-100.0"));
        assertTrue(solution.isNumber("+100.0"));
        assertTrue(solution.isNumber("3.14e1"));
        assertTrue(solution.isNumber("3e1"));
        assertTrue(solution.isNumber("3.14e-1"));
        assertTrue(solution.isNumber("3.14e+1"));
        assertTrue(solution.isNumber("-3.14e+1"));
        assertTrue(solution.isNumber("-0.14e+1"));
        assertTrue(solution.isNumber("100.0"));

        assertFalse(solution.isNumber("1a"));
        assertFalse(solution.isNumber("1 2"));
        assertFalse(solution.isNumber("1+2"));
        assertFalse(solution.isNumber("13.1e2.2"));
        assertFalse(solution.isNumber("13.1e"));

        assertTrue(solution.isNumber("13.1e2"));
        assertFalse(solution.isNumber("13.1e2e"));
        assertFalse(solution.isNumber("e2"));
        assertFalse(solution.isNumber("e2e"));
        assertFalse(solution.isNumber("e2e4"));
        assertFalse(solution.isNumber("0.."));
        assertFalse(solution.isNumber("..0"));
        assertFalse(solution.isNumber(".."));
        assertFalse(solution.isNumber("1.+1"));
        assertFalse(solution.isNumber("4e+"));
        assertFalse(solution.isNumber("4e++"));
        assertTrue(solution.isNumber("+.4"));
    }

    @Test
    public void testIsNumberInProgress() throws Exception {
        ValidNumberSolution solution = new ValidNumberSolution();

        assertFalse(solution.isNumber(" -."));
    }

    @Test
    public void testIsNumberFAIL() throws Exception {
        ValidNumberSolution solution = new ValidNumberSolution();

        assertFalse(solution.isNumber("1.1.1"));
        assertFalse(solution.isNumber("3e1e2"));
        assertTrue(solution.isNumber(".14e+1"));
        assertTrue(solution.isNumber("1."));
    }
}