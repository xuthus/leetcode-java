package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.tools.Utils.array;

/**
 * Created by xuthus on 05.07.2017.
 */
public class ComplexNumberMultiplicationSolutionTest {

    @Test
    public void parseComplexNumber() throws Exception {
        ComplexNumberMultiplicationSolution solution = new ComplexNumberMultiplicationSolution();

        assertArrayEquals(array(0, 0), solution.parseComplexNumber("0+0i"));
        assertArrayEquals(array(1, 1), solution.parseComplexNumber("1+1i"));
        assertArrayEquals(array(10, 10), solution.parseComplexNumber("10+10i"));
        assertArrayEquals(array(100, 100), solution.parseComplexNumber("100+100i"));
        assertArrayEquals(array(-100, -100), solution.parseComplexNumber("-100+-100i"));
        assertArrayEquals(array(-10, -10), solution.parseComplexNumber("-10+-10i"));
        assertArrayEquals(array(-3, -2), solution.parseComplexNumber("-3+-2i"));
        assertArrayEquals(array(4, -5), solution.parseComplexNumber("4+-5i"));
        assertArrayEquals(array(-6, 7), solution.parseComplexNumber("-6+7i"));

        // not required
//        assertArrayEquals(array(4, -5), solution.parseComplexNumber("4-5i"));
//        assertArrayEquals(array(-10, -10), solution.parseComplexNumber("-10-10i"));
    }

    @Test
    public void isDigit() throws Exception {
        ComplexNumberMultiplicationSolution solution = new ComplexNumberMultiplicationSolution();

        for (char c = '0'; c <= '9'; c++)
            assertTrue(solution.isDigit(c));
        assertTrue(solution.isDigit('-'));
        assertFalse(solution.isDigit('+'));
        assertFalse(solution.isDigit('i'));
    }

    @Test
    public void multiplyComplexNumbers() throws Exception {
        ComplexNumberMultiplicationSolution solution = new ComplexNumberMultiplicationSolution();

        assertArrayEquals(array(0, 2), solution.multiplyComplexNumbers(array(1, 1), array(1, 1)));
        assertArrayEquals(array(0, -2), solution.multiplyComplexNumbers(array(1, -1), array(1, -1)));
        assertArrayEquals(array(0, 0), solution.multiplyComplexNumbers(array(0, 0), array(0, 0)));
        assertArrayEquals(array(143, 2), solution.multiplyComplexNumbers(array(7, 8), array(9, -10)));
    }

    @Test
    public void complexNumberMultiply() throws Exception {
        ComplexNumberMultiplicationSolution solution = new ComplexNumberMultiplicationSolution();

        assertEquals("0+2i", solution.complexNumberMultiply("1+1i", "1+1i"));
        assertEquals("0+-2i", solution.complexNumberMultiply("1+-1i", "1+-1i"));
        assertEquals("0+0i", solution.complexNumberMultiply("0+0i", "0+0i"));
        assertEquals("143+2i", solution.complexNumberMultiply("7+8i", "9+-10i"));
    }

    @Test
    public void complexNumberToString() throws Exception {
        ComplexNumberMultiplicationSolution solution = new ComplexNumberMultiplicationSolution();

        assertEquals("0+0i", solution.complexNumberToString(array(0, 0)));
        assertEquals("0+-2i", solution.complexNumberToString(array(0, -2)));
        assertEquals("0+0i", solution.complexNumberToString(array(-0, 0)));
        assertEquals("-7+-8i", solution.complexNumberToString(array(-7, -8)));
    }

}